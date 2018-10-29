package br.projetoestoque.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import br.projetoestoque.model.EnderecoEntrega;
import br.projetoestoque.model.Pedido;
import br.projetoestoque.util.jsf.NegocioException;

@Named
@ConversationScoped
public class CadastroPedidoBean implements Serializable {
	
	private static final long serialVersionUID = -7134062374180401449L;
	private List<Integer> produtosFiltrados = new ArrayList<>();
	private Pedido pedido;
	
	public CadastroPedidoBean() {
		
			produtosFiltrados.add(1);
			pedido = new Pedido();
			pedido.setEnderecoEntrega(new EnderecoEntrega());
		
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
	
	public Pedido getPedido() {
		return pedido;
	}



	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois não foi implementado!");
	}
}
