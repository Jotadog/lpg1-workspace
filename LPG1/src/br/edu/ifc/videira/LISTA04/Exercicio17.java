package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio17 {
	public static void main(String[] args) {
		Random r = new Random();
		String al[][] = new String[100][10];
		String gab[] = new String[10];
		int pont[] = new int[100];
		System.out.print("Gabarito: ");
		for (int i = 0; i < 10; i++) {
			gab[i] = String.valueOf(r.nextInt(4));
			switch (gab[i]) {
			case "0":
				gab[i] = "a";
				break;
			case "1":
				gab[i] = "b";
				break;
			case "2":
				gab[i] = "c";
				break;
			case "3":
				gab[i] = "d";
				break;
			}
			System.out.print(gab[i] + " ");
		}
		for (int i = 0; i < 100; i++) {
			pont[i] = 0;
			System.out.print("\nAluno " + (i + 1) + ": ");
			for (int j = 0; j < 10; j++) {
				al[i][j] = String.valueOf(r.nextInt(4));
				switch (al[i][j]) {
				case "0":
					al[i][j] = "a";
					break;
				case "1":
					al[i][j] = "b";
					break;
				case "2":
					al[i][j] = "c";
					break;
				case "3":
					al[i][j] = "d";
					break;
				}
				if (al[i][j] == gab[j]) {
					pont[i]++;
				}
				System.out.print(al[i][j] + " ");
			}
			System.out.print("-> " + pont[i] + " acerto(s)\n");
		}
	}
}
