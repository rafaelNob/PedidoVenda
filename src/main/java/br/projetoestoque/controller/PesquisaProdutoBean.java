package br.projetoestoque.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PesquisaProdutoBean {
	private List<Integer> produtosFiltrados = new ArrayList<>();
	
	public PesquisaProdutoBean() {
		for (int i = 0; i < 50; i++) {
			produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
