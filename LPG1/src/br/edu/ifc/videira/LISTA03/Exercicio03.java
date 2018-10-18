package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade,cont=0,media=0;
		for(;;) {
			System.out.println("Coloque uma idade");
			idade = Integer.parseInt(in.nextLine());
			if(idade == 0) {
				break;
			}
			media += idade;
			cont++;
		}
		System.out.println("Media: "+media/cont+"\nIdades lidas: "+cont);
		in.close();
	}
}
