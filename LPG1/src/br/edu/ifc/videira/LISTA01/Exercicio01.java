package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		System.out.println("Coloque o valor de x");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o valor de y");
		y = Integer.parseInt(in.nextLine());
		System.out.println("O quociente de " + x + " por " + y + " �: " + ((double) x / y));
		System.out.println("O resto da divis�o de " + x + " por " + y + " �: " + (x % y));
		in.close();
	}
}
