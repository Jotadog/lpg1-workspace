package br.edu.ifc.videira.LISTA03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double altura, maior = 0, menor = 0;
		String sexo;
		double media = 0, contH = 0,contM = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Coloque a altura");
			altura = Double.parseDouble(in.nextLine());
			System.out.println("Coloque o sexo");
			sexo = String.valueOf(in.nextLine());
			if (i == 0) {
				maior = altura;
				menor = altura;
			}
			if (altura > maior) {
				maior = altura;
			}
			if(altura < menor) {
				menor = altura;
			}
			if (sexo.equals("feminino")) {
				media += altura;
				contM++;
			} else {
				contH++;
			}
		}
		System.out.println("Maior altura: "+maior+"\n"
				+ "Menor altura: "+menor+"\n"
						+ "A média de altura das mulheres: "+media/contM+"\n"
								+ "Porcentagem de homens: "+contH*10);
		in.close();
	}
}
