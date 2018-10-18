package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio11 {
	public static void main(String[] args) {
		Random rand = new Random();
		int max = 10;
		int meses[][] = new int[12][max];
		int quantidade1 = 0;
		int quantidade2 = 0;

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < max; j++) {
				meses[i][j] = rand.nextInt(9);
				System.out.println("Mes [" + (i + 1) + "] - Produto [" + (j + 1) + "]: " + meses[i][j]);
				if (i < 6) {
					quantidade1 += meses[i][j];
				} else {
					quantidade2 += meses[i][j];
				}
			}
			System.out.println();
		}

		System.out.println("Quantidade 1 semestre: " + quantidade1);
		System.out.println("Quantidade 2 semestre: " + quantidade2);
	}
}
