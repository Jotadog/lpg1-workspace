package br.edu.ifc.videira.LISTA05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase, nova[];
		StringBuilder result = new StringBuilder();

		System.out.println("Coloque uma frase");
		frase = String.valueOf(in.nextLine());

		nova = frase.split(" ");

		for (int i = nova.length - 1; i >= 0; i--) {
			result.append(nova[i] + " ");
		}
		System.out.println(result);
		in.close();
	}
}
