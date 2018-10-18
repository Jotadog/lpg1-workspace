package br.edu.ifc.videira.LISTA07;

public class Ex02Porta {
	private boolean estado;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;

	public Ex02Porta() {
		this.setCor("Braca");
		this.setDimensaoX(1.5);
		this.setDimensaoY(3);
		this.setDimensaoZ(0.2);
	}
	
	public void abrir() {
		this.setEstado(true);;
	}

	public void fechar() {
		this.setEstado(false);
	}

	public String estaAberta() {
		String _estado;
		if (this.estado) {
			_estado = "Aberta";
		} else {
			_estado = "Fechada";
		}
		return _estado;
	}

	public void pintar(String cor) {
		this.setCor(cor);
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	
	
}
