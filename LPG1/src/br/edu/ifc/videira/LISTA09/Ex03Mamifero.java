package br.edu.ifc.videira.LISTA09;

public class Ex03Mamifero extends Ex03Animal{
	private String alimento;

	public Ex03Mamifero(String animal, double comprimento, int patas, String cor, String ambiente, double velocidade,String alimento) {
		super(animal, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String printAnimal() {
		String result;
		result = super.printAnimal();
		return result + "\nAlimento: "+this.getAlimento();
	}
}
