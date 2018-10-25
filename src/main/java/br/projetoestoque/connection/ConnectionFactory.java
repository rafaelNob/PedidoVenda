package br.projetoestoque.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	private static EntityManagerFactory emf = null;
	static {
		if(emf == null) {
			
			emf = Persistence.createEntityManagerFactory("pedido");
		}
		
	}
	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}


}
