package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3;
		System.out.println("Coloque o primeiro lado");
		n1 = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o segundo lado");
		n2 = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o terceiro lado");
		n3 = Double.parseDouble(in.nextLine());
		if (n1 < (n2 + n3) || n2 < (n1 + n3) || n3 < (n1 + n2)) {
			if (n1 == n2 && n2 == n3) {
				System.out.println("Triangulo Equilatero");
			} else if (n1 == n2 || n1 == n3 || n2 == n3) {
				System.out.println("Triangulo Isoscele");
			} else if (n1 != n2 && n1 != n3 && n2 != n3) {
				System.out.println("Triangulo Escaleno");
			}
		}
		in.close();
	}
}
