package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, maior = 0, menor = 0, msal = 0, i = 0;
		double media = 0, salario;
		String sexo;
		while (true) {
			System.out.println("Coloque a idade");
			idade = Integer.parseInt(in.nextLine());
			if (idade < 0) {
				break;
			}
			if (i == 0) {
				maior = idade;
				menor = idade;
			}
			if (idade > maior) {
				maior = idade;
			}
			if (idade < menor) {
				menor = idade;
			}
			System.out.println("Coloque o sexo");
			sexo = String.valueOf(in.nextLine());
			System.out.println("Digite o salario");
			salario = Double.parseDouble(in.nextLine());
			media += salario;
			if (sexo.equalsIgnoreCase("f")) {
				if (salario <= 2000) {
					msal++;
				}
			}
			i++;
		}
		System.out.println("Media dos salarios: "+(double)media/i+"\n"
				+ "Maior idade: "+maior+"\n"
						+ "Menor idade: "+menor+"\n"
								+ "Quantidade de mulheres com salário até R$ 2000,00: "+msal);
		in.close();
	}
}
