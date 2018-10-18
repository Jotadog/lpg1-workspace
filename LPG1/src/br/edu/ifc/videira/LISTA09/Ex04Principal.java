package br.edu.ifc.videira.LISTA09;

import javax.swing.JOptionPane;

public class Ex04Principal {
	public static void main(String[] args) {
		int op;
		Ex04Veiculo v;
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Carro de passeio\n" + "2 - Caminhao"));
			if (op == 2) {
				v = new Ex04Caminhao(Integer.parseInt(JOptionPane.showInputDialog("Toneladas: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Altura máxima: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Comprimento: ")));
				JOptionPane.showMessageDialog(null, ((Ex04Caminhao) v).imprime());
			} else if (op == 1) {
				v = new Ex04CarroPasseio(String.valueOf(JOptionPane.showInputDialog("Cor:")),
						String.valueOf(JOptionPane.showInputDialog("Modelo:")),
						Integer.parseInt(JOptionPane.showInputDialog("Comprimento: ")));
				JOptionPane.showMessageDialog(null, ((Ex04CarroPasseio) v).imprime());
			} else {
				break;
			}
		}
	}
}
