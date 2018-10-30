package br.projetoestoque.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.projetoestoque.model.Categoria;
import br.projetoestoque.model.Produto;
import br.projetoestoque.repository.CategoriaRepository;

@Named
@ConversationScoped
public class CadastroProdutoBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	private List<Categoria> categoriaRaizes;
	@Inject
	private CategoriaRepository categoria;
	public CadastroProdutoBean() {
		produto = new Produto();
	}
	
	
	public void initializar() {
		
		
		categoriaRaizes = categoria.raizes();
		
		
	}
	public Produto getProduto() {
		return produto;
	}
	public List<Categoria> getCategoriaRaizes() {
		return categoriaRaizes;
	}

}
