package br.edu.ifc.videira.LISTA06;

import java.util.Scanner;

public class Ex05Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex05Candidato c1 = new Ex05Candidato();
		Ex05Candidato c2 = new Ex05Candidato();
		Ex05Candidato c3 = new Ex05Candidato();
		int voto;
		boolean fim = false;
		System.out.println("Coloque o nome do candidato 1");
		c1.setNome(String.valueOf(in.nextLine()));
		System.out.println("Coloque o nome do candidato 2");
		c2.setNome(String.valueOf(in.nextLine()));
		System.out.println("Coloque o nome do candidato 3");
		c3.setNome(String.valueOf(in.nextLine()));
		for(;;) {
			if(fim) {
				break;
			}
			System.out.println("Vote");
			voto = Integer.parseInt(in.nextLine());
			switch(voto) {
			case 1:
				c1.incrementar();
				break;
			case 2:
				c2.incrementar();
				break;
			case 3:
				c3.incrementar();
				break;
			default:
				System.out.println("encerrado");
				System.out.println(c1.getNome()+": "+c1.getVotos());
				System.out.println(c2.getNome()+": "+c2.getVotos());
				System.out.println(c3.getNome()+": "+c3.getVotos());
				fim = true;
				break;
			}
		}
		in.close();
	}
}
