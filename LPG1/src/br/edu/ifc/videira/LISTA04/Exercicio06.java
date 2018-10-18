package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[3];
		String numero, extenso = "";
		int numeroInt, part;
		String[] centena = { "nulo", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos" };
		String[] particular = { "", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove" };
		String[] unidade = { "nulo", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		String[] dezena = { "nulo", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
				"noventa" };
		System.out.println("Coloque um numero");
		numero = String.valueOf(in.nextLine());
		numeroInt = Integer.parseInt(numero);
		if (Integer.parseInt(numero) < 10) {
			numero = "00" + numero;
		} else if (Integer.parseInt(numero) > 9 && Integer.parseInt(numero) < 100) {
			numero = "0" + numero;
		}
		vetor[0] = Integer.parseInt(numero.substring(0, 1));
		vetor[1] = Integer.parseInt(numero.substring(1, 2));
		vetor[2] = Integer.parseInt(numero.substring(2, 3));
		part = Integer.parseInt(numero.substring(1, 3));
		if (numeroInt < 10) {
			extenso = unidade[vetor[2]];
		} else if (numeroInt > 9 && numeroInt < 20) {
			if (numeroInt == 10) {
				extenso = "dez";
			} else {
				extenso = particular[vetor[2]];
			}
		} else if (numeroInt > 19 && numeroInt < 100) {
			if (vetor[2] == 0) {
				extenso = dezena[vetor[1]];
			} else {
				extenso = dezena[vetor[1]] + " " + unidade[vetor[2]];
			}
		} else if (numeroInt >= 100) {
			if (numeroInt == 100) {
				extenso = "cem";
			} else {
				if (part > 9 && part < 20) {
					extenso = centena[vetor[0]] + " " + particular[vetor[2]];
				} else {
					extenso = centena[vetor[0]] + " " + dezena[vetor[1]] + " " + unidade[vetor[2]];
				}
			}
		} else {
			extenso = "";
		}
		extenso = extenso.replace(" ", " e ");
		if (extenso.contains(" e nulo")) {
			extenso = extenso.replace(" e nulo", "");
		}
		System.out.println(extenso);
		in.close();
	}
}
