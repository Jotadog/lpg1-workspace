package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex02Principal {
	public static void main(String[] args) {
		Ex01Funcionario ge = new Ex02Gerente();
		Ex01Funcionario at = new Ex02AssistenteTecnico();
		Ex01Funcionario aa = new Ex02AssistenteAdministrativo();
		int op;
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario \n" + "deseja cadastrar:\n"
					+ "1 - Gerente\n" + "2 - Assistente Técnico\n" + "3 - Assistente Administrativo\n" + "4 - Sair\n"));
			if (op == 1) {
				ge.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do gerente")));
				ge.setSalario(
						Double.parseDouble(JOptionPane.showInputDialog("Qual o salário base de " + ge.getNome())));
				ge.setCargo("Gerente");
				JOptionPane.showMessageDialog(null, "Dados do Funcionario\n" + "Cargo: " + ge.getCargo() + "\n"
						+ "Nome: " + ge.getNome() + "\n" + "Salario: R$" + ge.calculaSalario());
			} else if (op == 2) {
				at.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do assistente")));
				at.setSalario(
						Double.parseDouble(JOptionPane.showInputDialog("Qual o salário base de " + at.getNome())));
				at.setCargo("Assistente Técnico");
				JOptionPane.showMessageDialog(null, "Dados do Funcionario\n" + "Cargo: " + at.getCargo() + "\n"
						+ "Nome: " + at.getNome() + "\n" + "Salario: R$" + at.calculaSalario());
			} else if (op == 3) {
				aa.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do assistente")));
				aa.setSalario(
						Double.parseDouble(JOptionPane.showInputDialog("Qual o salário base de " + aa.getNome())));
				aa.setCargo("Assistente Administrativo");
				((Ex02AssistenteAdministrativo) aa).setNumMatricula(String.valueOf(JOptionPane.showInputDialog("Qual o numero de matricula")));
				((Ex02AssistenteAdministrativo) aa).setTurno(String.valueOf(JOptionPane.showInputDialog("Qual o turno")));
				JOptionPane.showMessageDialog(null, "Dados do Funcionario\n" + "Cargo: " + aa.getCargo() + "\n"
						+ "Nome: " + aa.getNome() + "\n" + "Salario: R$" + aa.calculaSalario());
			} else {
				break;
			}
		}
	}
}
