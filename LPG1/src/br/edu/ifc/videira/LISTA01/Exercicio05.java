package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double temp;
		System.out.println("Coloque a temperatura em Fahrenheit");
		temp = Double.parseDouble(in.nextLine());
		System.out.println("Temperatura em Celcius: " + ((temp - 32) * 5) / 9);
		in.close();
	}
}