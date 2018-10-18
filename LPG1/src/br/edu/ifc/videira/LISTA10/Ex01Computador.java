package br.edu.ifc.videira.LISTA10;

public class Ex01Computador {
	private double placaMae;
	private double processador;
	private double hd;
	private double memoria;
	private double placaVideo;
	private int volumes;
	private double garantia;
	private String config = "";

	public Ex01Computador(double placaMae, double processador, double hd, double memoria, double placaVideo,
			int volumes, int garantia) {
		this.placaMae = placaMae;
		this.processador = processador;
		this.hd = hd;
		this.memoria = memoria;
		this.placaVideo = placaVideo;
		this.volumes = volumes;
		this.garantia = garantia;
	}

	public Ex01Computador() {

	}

	public String imprime() {
		return "Placa mae: R$" + this.getPlacaMae() + "\n" + "Processador: R$" + this.getProcessador() + "\n" + "HD: R$"
				+ this.getHd() + "\n" + "Memoria: R$" + this.getMemoria() + "\n" + "Placa de video: R$"
				+ this.getPlacaVideo() + "\n" + "Volumes: " + this.getVolumes() + "\n" + "Garantia: "
				+ this.getGarantia();
	}

	public double calculaValor() {
		return this.getPlacaMae() + this.getProcessador() + this.getHd() + this.getMemoria() + this.getPlacaVideo()
				+ this.getVolumes() + this.getGarantia();
	}

	public double getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public double getGarantia() {
		return garantia;
	}

	public void setGarantia(double garantia) {
		this.garantia = garantia;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config += config;
	}

	public void zera() {
		this.config = "";
	}
	
}
