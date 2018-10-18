package br.edu.ifc.videira.LISTA10;

public class Ex04Amigo extends Ex04Pessoa {
	private int numeroPessoal;

	public int getNumeroPessoal() {
		return numeroPessoal;
	}

	public void setNumeroPessoal(int numeroPessoal) {
		this.numeroPessoal = numeroPessoal;
	}

	public String assinaturaEmail() {
		return "Abraços. " + this.getNome();
	}

	public String imprime() {
		return super.imprime() + "Numero pessoal: " + this.getNumeroPessoal() + "\nAssinatura de email: "
				+ this.assinaturaEmail();
	}
}
