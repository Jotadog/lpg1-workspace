package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double comp, voltas, reabast, consumo, minLitros;
		System.out.println("Digite o comprimento da pista em Km");
		comp = Double.parseDouble(in.nextLine());
		System.out.println("Digite o numero de voltas");
		voltas = Double.parseDouble(in.nextLine());
		System.out.println("Digite o numero de reabastecimentos");
		reabast = Double.parseDouble(in.nextLine());
		System.out.println("Digite o consumo do carro");
		consumo = Double.parseDouble(in.nextLine());

		minLitros = (comp * voltas) / consumo / (reabast + 1);

		System.out.println("Quantidade de litros necessaria: " + (int) (minLitros + 1));

		in.close();
	}
}
