package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Produto {
	private int codigo;
	private String descricao;
	private double valor;

	public Ex07Produto(int codigo, String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do produto: \nCodigo: " + this.getCodigo() + "\nDescricao: "
				+ this.getDescricao() + "\nValor:" + this.getValor());
	}

}
