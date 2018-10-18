package br.edu.ifc.videira.LISTA07;

public class Ex04Computador {
	private double processador;
	private double memoria;
	private double hd;
	private double monitor;
	private double placa;
	private String config;

	public Ex04Computador() {
		this.processador = 0;
		this.memoria = 0;
		this.hd = 0;
		this.monitor = 0;
		this.placa = 0;
		this.config = "";
	}
	
	public double getPlaca() {
		return placa;
	}

	public void setPlaca(double placa) {
		this.placa = placa;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config += config;
	}

	public double calculaPreco() {
		return this.getHd() + this.getMemoria() + this.getMonitor() + this.getProcessador() + this.getPlaca();
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

}
