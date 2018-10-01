package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio09 {
	public static void main(String[] args) {
		Random r = new Random();
		double salarios[] = new double[35];
		int codigos[] = new int[35];
		System.out.println();
		for (int i = 0 ; i < codigos.length; i++) {
			codigos[i] = i;
			salarios[i] = r.nextInt(1000);
		}
		for (int i = 0 ; i < codigos.length; i++) {
			if(salarios[i] > 880) {
				System.out.println(salarios[i]);
				System.out.println(codigos[i]);
			}
		}
	}
}
