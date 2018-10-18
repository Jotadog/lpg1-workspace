package br.edu.ifc.videira.LISTA09;

public class Ex01Funcionario extends Ex01Pessoa {
	private int matricula;
	private double salario;

	public Ex01Funcionario() {
		super();
	}

	public Ex01Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioPrimeiraParcela() {
		return this.getSalario() * 0.6;
	}

	public double getSalarioSegundaParcela() {
		return this.getSalario() * 0.4;
	}

}
