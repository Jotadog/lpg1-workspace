package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10], cont = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Coloque um valor");
			vetor[i] = Integer.parseInt(in.nextLine());
		}

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					cont++;
				}
			}
			if (cont > 1) {
				System.out.println(vetor[i]);
			}
			cont = 0;
		}

		in.close();
	}
}
