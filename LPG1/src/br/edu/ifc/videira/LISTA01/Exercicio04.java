package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio;
		System.out.println("Coloque o raio do circulo:");
		raio = Double.parseDouble(in.nextLine());
		System.out.println("Área do círculo: " + 3.14 * Math.pow(raio, 2));
		in.close();
	}
}
