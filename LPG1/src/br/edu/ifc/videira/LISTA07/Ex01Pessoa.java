package br.edu.ifc.videira.LISTA07;

public class Ex01Pessoa {
	private String nome;
	private int idade;

	public Ex01Pessoa() {
	}

	public void setIdade(int valor) {
		this.idade = valor;
	}

	public void fazAniversario() {
		this.setIdade(this.getIdade() + 1);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
