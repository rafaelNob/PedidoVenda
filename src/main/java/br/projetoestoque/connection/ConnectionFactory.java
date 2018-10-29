package br.projetoestoque.connection;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class ConnectionFactory {
	private static EntityManagerFactory emf = null;
	
	
	public ConnectionFactory() {
		emf = Persistence.createEntityManagerFactory("pedido");
		
	}
	
	@Produces @RequestScoped
	public EntityManager createEntityManager() {
		 return emf.createEntityManager();
	}
	/*
	 * Dispose é um gatilho pra que qndo o em for finalizado ele finaliza a conexão
	 * */
	public void coseEntityManager(@Disposes EntityManager em) {
		em.close();
	}

}
