package br.edu.ifc.videira.LISTA07;

public class Ex03Professor {
	private String professor;
	private String nomeDepartamento;
	private int registro;
	private String dataAdmissao;
	
	public Ex03Professor() {
		this.professor = "Nome";
		this.nomeDepartamento = "Departamento";
		this.registro = 0;
		this.dataAdmissao = "XX/XX/XXXX";
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
}
