package br.edu.ifc.videira.LISTA08;

public class Ex01Funcionario {
	private String nome;
	private double salario;
	private String cargo;

	public Ex01Funcionario() {
		
	}

	public Ex01Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public double calculaSalario() {
		return this.getSalario();
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
