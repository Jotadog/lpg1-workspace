package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex04Principal {
	public static void main(String[] args) {
		int op;
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Qual o tipo do ingresso:\n" + "1 - Normal - R$20\n" + "2 - VIP - R$30\n" + "3 - Camarote"));
			if (op == 1) {
				Ex04Ingresso ingresso = new Ex04Normal(20);
				JOptionPane.showMessageDialog(null, ingresso.imprime("Normal"));
			} else if (op == 2) {
				Ex04Ingresso ingresso = new Ex04VIP(20, 10);
				JOptionPane.showMessageDialog(null,
						ingresso.imprime("VIP") + "\n" + "Adicional: R$" + ((Ex04VIP) ingresso).getAdicional());
			} else if (op == 3) {
				op = Integer.parseInt(JOptionPane
						.showInputDialog("Qual a localização do camarote:\n" + "1 - Inferior - R$40\n" + "2 - Superior - R$50"));
				if (op == 1) {
					Ex04Ingresso ingresso = new Ex04CamaroteInferior(20, 10, 10);
					((Ex04CamaroteInferior) ingresso).setLocalizacao("Inferior");
					JOptionPane.showMessageDialog(null, ingresso.imprime("Camarote") + "\n" + "Localização: "
							+ (((Ex04CamaroteInferior) ingresso).getLocalizacao()));
				} else if (op == 2) {
					Ex04Ingresso ingresso = new Ex04CamaroteSuperior(20, 10, 20);
					((Ex04CamaroteSuperior) ingresso).setLocalizacao("Superior");
					JOptionPane.showMessageDialog(null, ingresso.imprime("Camarote") + "\n" + "Localização: "
							+ (((Ex04CamaroteSuperior) ingresso).getLocalizacao()));
				}
			} else {
				break;
			}
		}
	}
}
