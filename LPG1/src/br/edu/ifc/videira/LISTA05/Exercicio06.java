package br.edu.ifc.videira.LISTA05;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		String frase;
		Scanner in = new Scanner(System.in);

		System.out.println("Coloque uma frase");
		frase = String.valueOf(in.nextLine());

		frase = frase.replace("a", "*");

		System.out.println(frase);
		in.close();
	}
}
