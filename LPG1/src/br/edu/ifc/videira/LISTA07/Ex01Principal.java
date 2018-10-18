package br.edu.ifc.videira.LISTA07;

import javax.swing.JOptionPane;

public class Ex01Principal {
	public static void main(String[] args) {
		Ex01Pessoa p1 = new Ex01Pessoa();
		Ex01Pessoa p2 = new Ex01Pessoa();
		Ex01Pessoa p3 = new Ex01Pessoa();
		int op;
		p1.setNome(String.valueOf(JOptionPane.showInputDialog(null, "Nome da pessoa")));
		p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade  da " + p1.getNome())));
	
		p2.setNome(String.valueOf(JOptionPane.showInputDialog(null, "Nome da pessoa")));
		p2.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade  da " + p2.getNome())));
	
		p3.setNome(String.valueOf(JOptionPane.showInputDialog(null, "Nome da pessoa")));
		p3.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade  da " + p3.getNome())));
	
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Quem fez aniversario?"));
			if(op == 1) {
				p1.fazAniversario();
			} else if(op == 2) {
				p2.fazAniversario();
			} else if(op == 3) {
				p3.fazAniversario();
			} else {
				JOptionPane.showMessageDialog(null, "Errou, perdeu");
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, p1.getNome() + ": " + p1.getIdade() + "\n" + p2.getNome() + ": "
				+ p2.getIdade() + "\n" + p3.getNome() + ": " + p3.getIdade());
	}
}
