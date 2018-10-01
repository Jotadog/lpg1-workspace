package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letra, aux = null;
		int cont = 0;

		for (;;) {
			System.out.println("Coloque uma letra");
			letra = String.valueOf(in.nextLine());

			if (letra.equals("x")) {
				break;
			}

			if (letra.equals(aux)) {
				cont++;
			}
			aux = letra;
		}
		System.out.println("Numero de letras consecutivas iguais " + cont);
		in.close();
	}
}
