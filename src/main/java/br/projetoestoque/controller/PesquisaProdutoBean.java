package br.projetoestoque.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;




@Named
@ConversationScoped
public class PesquisaProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Integer> produtosFiltrados = new ArrayList<>();
	private String recebeValor;
	
	public String getRecebeValor() {
		System.out.println(recebeValor);
		return recebeValor;
	}

	public void setRecebeValor(String recebeValor) {
		this.recebeValor = recebeValor;
	}

	public void setProdutosFiltrados(List<Integer> produtosFiltrados) {
		this.produtosFiltrados = produtosFiltrados;
	}

	public PesquisaProdutoBean() {
		for (int i = 0; i < 50; i++) {
			produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
