package br.edu.ifc.videira.LISTA02;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String senha;
		System.out.println("Digite a senha");
		senha = String.valueOf(in.nextLine());
		if(senha.equals("1234")) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		in.close();
	}
}
