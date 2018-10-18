package br.edu.ifc.videira.LISTA05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase, sem;
		String[] part;
		int cont = 0;

		System.out.println("Coloque uma frase");
		frase = String.valueOf(in.nextLine());
		sem = frase.replace(" ", "");
		System.out.println(sem);
		part = sem.split("");
		for (int i = 0, j = part.length - 1; i < (part.length / 2); i++, j--) {
			if (part[i].equals(part[j])) {
				cont++;
			}
		}
		if (cont == part.length / 2) {
			System.out.println("palindromo");
		} else {
			System.out.println("nao eh palindromo");
		}

		in.close();
	}
}
