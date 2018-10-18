package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio13 {
	public static void main(String[] args) {
		Random r = new Random();
		int m[][] = new int[10][10];
		int aux=0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				m[i][j] = r.nextInt(100);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0 && j == 0) {
					aux = m[i][j];
				}
				if(m[i][j] > aux) {
					aux = m[i][j];
				}
			}
		}
		System.out.println("maior: "+ aux);
	}
}
