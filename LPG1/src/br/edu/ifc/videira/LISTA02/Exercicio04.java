package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		double lados, medida;
		Scanner in = new Scanner(System.in);
		System.out.println("Coloque o numero de lados");
		lados = Double.parseDouble(in.nextLine());
		System.out.println("Coloque a medida dos lados");
		medida = Double.parseDouble(in.nextLine());
		if (lados == 3) {
			System.out.println("TRIANGULO: " + (Math.pow(medida, 2)*Math.sqrt(3))/4);
		} else if(lados == 4) {
			System.out.println("QUADRADO: "+Math.pow(medida, 2));
		} else if(lados == 5) {
			System.out.println("PENTAGONO");
		}
		in.close();
	}
}
