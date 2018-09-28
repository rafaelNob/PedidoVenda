package br.projetoestoque.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroPedidoBean {
	private List<Integer> produtosFiltrados = new ArrayList<>();
	
	public CadastroPedidoBean() {
		
			produtosFiltrados.add(1);
		
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
