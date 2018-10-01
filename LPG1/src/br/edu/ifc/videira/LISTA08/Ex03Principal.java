package br.edu.ifc.videira.LISTA08;

import javax.swing.JOptionPane;

public class Ex03Principal {
	public static void main(String[] args) {
		Ex03Animal cachorro = new Ex03Cachorro("Lessie", "Lula");
		Ex03Animal gato = new Ex03Gato("Tobias", "Persa");

		JOptionPane.showMessageDialog(null,
				"Cachorro: " + cachorro.getNome() + "\n" + "Raça: " + cachorro.getRaca() + "\n"
						+ ((Ex03Cachorro) cachorro).late() + "\n\n" + "Gato: " + gato.getNome() + "\n" + "Raça: "
						+ gato.getRaca() + "\n" + ((Ex03Gato) gato).mia());
	}
}
