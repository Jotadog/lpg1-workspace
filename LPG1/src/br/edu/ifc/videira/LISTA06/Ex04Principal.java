package br.edu.ifc.videira.LISTA06;

import java.util.Scanner;

public class Ex04Principal {
	public static void main(String[] args) {
		Ex04Calculadora calc = new Ex04Calculadora();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Coloque o valor do numero 1");
		calc.numero1 = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o valor do numero 2");
		calc.numero2 = Integer.parseInt(in.nextLine());
		
		System.out.println("Soma: "+calc.retornaSomaAtributos());
		System.out.println("Multiplicacao: "+calc.retornaMultiplicacaoAtributos());
		
		System.out.println("Coloque novos valores: ");
		calc.insereValoresAtributos(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
		System.out.println("Atributos: \nnumero 1 = "+calc.numero1+"\nnumero 2 = "+calc.numero2);
		
		in.close();
	}
}
