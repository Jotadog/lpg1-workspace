package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex07Principal {
	public static void main(String[] args) {
		Ex07Produto pr;
		int op;
		int codigo;
		String descricao;
		double valor;
		String tipo;
		double voltagem;
		String tamanho;
		String cor;

		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a opcao de cadastro:\n1 - Alimento\n2 - Eletrodomestico\n3 - Roupa\n4 - Sair"));
			if (op == 4) {
				break;
			}

			codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto:"));
			descricao = String.valueOf(JOptionPane.showInputDialog("Qual a descricao do produto: "));
			valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto:"));

			if (op == 1) {
				tipo = String.valueOf(JOptionPane.showInputDialog("Qual o tipo de alimento: "));
				pr = new Ex07Alimento(codigo, descricao, valor, tipo);
				pr.imprime();
			} else if (op == 2) {
				voltagem = Double.parseDouble(JOptionPane.showInputDialog("Qual a voltagem do produto:"));
				pr = new Ex07Eletrodomestico(codigo, descricao, valor, voltagem);
				pr.imprime();
			} else if (op == 3) {
				tamanho = String.valueOf(JOptionPane.showInputDialog("Qual o tamanho do produto: "));
				cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor do produto: "));
				pr = new Ex07Roupa(codigo, descricao, valor, tamanho, cor);
				pr.imprime();
			} else if (op == 4) {
				break;
			}
		}
	}
}
