package br.edu.ifc.videira.LISTA09;

public class Ex01Pessoa {
	private String nome;
	private String sobrenome;

	public Ex01Pessoa() {

	}

	public Ex01Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}
}
