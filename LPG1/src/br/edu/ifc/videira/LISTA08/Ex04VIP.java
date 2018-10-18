package br.edu.ifc.videira.LISTA08;

public class Ex04VIP extends Ex04Ingresso {
	private double adicional;

	public Ex04VIP(double valor, double adicional) {
		super(valor + adicional);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}
}
