package br.edu.ifc.videira.LISTA09;

import javax.swing.JOptionPane;

public class Ex01UsaPessoa {
	public static void main(String[] args) {
		Ex01Pessoa pessoa1 = new Ex01Pessoa("Mario", "Lopes");
		Ex01Funcionario pessoa2 = new Ex01Funcionario("Lucas", "Mendes", 123, 2000);
		Ex01Professor pessoa3 = new Ex01Professor("Rafael", "Lira", 124, 500);

		JOptionPane.showMessageDialog(null, "e) Nomes: \n" + pessoa1.getNomeCompleto() + "\n"
				+ pessoa2.getNomeCompleto() + "\n" + pessoa3.getNomeCompleto());
		JOptionPane.showMessageDialog(null, "f) Salario de " + pessoa2.getNomeCompleto() + ": \n1ª parcela"
				+ pessoa2.getSalarioPrimeiraParcela() + "\n" + "2ª parcela " + pessoa2.getSalarioSegundaParcela());
		JOptionPane.showMessageDialog(null, "f) Salario de " + pessoa3.getNomeCompleto() + ": \n1ª parcela"
				+ pessoa3.getSalarioPrimeiraParcela() + "\n" + "2ª parcela " + pessoa3.getSalarioSegundaParcela());
	}
}
