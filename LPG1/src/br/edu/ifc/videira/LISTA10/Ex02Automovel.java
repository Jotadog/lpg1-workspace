package br.edu.ifc.videira.LISTA10;

public class Ex02Automovel extends Ex02Veiculo{
	public void setValor(double valor) {
		super.setValor(valor);
		for (int i = 0; i < this.getAnos(); i++) {
			valor *= 0.95;
		}
		this.setValorNovo(valor);
	}
	
	public double seguro() {
		if(this.getAnos() <= 5) {
			return this.getValorNovo() * 0.045;
		} else if(this.getAnos() > 5 && this.getAnos() < 10) {
			return this.getValorNovo() * 0.05;
		} else {
			return this.getValorNovo() * 0.055;
		}
	}
	
	public double ipva() {
		if(this.getAnos() < 10) {
			return this.getValorNovo() * 0.05;
		} else if (this.getAnos() > 10 && this.getAnos() < 20) {
			return this.getValorNovo() * 0.04;
		} else {
			return 0;
		}
	}
}
