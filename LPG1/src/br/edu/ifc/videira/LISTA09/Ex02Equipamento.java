package br.edu.ifc.videira.LISTA09;

public class Ex02Equipamento {
	private boolean ligado;
	
	public void liga() {
		this.ligado = true;
	}
	
	public void desliga() {
		this.ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}	
}
