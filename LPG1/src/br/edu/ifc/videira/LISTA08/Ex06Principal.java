package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex06Principal {
	public static void main(String[] args) {
		int op;
		double preco, valor;
		String endereco;
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o imovel: \n" + "1 - novo\n" + "2 - velho"));
			if (op == 1) {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Coloque o preco"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Coloque o adicional"));
				endereco = String.valueOf(JOptionPane.showInputDialog("Coloque o endereco"));
				Ex06Imovel imovel = new Ex06Novo(endereco, preco, valor);
				JOptionPane.showMessageDialog(null,
						"Imovel novo\n" + "Preço: R$" + imovel.getPreco() + "\n" + "Adicional: R$"
								+ ((Ex06Novo) imovel).getAdicional() + "\n" + "Endereco: " + imovel.getEndereco());
			} else if (op == 2) {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Coloque o preco"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Coloque o desconto"));
				endereco = String.valueOf(JOptionPane.showInputDialog("Coloque o endereco"));
				Ex06Imovel imovel = new Ex06Velho(endereco, preco, valor);

				JOptionPane.showMessageDialog(null,
						"Imovel velho\n" + "Preço: R$" + imovel.getPreco() + "\n" + "Desconto: R$"
								+ ((Ex06Velho) imovel).getDesconto() + "\n" + "Endereco: " + imovel.getEndereco());
			}

		}
	}
}
