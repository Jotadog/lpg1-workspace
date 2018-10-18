package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y;
		int[] vet = new int[12];
		System.out.println();
		for(int i=0;i<12;i++) {
			vet[i] = Integer.parseInt(in.nextLine());
		}
		System.out.println("coloque x e y");
		x = Integer.parseInt(in.nextLine());
		y = Integer.parseInt(in.nextLine());
		System.out.println((vet[x]+vet[y]));
		in.close();
	}
}
