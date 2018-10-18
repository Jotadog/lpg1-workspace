package br.edu.ifc.videira.LISTA09;

public class Ex03Peixe extends Ex03Animal {
	private String caracteristica;

	public Ex03Peixe(String animal, double comprimento, String cor,  double velocidade, String caracteristica) {
		super(animal, comprimento, 0, cor, "Mar", velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String printAnimal() {
		String result;
		result = super.printAnimal();
		return result + "\nCaracteristica: " + this.getCaracteristica();
	}
}
