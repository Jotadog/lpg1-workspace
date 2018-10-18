package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double altura,sexo,peso;
		System.out.println("Coloque a altura");
		altura = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o sexo (1:feminino 2:masculino)");
		sexo = Double.parseDouble(in.nextLine());
		if(sexo == 1) {
			peso = (62.1 * altura) - 44.7;
		} else {
			peso = (72.7 * altura) - 58;
		}
		System.out.println("Peso ideal: "+peso+" kg");
		in.close();
	}
}
