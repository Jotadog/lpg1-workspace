package br.edu.ifc.videira.LISTA05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcao, posicao;
		String aluno;
		ArrayList<String> alunos = new ArrayList<String>();
		for (;;) {
			System.out.println("\n1 - Inserir aluno \n2 - Consultar aluno\n3 - Remover\n" + "4 - Listar\n5 - Sair");
			opcao = Integer.parseInt(in.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("\nVoce deseja inserir: \n1 - Final da lista\n2 - Posicao especifica\n");
				opcao = Integer.parseInt(in.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("\nDigite o nome do aluno");
					aluno = String.valueOf(in.nextLine());
					alunos.add(aluno);
					break;
				case 2:
					System.out.println("\nDigite o nome do aluno");
					aluno = String.valueOf(in.nextLine());
					System.out.println("\nColoque a posicao");
					posicao = Integer.parseInt(in.nextLine());
					alunos.add(posicao, aluno);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("\nDigite o nome do aluno");
				aluno = String.valueOf(in.nextLine());
				if (alunos.contains(aluno)) {
					posicao = alunos.indexOf(aluno);
					System.out.println("\n{" + alunos.get(posicao) + "}");
				} else {
					System.out.println("\n{Nao encontrado}");
				}
				break;
			case 3:
				System.out.println("\nDigite o nome do aluno");
				aluno = String.valueOf(in.nextLine());
				if (alunos.contains(aluno)) {
					posicao = alunos.indexOf(aluno);
					alunos.remove(posicao);
				} else {
					System.out.println("\n{Este aluno nao existe}");
				}
				break;
			case 4:
				for (String lista : alunos) {
					System.out.println(lista);
				}
				break;
			default:
				break;
			}
			if (opcao == 5) {
				in.close();
				break;
			}
		}
	}
}
