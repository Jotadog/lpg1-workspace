package br.edu.ifc.videira.LISTA04;

public class Exercicio12 {
	public static void main(String[] args) {
		int m1[][] = new int[10][10];
		int m2[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				m1[i][j] = i + j;
				m2[i][j] = i * j;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
