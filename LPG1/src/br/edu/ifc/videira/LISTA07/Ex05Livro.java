package br.edu.ifc.videira.LISTA07;

public class Ex05Livro {
	private String titulo;
	private String autor;
	private int ano;

	public Ex05Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
}
