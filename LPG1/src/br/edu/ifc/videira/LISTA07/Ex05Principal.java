package br.edu.ifc.videira.LISTA07;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex05Principal {
	public static void main(String[] args) {
		Ex05Livro l1 = new Ex05Livro("Fundamentos da programação de computadores", "Ascencio", 2012);
		Ex05Livro l2 = new Ex05Livro("Programação com C", "Professor X", 2010);
		Ex05Livro l3 = new Ex05Livro("Programação com Java", "Professor Y", 2013);
		Ex05Livro l4 = new Ex05Livro("Programação com JavaScript", "Mestre Splinter", 2024);
		ArrayList<Ex05Livro> livros = new ArrayList<Ex05Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);
		for (Ex05Livro livro : livros) {
			JOptionPane.showMessageDialog(null,
					"Titulo: " + livro.getTitulo() + "\n" + "Autor: " + livro.getAutor() + "\nAno: " + livro.getAno());
		}
	}
}
