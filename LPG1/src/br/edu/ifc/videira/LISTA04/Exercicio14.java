package br.edu.ifc.videira.LISTA04;

public class Exercicio14 {
	public static void main(String[] args) {
		int m[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i == j) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
