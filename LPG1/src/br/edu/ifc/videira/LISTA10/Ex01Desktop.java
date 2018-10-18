package br.edu.ifc.videira.LISTA10;

public class Ex01Desktop extends Ex01Computador {
	private double estabilizador;
	private double teclado;

	public Ex01Desktop(double placaMae, double processador, double hd, double memoria, double placaVideo, int volumes,
			int garantia, double estabilizador, double teclado) {
		super(placaMae, processador, hd, memoria, placaVideo, volumes, garantia);
		this.estabilizador = estabilizador;
		this.teclado = teclado;
	}

	public Ex01Desktop() {}
	
	public String imprime() {
		return "Dados do desktop:\n\n" + this.getConfig() + "\n\nValor total: R$ " + this.calculaValor();
	}

	public double calculaValor() {
		return this.estabilizador + this.teclado + super.calculaValor();
	}
	
	public double calculaGarantia() {
		return this.calculaValor() * 1.1;
	}

	public double getEstabilizador() {
		return estabilizador;
	}

	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}

	public double getTeclado() {
		return teclado;
	}

	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}

}
