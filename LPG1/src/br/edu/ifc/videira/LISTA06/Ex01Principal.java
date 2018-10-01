package br.edu.ifc.videira.LISTA06;

import java.util.Scanner;

public class Ex01Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex01Contador cont = new Ex01Contador();
		int op;
		for (;;) {
			System.out.println("1 - incrementar\n2 - decrementar");
			op = Integer.parseInt(in.nextLine());
			if (op == 1) {
				cont.incrementa();
			} else if (op == 2) {
				cont.decrementa();
			} else {
				break;
			}
			System.out.println("Valor atual: " + cont.getNumero());
		}
		in.close();
	}
}
