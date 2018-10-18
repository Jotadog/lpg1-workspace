package br.edu.ifc.videira.LISTA10;

public class Ex02Caminhao extends Ex02Veiculo{
	private double toneladas;
		
	public double getToneladas() {
		return toneladas;
	}

	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}

	public void setValor(double valor) {
		super.setValor(valor);
		for (int i = 0; i < this.getAnos(); i++) {
			valor *= 0.965;
		}
		this.setValorNovo(valor);
	}
	
	public double seguro() {
		return 500 * this.getToneladas()/10;
	}
	
	public double ipva() {
		if(this.getAnos() > 15) {
			return 0;
		} else {
			if(this.getToneladas() < 50) {
				return this.getValorNovo() * 0.04;
			} else {
				return this.getValorNovo() * 0.03;
			}
		}
	}
}
