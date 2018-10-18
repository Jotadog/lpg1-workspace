package br.edu.ifc.videira.LISTA02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int tipo, numero;
		double minutosLocais = 0, minutosInter = 0, conta, tarifaLocal, tarifaInter,taxa, _final;
		System.out.println("Coloque o numero");
		numero = Integer.parseInt(in.nextLine());
		System.out.println("Coloque o tipo");
		tipo = Integer.parseInt(in.nextLine());
		switch(tipo) {
		case 1:
			System.out.println("Coloque o numero de minutos em chamadas locais");
			minutosLocais = Double.parseDouble(in.nextLine());
			System.out.println("Coloque o numero de minutos em chamadas interurbanas");
			minutosInter = Double.parseDouble(in.nextLine());
			tarifaLocal = 0.5 * minutosLocais;
			tarifaInter = 1.1 * minutosInter;
			conta = 10.2 + tarifaLocal + tarifaInter;
			System.out.println(conta);
			taxa = conta * 0.3;
			_final = conta + taxa;
			System.out.println("Tipo de linha: residencial\n"
					+ "Tarifa local: R$"+df.format(tarifaLocal)+"\n"
							+ "Tarifa interurbana: R$"+df.format(tarifaInter)+"\n"
									+ "Conta: R$"+df.format(conta)+"\n"
											+ "Taxa FNT: R$"+df.format(taxa)+"\n"
													+ "Valor final da conta: R$"+df.format(_final));
			break;
		case 2:
			System.out.println("Coloque o numero de minutos em chamadas locais");
			minutosLocais = Double.parseDouble(in.nextLine());
			System.out.println("Coloque o numero de minutos em chamadas interurbanas");
			minutosInter = Double.parseDouble(in.nextLine());
			tarifaLocal = 0.5 * minutosLocais;
			tarifaInter = 1.1 * minutosInter;
			conta = 19.5 + tarifaLocal + tarifaInter;
			taxa = conta * 0.3;
			_final = conta + taxa;
			System.out.println("Tipo de linha: comercial\n"
					+ "Tarifa local: R$"+df.format(tarifaLocal)+"\n"
							+ "Tarifa interurbana: R$"+df.format(tarifaInter)+"\n"
									+ "Conta: R$"+df.format(conta)+"\n"
											+ "Taxa FNT: R$"+df.format(taxa)+"\n"
													+ "Valor final da conta: R$"+df.format(_final));
			break;
		default:
			System.out.println("Erro para "+numero);
		}
		in.close();
	}
}
