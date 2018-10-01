package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double potencia, largura, comprimento, area, pot, lampadas;
		System.out.println("Coloque a potência:");
		potencia = Double.parseDouble(in.nextLine());
		System.out.println("Coloque a largura do comodo");
		largura = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o comprimento do comodo");
		comprimento = Double.parseDouble(in.nextLine());
		area = largura * comprimento;
		pot = area * 18;
		lampadas = pot / potencia;
		System.out.println("Numero de lampadas necessarias: "+(int)lampadas);
		in.close();
	}
}
