package br.edu.ifc.videira.LISTA10;

import javax.swing.JOptionPane;

public class Ex03Calculadora {
	private double ap;
	private double lp;
	private double a;
	private double la;

	public double calculaAzulejos(int tipo) {
		return (this.getAp() * this.getLp()) / this.areaAzulejo(tipo);
	}
	
	private double areaAzulejo(int tipo) {
		double area = 0;
		switch (tipo) {
		case 0:
			area = this.getLa() * this.getLa();
			break;
		case 1:
			area = this.getA() * this.getLa();
			break;
		case 2:
			area = (this.getLa() * this.getLa()) / 2;
			break;
		case 3:
			area = (this.getLa() * this.getA()) / 2;
			break;
		}
		return area;
	}

	public double getAp() {
		return ap;
	}

	public void setAp(double ap) {
		this.ap = ap;
	}

	public double getLp() {
		return lp;
	}

	public void setLp(double lp) {
		this.lp = lp;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getLa() {
		return la;
	}

	public void setLa(double la) {
		this.la = la;
	}

}
