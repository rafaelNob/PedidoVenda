package teste;

import javax.persistence.EntityManager;

import br.projetoestoque.connection.ConnectionFactory;
import br.projetoestoque.model.Cliente;
import br.projetoestoque.model.Endereco;
import br.projetoestoque.model.TipoPessoa;



public class Teste {
	public static void main(String[] args) {
		Endereco end = new Endereco();
		Endereco end2 = new Endereco();
		Cliente cli = new Cliente();
		end.setCidade("sp");
		end.setCep("03111");
		end.setLogradouro("das couves");
		end.setUf("sp");
		end2.setCidade("sp");
		end2.setCep("03111");
		end2.setLogradouro("das couves");
		end2.setUf("sp");
		cli.setNome("ABCDEF	");
		cli.setDocumentoReceitaFederal("dsadsdsa");
		cli.setEmail("@oo@");
		cli.setTipo(TipoPessoa.JURIDICA);
		cli.getEnderecos().add(end);
		cli.getEnderecos().add(end2);
		end.setCliente(cli);
		end2.setCliente(cli);
//		EntityManager em = ConnectionFactory.getConnection();
//		
//		
//		em.getTransaction().begin();
//		
//		em.persist(cli);
//	
//	
//		em.getTransaction().commit();
//		em.close();
	}

}
