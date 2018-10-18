package br.edu.ifc.videira.LISTA10;

public class Ex02Moto extends Ex02Veiculo {
	public void setValor(double valor) {
		super.setValor(valor);
		for (int i = 0; i < this.getAnos(); i++) {
			valor *= 0.92;
		}
		this.setValorNovo(valor);
	}
	
	public double ipva() {
		if(this.getAnos() < 5) {
			return this.getValorNovo() * 0.04;
		} else if (this.getAnos() > 5 && this.getAnos() < 10) {
			return this.getValorNovo() * 0.03;
		} else {
			return 0;
		}
	}
}
