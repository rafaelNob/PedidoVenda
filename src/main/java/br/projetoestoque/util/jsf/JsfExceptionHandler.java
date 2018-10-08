package br.projetoestoque.util.jsf;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

/**
 * 
 * @author rnfranca
 * 
 *         Class tratador de Excessões impacotado
 */
public class JsfExceptionHandler extends ExceptionHandlerWrapper {
	private ExceptionHandler wapped;

	public JsfExceptionHandler(ExceptionHandler wapped) {
		this.wapped = wapped;
	}

	@Override
	public ExceptionHandler getWrapped() {
		return null;
	}

	@Override
	public void handle() throws FacesException {
		Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents().iterator();
		while (events.hasNext()) {
			ExceptionQueuedEvent event = events.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
			Throwable exception = context.getException();
			try {
				if (exception instanceof ViewExpiredException) {
					redirect("/");
				}
			} finally {
				events.remove();
			}
		}
		
		getWrapped().handle();

	}

	/**
	 * Redireciona o erro
	 * 
	 * @param page
	 */

	private void redirect(String page) {

		try {
			FacesContext facesContex = FacesContext.getCurrentInstance();
			ExternalContext external = facesContex.getExternalContext();
			String contextPath = external.getRequestContextPath();

			external.redirect(contextPath + page);
			facesContex.responseComplete();
		} catch (IOException e) {
			throw new FacesException(e);
		}

	}

}
