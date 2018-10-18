package br.edu.ifc.videira.LISTA09;

import javax.swing.JOptionPane;

public class Ex02Principal {
	public static void main(String[] args) {
		int op;
		Ex02Equipamento equip = new Ex02EquipamentoSonoro();
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n"
					+ "1 - Ligar\n"
					+ "2 - Desligar\n"
					+ "3 - Colocar volume\n"
					+ "4 - Mono\n"
					+ "5 - Stereo"));
			if (op == 1) {
				((Ex02EquipamentoSonoro) equip).liga();
			} else if (op == 2) {
				equip.desliga();
				break;
			} else if (op == 3) {
				((Ex02EquipamentoSonoro) equip).setVolume(Integer.parseInt(JOptionPane.showInputDialog("Coloque o volume:")));
			} else if (op == 4) {
				((Ex02EquipamentoSonoro) equip).mono();
			} else if (op == 5) {
				((Ex02EquipamentoSonoro) equip).stereo();
			}
			JOptionPane.showMessageDialog(null, "Ligado: "+equip.isLigado()+"\n"
					+ "Volume: "+((Ex02EquipamentoSonoro) equip).getVolume()+"\n"
							+ "Stereo: "+((Ex02EquipamentoSonoro) equip).isStereo());
		}
	}
}
