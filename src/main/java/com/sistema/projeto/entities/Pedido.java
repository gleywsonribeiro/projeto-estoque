package com.sistema.projeto.entities;

import java.util.Date;
import java.util.Objects;

public class Pedido {
	
	private Integer id;
	private String observacao;
	private Double valorTotal;
	private Date dataPedido;
	
	private Status status;
	private Pagamento pegamento; 
	
	private Cliente cliente = new Cliente();
	private ItemPedido itens; 
	
	
	public Pedido() {
		
	}

	public Pedido(Integer id, String observacao, Double valorTotal, Date dataPedido, Status status,
			Pagamento pegamento) {
		super();
		this.id = id;
		this.observacao = observacao;
		this.valorTotal = valorTotal;
		this.dataPedido = dataPedido;
		this.status = status;
		this.pegamento = pegamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Pagamento getPegamento() {
		return pegamento;
	}

	public void setPegamento(Pagamento pegamento) {
		this.pegamento = pegamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ItemPedido getItens() {
		return itens;
	}

	public void setItens(ItemPedido itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

}