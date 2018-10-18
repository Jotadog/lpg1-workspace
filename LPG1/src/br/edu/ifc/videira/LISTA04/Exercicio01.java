package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vetor = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("");
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		for (int o = 4; o >= 0; o--) {
			System.out.println(vetor[o]);
		}
		in.close();
	}
}
