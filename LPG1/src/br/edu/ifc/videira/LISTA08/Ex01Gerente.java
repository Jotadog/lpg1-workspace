package br.edu.ifc.videira.LISTA08;

public class Ex01Gerente extends Ex01Funcionario{
	
	public Ex01Gerente() {}
	
	public double calculaGerente() {
		return this.getSalario() * 1.5;
	}
}
