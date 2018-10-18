package br.edu.ifc.videira.LISTA08;

public class Ex04CamaroteSuperior extends Ex04VIP {
	private String localizacao;
	private double adicionalCamarote;

	public Ex04CamaroteSuperior(double valor, double adicional, double adicionalCamarote) {
		super(valor, adicional + adicionalCamarote);
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getAdicionalCamarote() {
		return adicionalCamarote;
	}

	public void setAdicionalCamarote(double adicionalCamarote) {
		this.adicionalCamarote = adicionalCamarote;
	}

}
