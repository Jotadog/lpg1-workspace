package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[20], x,cont=0;
		System.out.println();
		for (int i = 0; i < 20; i++) {
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		System.out.println("coloque um valor");
		x = Integer.parseInt(in.nextLine());
		for(int i = 0 ; i < 20; i ++) {
			if(x == vetor[i]) {
				cont++;
			}
		}
		System.out.println("Encontrado "+cont+" vezes");
		in.close();
	}
}
