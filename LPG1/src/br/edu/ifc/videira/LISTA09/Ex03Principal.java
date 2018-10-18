package br.edu.ifc.videira.LISTA09;

import javax.swing.JOptionPane;

public class Ex03Principal {
	public static void main(String[] args) {
		Ex03Animal animal;
		int op;
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Normal\n2 - Mar\n3 - Terra"));
			if (op == 1) {
				animal = new Ex03Animal(String.valueOf(JOptionPane.showInputDialog("Coloque o animal\n")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque o comprimento\n")),
						Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero de patas")),
						String.valueOf(JOptionPane.showInputDialog("Coloque a cor")),
						String.valueOf(JOptionPane.showInputDialog("Coloque o ambiente")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque a velocidade")));
				JOptionPane.showMessageDialog(null, animal.printAnimal());
			} else if (op == 2) {
				animal = new Ex03Peixe(String.valueOf(JOptionPane.showInputDialog("Coloque o animal\n")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque o comprimento\n")),
						String.valueOf(JOptionPane.showInputDialog("Coloque a cor")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque a velocidade")),
						String.valueOf(JOptionPane.showInputDialog("Coloque a caracteristica")));
				JOptionPane.showMessageDialog(null, ((Ex03Peixe)animal).printAnimal());
			} else if (op == 3) {
				animal = new Ex03Mamifero(String.valueOf(JOptionPane.showInputDialog("Coloque o animal\n")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque o comprimento\n")),
						Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero de patas")),
						String.valueOf(JOptionPane.showInputDialog("Coloque a cor")),
						String.valueOf(JOptionPane.showInputDialog("Coloque o ambiente")),
						Double.parseDouble(JOptionPane.showInputDialog("Coloque a velocidade")),
						String.valueOf(JOptionPane.showInputDialog("Coloque o alimento")));
				JOptionPane.showMessageDialog(null,((Ex03Mamifero)animal).printAnimal());
			} else {
				break;
			}
		}
	}
}
