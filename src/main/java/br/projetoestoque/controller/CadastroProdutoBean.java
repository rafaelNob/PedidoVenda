package br.projetoestoque.controller;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import br.projetoestoque.model.Produto;

@Named
@ConversationScoped
public class CadastroProdutoBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	public CadastroProdutoBean() {
		produto = new Produto();
	}
	public Produto getProduto() {
		return produto;
	}

}
