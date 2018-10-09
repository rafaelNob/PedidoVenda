//package br.projetoestoque.model;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//
//public class ItemPedido implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	private long id;
//	private Integer quantidade;
//	private BigDecimal valorUnitario;
//	private Produto produto;
//	private Pedido pedido;
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public Integer getQuantidade() {
//		return quantidade;
//	}
//
//	public void setQuantidade(Integer quantidade) {
//		this.quantidade = quantidade;
//	}
//
//	public BigDecimal getValorUnitario() {
//		return valorUnitario;
//	}
//
//	public void setValorUnitario(BigDecimal valorUnitario) {
//		this.valorUnitario = valorUnitario;
//	}
//
//	public Produto getProduto() {
//		return produto;
//	}
//
//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}
//
//	public Pedido getPedido() {
//		return pedido;
//	}
//
//	public void setPedido(Pedido pedido) {
//		this.pedido = pedido;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (id ^ (id >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ItemPedido other = (ItemPedido) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//
//}
