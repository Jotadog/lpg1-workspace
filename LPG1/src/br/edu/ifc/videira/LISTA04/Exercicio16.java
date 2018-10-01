package br.edu.ifc.videira.LISTA04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio16 {
	public static void main(String[] args) {
		Random r = new Random();
		DecimalFormat df = new DecimalFormat("#00");
		int m[][] = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				m[i][j] = r.nextInt(10)+1;
				if((i-j) < 0) {
					m[i][j] = 0;
				}
				System.out.print(df.format(m[i][j])+ " ");
			}
			System.out.println();
		}
	}
}
