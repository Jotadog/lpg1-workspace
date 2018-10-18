package br.edu.ifc.videira.LISTA10;

public class Ex01Notebook extends Ex01Computador {
	private double carregador;
	private double pasta;

	public Ex01Notebook(double placaMae, double processador, double hd, double memoria, double placaVideo, int volumes,
			int garantia, double carregador, double pasta) {
		super(placaMae, processador, hd, memoria, placaVideo, volumes, garantia);
		this.carregador = carregador;
		this.pasta = pasta;
	}

	public Ex01Notebook() {
	}

	public String imprime() {
		return "Dados do notebook:\n\n" + this.getConfig() + "\n\nValor total: R$ " + this.calculaValor();
	}

	public double calculaValor() {
		return super.calculaValor() + this.carregador + this.pasta + 800;
	}

	public double calculaGarantia() {
		return this.calculaValor() * 1.12;
	}
	
	public double getCarregador() {
		return carregador;
	}

	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}

}
