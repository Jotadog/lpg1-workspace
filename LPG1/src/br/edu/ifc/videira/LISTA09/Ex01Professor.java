package br.edu.ifc.videira.LISTA09;

public class Ex01Professor extends Ex01Funcionario{
	public Ex01Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome,sobrenome,matricula,salario);
	}
	
	public double getSalarioPrimeiraParcela() {
		return super.getSalarioPrimeiraParcela() + super.getSalarioSegundaParcela();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
