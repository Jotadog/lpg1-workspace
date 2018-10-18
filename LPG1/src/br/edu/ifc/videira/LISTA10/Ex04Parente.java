package br.edu.ifc.videira.LISTA10;

public class Ex04Parente extends Ex04Pessoa {
	private String parentesco;

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String assinaturaEmail() {
		return "Até mais. " + this.getNome();
	}

	public String imprime() {
		return super.imprime() + "Parentesco: " + this.getParentesco() + "\nAssinatura de email: "
				+ this.assinaturaEmail();
	}
}
