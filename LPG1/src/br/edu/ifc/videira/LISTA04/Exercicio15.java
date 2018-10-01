package br.edu.ifc.videira.LISTA04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio15 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		double m[][] = new double[50][2];
		double area[] = new double[50];
		int i,j;
		Random r = new Random();
		for (i = 0; i < 50; i++) {
			for (j = 0; j < 2; j++) {
				m[i][j] = r.nextDouble() * 100;
				area[i] = (m[i][0] * m[i][1]) / 2;
				System.out.print(df.format(m[i][j]) + " ");
			}
			System.out.print("Area: "+df.format(area[i])+"\n");
		}
	}
}
