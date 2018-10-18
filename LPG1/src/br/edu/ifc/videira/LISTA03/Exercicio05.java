package br.edu.ifc.videira.LISTA03;

public class Exercicio05 {
	public static void main(String[] args) {
		int cont = 0, i, j;
		for (i = 100; i < 1000; i++) {
			for (j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.println(i);
			}
			cont = 0;
		}
	}
}
