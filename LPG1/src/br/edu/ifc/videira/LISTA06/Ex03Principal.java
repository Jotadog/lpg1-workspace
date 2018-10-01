package br.edu.ifc.videira.LISTA06;

import java.util.Scanner;

public class Ex03Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex03 ex = new Ex03();
		System.out.println("Coloque o valor do salario minimo");
		ex.setSalMin(Integer.parseInt(in.nextLine()));
		System.out.println("Coloque o valor de quilowatts gasto");
		ex.setQuilowatts(Integer.parseInt(in.nextLine()));
		System.out.println("Valor total: "+ex.conta());
		System.out.println("Valor total com 10% de desconto: "+ex.desconto());
		in.close();
	}
}
