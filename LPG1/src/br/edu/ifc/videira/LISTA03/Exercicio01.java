package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y;
		System.out.println("Coloque o primeiro valor");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o segundo valor");;
		y = Integer.parseInt(in.nextLine());
		if(x < y) {
			for(int i = x + 1; i<y; i++) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
