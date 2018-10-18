package br.edu.ifc.videira.LISTA08;

public class Ex01AssistenteTecnico extends Ex01Funcionario{

	public Ex01AssistenteTecnico() {}
	
	public double calculaAssistTec() {
		return this.getSalario() * 1.2;
	}
	
}
