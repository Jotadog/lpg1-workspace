package br.edu.ifc.videira.LISTA10;

public class Ex04ColegaTrabalho extends Ex04Pessoa{
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String assinaturaEmail() {
		return "Att. "+this.getNome();
	}
	
	public String imprime() {
		return super.imprime()+"Setor: "+this.getSetor()+"\nAssinatura de email: "+this.assinaturaEmail();
	}
}
