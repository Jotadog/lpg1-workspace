package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Eletrodomestico extends Ex07Produto {
	private double voltagem;

	public Ex07Eletrodomestico(int codigo, String descricao, double valor, double voltagem) {
		super(codigo, descricao, valor);
		this.voltagem = voltagem;
	}

	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do produto: \nCodigo: " + this.getCodigo() + "\nDescricao: "
				+ this.getDescricao() + "\nValor:" + this.getValor() + "\nVoltagem: " + this.getVoltagem());
	}
}
