package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num, fat = 1;
		System.out.println("Coloque um numero");
		num = Double.parseDouble(in.nextLine());
		for(int i = (int)num; i > 1; i--) {
			fat *= i;
		}
		System.out.println(fat);
		in.close();
	}
}
