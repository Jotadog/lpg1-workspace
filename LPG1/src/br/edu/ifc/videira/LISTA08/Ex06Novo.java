package br.edu.ifc.videira.LISTA08;

public class Ex06Novo extends Ex06Imovel {
	private double adicional;

	public Ex06Novo(String endereco, double preco, double adicional) {
		super(endereco, preco + adicional);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}
