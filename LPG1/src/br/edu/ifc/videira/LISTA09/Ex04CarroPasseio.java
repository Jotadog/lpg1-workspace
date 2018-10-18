package br.edu.ifc.videira.LISTA09;

public class Ex04CarroPasseio extends Ex04Veiculo {
	private String cor;
	private String modelo;
	private int comprimento;

	public Ex04CarroPasseio() {
		this.cor = "";
		this.modelo = "";
		this.comprimento = 0;
	}

	public Ex04CarroPasseio(String cor, String modelo, int comprimento) {
		this.cor = cor;
		this.modelo = modelo;
		this.comprimento = comprimento;
	}

	public String imprime() {
		return super.imprime() + "\nCor: "+this.getCor()+"\nModelo: "+this.getModelo()+"\nComprimento: "+this.getComprimento();
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public double calculaValor() {
		return this.getPreco() * 0.85;
	}
}
