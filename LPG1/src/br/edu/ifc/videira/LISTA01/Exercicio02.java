package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z;
		System.out.println("Coloque o valor de x");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o valor de y");
		y = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o valor de z");
		z = Integer.parseInt(in.nextLine());
		System.out.println("Média dos números: " + (double) (x + y + z) / 3);
		in.close();
	}
}
