package br.projetoestoque.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.projetoestoque.util.jsf.NegocioException;

@ManagedBean
public class CadastroPedidoBean {
	private List<Integer> produtosFiltrados = new ArrayList<>();
	
	public CadastroPedidoBean() {
		
			produtosFiltrados.add(1);
		
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
	
	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois não foi implementado!");
	}
}
