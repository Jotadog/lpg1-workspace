package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[16];
		int copia[] = new int[16];
		System.out.println();
		for (int i = 0; i < 16; i++) {
			vetor[i] = Integer.parseInt(in.nextLine());
			copia[i] = vetor[i];
		}
		for (int i = 0, j = 8; i < 8; i++, j++) {
			vetor[i] = copia[j];
			vetor[j] = copia[i];
		}
		for (int i = 0; i < 16; i++) {
			System.out.println(vetor[i]);
		}
		in.close();
	}
}
