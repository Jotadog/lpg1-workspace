package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex01Principal {
	public static void main(String[] args) {
		Ex01Gerente ge = new Ex01Gerente();
		Ex01AssistenteTecnico at = new Ex01AssistenteTecnico();
		Ex01AssistenteAdministrativo aa = new Ex01AssistenteAdministrativo();
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
						+ "Nome: " + ge.getNome() + "\n" + "Salario: R$" + ge.calculaGerente());
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
				aa.setNumMatricula(String.valueOf(JOptionPane.showInputDialog("Qual o numero de matricula")));
				aa.setTurno(String.valueOf(JOptionPane.showInputDialog("Qual o turno")));
				JOptionPane.showMessageDialog(null, "Dados do Funcionario\n" + "Cargo: " + aa.getCargo() + "\n"
						+ "Nome: " + aa.getNome() + "\n" + "Salario: R$" + aa.calculaSalario());
			} else {
				break;
			}
		}
	}
}
