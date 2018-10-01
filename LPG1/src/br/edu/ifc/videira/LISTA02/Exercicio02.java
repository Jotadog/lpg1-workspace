package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int macas;
		double total;
		System.out.println("Coloque o numero de macas");
		macas = Integer.parseInt(in.nextLine());
		if(macas >= 12) {
			total = macas * 0.25;
		}else {
			total = macas * 0.30;
		}
		System.out.println("Total: R$"+total);
		in.close();
	}
}
