package br.edu.ifc.videira.LISTA06;

public class Ex03 {
	private double salMin;
	private double quilowatts;

	public double getSalMin() {
		return salMin;
	}

	public void setSalMin(double salMin) {
		this.salMin = salMin;
	}

	public double getQuilowatts() {
		return quilowatts;
	}

	public void setQuilowatts(double quilowatts) {
		this.quilowatts = quilowatts;
	}

	private double valQuilowatt() {
		double valor = (this.getSalMin() / 7) / 100;
		return valor;
	}

	public double conta() {
		double valor = this.valQuilowatt() * this.getQuilowatts();
		return valor;
	}

	public double desconto() {
		double valor = this.conta() * 0.9;
		return valor;
	}
}
