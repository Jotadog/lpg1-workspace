package br.edu.ifc.videira.LISTA08;

public class Ex02AssistenteTecnico extends Ex01Funcionario{

	public Ex02AssistenteTecnico() {}
	
	public double calculaSalario() {
		return this.getSalario() * 1.2;
	}
	
}
