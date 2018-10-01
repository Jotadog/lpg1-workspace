package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtde, n50 = 0, n10 = 0, n5 = 0, n2 = 0;
		System.out.println("Coloque a quantia a ser sacada");
		qtde = Integer.parseInt(in.nextLine());

		n50 = qtde / 50;
		qtde -= n50*50;
		n10 = qtde / 10;
		qtde -= n10 * 10;
		if((qtde % 5)==0) {
			n5 = qtde / 5;
			qtde -= n5 * 5;
		}
		n2 = qtde / 2;
		
		System.out.println(n50 + " " + n10 + " " + n5 + " " + n2);
		in.close();
	}
}
