package br.projetoestoque.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
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
