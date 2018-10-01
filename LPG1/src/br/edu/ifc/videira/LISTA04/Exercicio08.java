package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio08 {
	public static void main(String[] args) {
		Random r = new Random();
		int vetor[] = new int[50];
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(10);
			System.out.print(vetor[i] + " ");
		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] == 0) {
					aux = vetor[j + 1];
					vetor[j+1] = 0;
					vetor[j] = aux;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
