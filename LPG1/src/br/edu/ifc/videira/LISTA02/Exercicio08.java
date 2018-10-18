package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		int numero,chave;
		Scanner in = new Scanner(System.in);
		System.out.println("Coloque um numero inteiro");
		numero = Integer.parseInt(in.nextLine());
		System.out.println("Coloque um numero chave");
		chave = Integer.parseInt(in.nextLine());
		if((numero >= 0 && numero <= 100) && (chave >= 0 && chave <= 100)) {
			System.out.println("Distancia entre "+numero+" e "+chave+" = "+Math.abs(numero - chave));
		} else {
			System.out.println("Numeros mal informados");
		}
		in.close();
	}
}
