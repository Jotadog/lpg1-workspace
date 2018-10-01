package br.edu.ifc.videira.LISTA08;

public class Ex04Ingresso {
	private double valor;

	public Ex04Ingresso(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String imprime(String tipo) {
		return "Ingresso " + tipo + " R$" + this.getValor();
	}

}
