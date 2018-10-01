package br.edu.ifc.videira.LISTA07;

import javax.swing.JOptionPane;

public class Ex02Principal {
	public static void main(String[] args) {
		Ex02Porta porta = new Ex02Porta();
		int op;
		for (;;) {
			JOptionPane.showMessageDialog(null, "Porta: \n" + "Cor: " + porta.getCor() + "\n" + "Dimensoes: "
					+ porta.getDimensaoX() + " x " + porta.getDimensaoY() + " x " + porta.getDimensaoZ());
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escolha uma opçao: \n" + "1 - Abrir porta \n" + "2 - Fechar porta \n" + "3 - Pintar porta \n"
							+ "4 - Alterar dimensao X \n" + "5 - Alterar dimensao Y \n" + "6 - Alterar dimensao Z \n"
							+ "7 - Verificar se esta aberta \n" + "8 - Sair \n"));
			if (op == 1) {
				porta.abrir();
			} else if (op == 2) {
				porta.fechar();
			} else if (op == 3) {
				porta.pintar(String.valueOf(JOptionPane.showInputDialog(null, "Coloque a cor da porta")));
			} else if (op == 4) {
				porta.setDimensaoX(Double
						.parseDouble((String.valueOf(JOptionPane.showInputDialog(null, "Coloque a dimensao X")))));
			} else if (op == 5) {
				porta.setDimensaoY(Double
						.parseDouble((String.valueOf(JOptionPane.showInputDialog(null, "Coloque a dimensao Y")))));
			} else if (op == 6) {
				porta.setDimensaoZ(Double
						.parseDouble((String.valueOf(JOptionPane.showInputDialog(null, "Coloque a dimensao Z")))));
			} else if (op == 7) {
				JOptionPane.showMessageDialog(null, porta.estaAberta());
			} else {
				break;
			}
		}
	}
}
