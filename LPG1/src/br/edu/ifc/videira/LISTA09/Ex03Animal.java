package br.edu.ifc.videira.LISTA09;

public class Ex03Animal {
	private String animal;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;

	public Ex03Animal(String animal, double comprimento, int patas, String cor, String ambiente, double velocidade) {
		this.animal = animal;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public String getAnimal() {
		return animal;
	}

	public double getComprimento() {
		return comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public String getCor() {
		return cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public String printAnimal() {
		return "Animal: "+this.getAnimal()+"\n"
				+ "Comprimento: "+this.getComprimento()+"\n"
						+ "Patas: "+this.getPatas()+"\n"
								+ "Ambiente: "+this.getAmbiente()+"\n"
										+ "Velocidade: "+this.getVelocidade()+"\n";
	}
}
