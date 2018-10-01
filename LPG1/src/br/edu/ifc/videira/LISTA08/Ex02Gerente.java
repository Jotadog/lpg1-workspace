package br.edu.ifc.videira.LISTA08;

public class Ex02Gerente extends Ex01Funcionario{
	
	public Ex02Gerente() {}
	
	public double calculaSalario() {
		return this.getSalario() * 1.5;
	}
}
