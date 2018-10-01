package br.edu.ifc.videira.LISTA07;

import javax.swing.JOptionPane;

public class Ex06Principal {
	public static void main(String[] args) {
		int matricula;
		String nome;
		String email;
		String curso;
		int fone;
		int cel;
		String endereco;
		Ex06Aluno al = new Ex06Aluno();
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nº da matricula"));
		nome = String.valueOf(JOptionPane.showInputDialog("Coloque o nome"));
		email = String.valueOf(JOptionPane.showInputDialog("Coloque o email"));
		curso = String.valueOf(JOptionPane.showInputDialog("Coloque o curso"));
		fone = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nº do telefone"));
		cel = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nº do celular"));
		endereco = String.valueOf(JOptionPane.showInputDialog("Coloque o endereco"));

		al.setMatricula(matricula);
		al.setNome(nome);
		al.setEmail(email);
		al.setCurso(curso);
		al.setFone(fone);
		al.setCel(cel);
		al.setEndereco(endereco);

		Ex06Aluno al2 = new Ex06Aluno(matricula, nome, email, curso, fone, cel, endereco);
		JOptionPane.showMessageDialog(null, al2.getNome() + "\n" + al2.getMatricula() + "\n" + al2.getEmail() + "\n"
				+ al2.getCurso() + "\n" + al2.getFone() + "\n" + al2.getCel() + "\n" + al2.getEndereco());

	}
}
