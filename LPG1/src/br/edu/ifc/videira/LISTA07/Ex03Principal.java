package br.edu.ifc.videira.LISTA07;

import javax.swing.JOptionPane;

public class Ex03Principal {
	public static void main(String[] args) {
		Ex03Professor professor = new Ex03Professor();
		int op;
		for (;;) {
			JOptionPane.showMessageDialog(null,
					"Professor: \n" + "nome: " + professor.getProfessor() + "\n" + "departamento: "
							+ professor.getNomeDepartamento() + "\n" + "registro: " + professor.getRegistro() + "\n"
							+ "data de admissao: " + professor.getDataAdmissao());
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - alterar nome\n" + "2 - alterar departamento \n"
					+ "3 - alterar registro \n" + "4 - alterar data de admissao \n" + "5 - sair"));
			if (op == 1) {
				professor.setProfessor(String.valueOf(JOptionPane.showInputDialog("Coloque o nome")));
			} else if (op == 2) {
				professor.setNomeDepartamento(String.valueOf(JOptionPane.showInputDialog("Coloque o nome")));
			} else if (op == 3) {
				professor.setRegistro(Integer.parseInt(JOptionPane.showInputDialog("Coloque o registro")));
			} else if (op == 4) {
				professor.setDataAdmissao(String.valueOf(JOptionPane.showInputDialog("Coloque a data")));
			} else {
				break;
			}
		}

	}
}
