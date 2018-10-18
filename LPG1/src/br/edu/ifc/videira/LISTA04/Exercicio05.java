package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[40];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(in.nextLine());
			if(vetor[i] < 0) {
				vetor[i] = 0;
			}
			System.out.println(vetor[i]);
		}
		in.close();
	}
}
