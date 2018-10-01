package br.edu.ifc.videira.LISTA07;

public class Ex06Aluno {
	private int matricula;
	private String nome;
	private String email;
	private String curso;
	private int fone;
	private int cel;
	private String endereco;

	public Ex06Aluno() {
		this.matricula = 0;
		this.nome = "";
		this.email = "";
		this.curso = "";
		this.fone = 0;
		this.cel = 0;
		this.endereco = "";
	}
	
	public Ex06Aluno(int matricula, String nome, String email, String curso, int fone, int cel, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.fone = fone;
		this.cel = cel;
		this.endereco = endereco;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
