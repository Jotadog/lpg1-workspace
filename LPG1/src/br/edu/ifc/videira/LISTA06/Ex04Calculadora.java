package br.edu.ifc.videira.LISTA06;

public class Ex04Calculadora {
	public int numero1;
	public int numero2;

	public int retornaSomaAtributos() {
		return this.numero1 + this.numero2;
	}

	public int retornaMultiplicacaoAtributos() {
		return this.numero1 * this.numero2;
	}

	public void insereValoresAtributos(int n1, int n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
}
