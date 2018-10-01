package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Roupa extends Ex07Produto {
	private String tamanho;
	private String cor;

	public Ex07Roupa(int codigo, String descricao, double valor, String tamanho, String cor) {
		super(codigo, descricao, valor);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null,
				"Dados do produto: \nCodigo: " + this.getCodigo() + "\nDescricao: " + this.getDescricao() + "\nValor:"
						+ this.getValor() + "\nTamanho: " + this.getTamanho() + "\nCor: " + this.getCor());
	}
}
