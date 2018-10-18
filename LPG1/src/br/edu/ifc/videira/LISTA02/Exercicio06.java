package br.edu.ifc.videira.LISTA02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0,00");
		double massa, densidade, preco, volume;
		System.out.println("Coloque a massa");
		massa = Double.parseDouble(in.nextLine());
		System.out.println("Coloque a densidade");
		densidade = Double.parseDouble(in.nextLine());
		System.out.println("Coloque o preco");
		preco = Double.parseDouble(in.nextLine());
		volume = massa/densidade;
		System.out.println("Massa: "+massa+" kg\n"
				+ "Densidade: "+densidade+" kg/l\n"
						+ "Preco do litro: R$"+df.format(preco)+"\n"
								+ "Volume: "+df.format(volume)+" l\n"
										+ "Total : R$"+df.format(volume*preco)+"\n");
		if(densidade < 1.14) {
			System.out.println("Categoria I");
		} else if(densidade > 1.2) {
			System.out.println("Categoria III");
		} else {
			System.out.println("Categoria II");
		}
		in.close();
	}
}
