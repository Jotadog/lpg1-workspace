package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("Coloque um numero");
		x = Integer.parseInt(in.nextLine());
		for (int i = x; i >= 1; i--) {
			if ((x % i) == 0) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
