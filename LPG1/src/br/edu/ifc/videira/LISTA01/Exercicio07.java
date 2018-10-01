package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double comprimento, largura, altura, area, caixas;
		System.out.println("Coloque o comprimento");
		comprimento = Double.parseDouble(in.nextLine());
		System.out.println("Coloque a largura");
		largura = Double.parseDouble(in.nextLine());
		System.out.println("Coloque a altura");
		altura = Double.parseDouble(in.nextLine());
		area = ((altura * comprimento) * 2) + ((altura * largura) * 2);
		caixas = area/1.5;
		System.out.println("Caixas de azulejo: "+(int)(Math.round(caixas)));
		in.close();
	}
}
