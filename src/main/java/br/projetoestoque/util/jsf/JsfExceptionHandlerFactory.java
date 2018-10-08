package br.projetoestoque.util.jsf;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;
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
public class JsfExceptionHandlerFactory extends ExceptionHandlerFactory {
	private ExceptionHandlerFactory parent;
	
	 public JsfExceptionHandlerFactory(ExceptionHandlerFactory parent) {
		this.parent = parent;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		return new JsfExceptionHandler(parent.getExceptionHandler() );
	}
	

}
