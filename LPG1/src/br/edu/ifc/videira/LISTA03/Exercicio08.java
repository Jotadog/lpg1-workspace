package br.edu.ifc.videira.LISTA03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner in = new Scanner(System.in);
		double saldo = 0, valor;
		boolean sair = false;
		String opcao;
		while (true) {
			if(sair) {
				break;
			}
			System.out.println("opções:\n(a)consulta saldo\n(b)saque\n(c)depósito\n(d) sair");
			opcao = String.valueOf(in.nextLine());
			switch (opcao) {
			case "a":
				System.out.println("Saldo: R$" + df.format(saldo));
				break;
			case "b":
				System.out.println("Digite o valor");
				valor = Double.parseDouble(in.nextLine());
				saldo -= valor;
				System.out.println("Saldo: R$" + df.format(saldo));
				break;
			case "c":
				System.out.println("Digite o valor");
				valor = Double.parseDouble(in.nextLine());
				saldo += valor;
				System.out.println("Saldo: R$" + df.format(saldo));
				break;
			default:
				sair = true;
				break;
			}
		}
		in.close();
	}
}
