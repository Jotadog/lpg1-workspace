package br.edu.ifc.videira.LISTA08;

public class Ex06Velho extends Ex06Imovel {
	private double desconto;

	public Ex06Velho(String endereco, double preco, double desconto) {
		super(endereco, preco - desconto);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
