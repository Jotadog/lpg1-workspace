package br.edu.ifc.videira.LISTA09;

public class Ex04Veiculo {
	private int peso;
	private int velocMax;
	private double preco;

	public Ex04Veiculo() {
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0;
	}

	public String imprime() {
		return "Peso: "+this.getPeso()+"\nVelocidade maxima: "+this.getVelocMax()+"\nPreco: "+this.getPreco()+"\n";
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calculaValor() {
		return this.getPreco() * 0.9;
	}
}
