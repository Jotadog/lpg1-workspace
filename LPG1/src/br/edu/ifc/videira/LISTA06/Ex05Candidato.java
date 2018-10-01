package br.edu.ifc.videira.LISTA06;

public class Ex05Candidato {
	private String nome;
	private int votos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void incrementar() {
		this.setVotos(this.getVotos()+1);
	}
}
