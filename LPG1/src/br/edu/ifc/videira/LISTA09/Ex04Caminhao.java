package br.edu.ifc.videira.LISTA09;

public class Ex04Caminhao extends Ex04Veiculo {
	private int toneladas;
	private int alturaMax;
	private int comprimento;

	public Ex04Caminhao() {
		this.toneladas = 0;
		this.alturaMax = 0;
		this.comprimento = 0;
	}

	public Ex04Caminhao(int toneladas, int alturaMax, int comprimento) {
		this.toneladas = toneladas;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}

	public String imprime() {
		return super.imprime() + "\nToneladas: " + this.getToneladas() + "\nAltura maxima: " + this.getAlturaMax()
				+ "\nComprimento: " + this.getComprimento();
	}

	public int getToneladas() {
		return toneladas;
	}

	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public double calculaValor() {
		return this.getPreco() * 0.80;
	}

}
