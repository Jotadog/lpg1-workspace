package br.edu.ifc.videira.LISTA01;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ghora, nhora, inss, sindicato, salario, salBruto;
		System.out.println("Coloque o ganho por hora");
		ghora = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o numero de horas trabalhadas");
		nhora = Double.parseDouble(in.nextLine());
		salario = ghora * nhora;
		salBruto = salario;
		salario *= 0.89;
		salario *= 0.92;
		inss = (salario * 1.08) - salario;
		salario *= 0.95;
		sindicato = (salario * 1.05) - salario;
		System.out.println("Salario bruto: R$"+salBruto+"\n"
				+ "INSS: R$"+inss+"\n"
						+ "Sindicato: R$"+sindicato+"\n"
								+ "Salario liquido: R$"+salario);
		in.close();
	}
}
