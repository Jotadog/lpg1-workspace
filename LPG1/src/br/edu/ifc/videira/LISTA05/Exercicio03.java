package br.edu.ifc.videira.LISTA05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numeros;
		String inteiros[];
		int maior = 0, menor = 0;
		System.out.println("Coloque a string");
		numeros = String.valueOf(in.nextLine());
		inteiros = numeros.split(";");
		for (int i = 0; i < inteiros.length; i++) {
			if(i == 0) {
				maior = Integer.parseInt(inteiros[i]);
				menor = Integer.parseInt(inteiros[i]);
			}
			if(menor > Integer.parseInt(inteiros[i])) {
				menor = Integer.parseInt(inteiros[i]);
			} 
			if(maior < Integer.parseInt(inteiros[i])) {
				maior = Integer.parseInt(inteiros[i]);
			}
		}
		System.out.println("Maior: "+maior+"\nMenor: "+menor);
		in.close();
	}
}
