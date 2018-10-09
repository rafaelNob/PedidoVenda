package teste;

import javax.persistence.EntityManager;

import br.projetoestoque.controller.Fabrica;
import br.projetoestoque.model.Cliente;



public class Teste {
	public static void main(String[] args) {
		EntityManager em = Fabrica.getConnection();
		Cliente cliente = new Cliente();
		cliente.setNome("CARLÃOOO	");
		em.getTransaction().begin();
		
		em.persist(cliente);
	
	
		em.getTransaction().commit();
		em.close();
	}

}
