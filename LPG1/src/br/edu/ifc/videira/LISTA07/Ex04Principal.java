package br.edu.ifc.videira.LISTA07;

import javax.swing.JOptionPane;

public class Ex04Principal {
	public static void main(String[] args) {
		int op;
		Ex04Computador cp = new Ex04Computador();
		cp.setPlaca(900);
		cp.setConfig("Placa mae a R$900\n");
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha o processador\n1 - 3,3Ghz a R$250\n" + "2 - 3,5Ghz a R$310\n" + "3 - 3,9Ghz a R$620\n"));
		if (op == 1) {
			cp.setConfig("Processador 3,3Ghz a R$250\n");
			cp.setProcessador(250);
		} else if (op == 2) {
			cp.setConfig("Processador 3,5Ghz a R$310\n");
			cp.setProcessador(310);
		} else if (op == 3) {
			cp.setConfig("Processador 3,9Ghz a R$620\n");
			cp.setProcessador(620);
		}

		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha a memoria RAM\n1 - 2GB a R$300\n2 - 4GB a R$600\n3 - 8GB a R$1200\n4 - 16GB a R$2400"));
		if (op == 1) {
			cp.setConfig("Memoria de 2GB a R$300\n");
			cp.setMemoria(300);
		} else if (op == 2) {
			cp.setConfig("Memoria de 4GB a R$600\n");
			cp.setMemoria(600);
		} else if (op == 3) {
			cp.setConfig("Memoria de 8GB a R$1200\n");
			cp.setMemoria(1200);
		} else if (op == 4) {
			cp.setConfig("Memoria de 16GB a R$2400\n");
			cp.setMemoria(2400);
		}

		op = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha o hd\n1 - 500 GB a R$400\n" + "2 - 1 TB a R$600\n3 - 2 TB a R$800"));
		if (op == 1) {
			cp.setConfig("Disco rigido de 500 GB a R$400\n");
			cp.setHd(500);
		} else if (op == 2) {
			cp.setConfig("Disco rigido de 1 TB a R$600\n");
			cp.setHd(600);
		} else if (op == 3) {
			cp.setConfig("Disco rigido de 2 TB a R$800\n");
			cp.setHd(800);
		}

		op = Integer.parseInt(
				JOptionPane.showInputDialog("Escolha o monitor\n1 - 17 polegadas a R$390\n2 - 19 polegadas a R$520"));
		if (op == 1) {
			cp.setConfig("Monitor de 17 polegadas a R$390\n");
			cp.setMonitor(390);
		} else if (op == 2) {
			cp.setConfig("Monitor de 19 polegadas a R$520\n");
			cp.setMonitor(520);
		}
		JOptionPane.showMessageDialog(null, cp.getConfig()+"Preco: R$"+cp.calculaPreco());
	}
}
