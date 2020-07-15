package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Principal {
	public static void main(String[] args) {
		Ex07Produto pr;
		int opcao;
		int codigo;
		String descricao;
		double valor;
		String tipo;
		double voltagem;
		String tamanho;
		String cor;

		for (;;) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a opção de cadastro:\n1 - Alimento\n2 - Eletrodoméstico\n3 - Roupa\n4 - Sair"));
			if (opcao == 4) {
				break;
			}

			codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o código do produto:"));
			descricao = String.valueOf(JOptionPane.showInputDialog("Qual a descrição do produto: "));
			valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto:"));

			if (opcao == 1) {
				tipo = String.valueOf(JOptionPane.showInputDialog("Qual o tipo de alimento: "));
				pr = new Ex07Alimento(codigo, descricao, valor, tipo);
				pr.imprime();
			} else if (opcao == 2) {
				voltagem = Double.parseDouble(JOptionPane.showInputDialog("Qual a voltagem do produto:"));
				pr = new Ex07Eletrodomestico(codigo, descricao, valor, voltagem);
				pr.imprime();
			} else if (opcao == 3) {
				tamanho = String.valueOf(JOptionPane.showInputDialog("Qual o tamanho do produto: "));
				cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor do produto: "));
				pr = new Ex07Roupa(codigo, descricao, valor, tamanho, cor);
				pr.imprime();
			} else if (opcao == 4) {
				break;
			}
		}
	}
}
