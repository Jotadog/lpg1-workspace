package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Alimento extends Ex07Produto {
	private String tipo;

	public Ex07Alimento(int codigo, String descricao, double valor, String tipo) {
		super(codigo, descricao, valor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do produto: \nCodigo: " + this.getCodigo() + "\nDescricao: "
				+ this.getDescricao() + "\nValor:" + this.getValor() + "\nTipo: " + this.getTipo());
	}
}
