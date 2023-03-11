package com.aula.produto;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal quantidade;
	private BigDecimal valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String exibirProduto() {
		return "Produto: " + this.nome + "\n quantidade: " + this.quantidade + "\n valor: " + this.valor;
	}

}
