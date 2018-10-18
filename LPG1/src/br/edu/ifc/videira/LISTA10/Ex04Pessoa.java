package br.edu.ifc.videira.LISTA10;

abstract class Ex04Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private String email;

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected String getSexo() {
		return sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	protected String imprime() {
		return "Nome: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nSexo: "+this.getSexo()+
				"\nEmail: "+this.getEmail()+"\n";
	}

}
