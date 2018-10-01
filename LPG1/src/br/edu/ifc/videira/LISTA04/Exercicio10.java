package br.edu.ifc.videira.LISTA04;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tamanho = 2;
		String nome[] = new String[tamanho];
		double preco[] = new double[tamanho], total = 0;
		int codigo[] = new int[tamanho], quantidade[] = new int[tamanho], id, tipo, quant;

		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + (i + 1) + "] Codigo: ");
			codigo[i] = Integer.parseInt(in.nextLine());
			System.out.println("[" + (i + 1) + "] Nome: ");
			nome[i] = String.valueOf(in.nextLine());
			System.out.println("[" + (i + 1) + "] Preco: ");
			preco[i] = Double.parseDouble(in.nextLine());
			System.out.println("[" + (i + 1) + "] Quantidade: ");
			quantidade[i] = Integer.parseInt(in.nextLine());
		}

		for (;;) {
			System.out.println("Codigo: ");
			id = Integer.parseInt(in.nextLine());
			if (id < 0) {
				break;
			}
			System.out.println("1)Vendida 2)Comprada: ");
			tipo = Integer.parseInt(in.nextLine());
			System.out.println("Quantidade: ");
			quant = Integer.parseInt(in.nextLine());

			for (int i = 0; i < tamanho; i++) {
				if (codigo[i] == id) {
					if (tipo == 1) {
						quantidade[i] -= quant;
					} else if (tipo == 2) {
						quantidade[i] += quant;
					}
					break;
				}
			}

		}

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Codigo [" + codigo[i] + "]");
			System.out.println("Nome " + nome[i]);
			System.out.println("Preco " + preco[i]);
			System.out.println("Quantidade " + quantidade[i]);
			System.out.println("Total Unitario R$" + preco[i] * quantidade[i]);
			total += preco[i] * quantidade[i];
		}
		System.out.println("Total Final R$ " + total);

		in.close();

	}
}
