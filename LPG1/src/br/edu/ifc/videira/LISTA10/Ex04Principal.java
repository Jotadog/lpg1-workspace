package br.edu.ifc.videira.LISTA10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex04Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfEmail;
	private JTextField tfSetor;
	private JTextField tfNumeroPessoal;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfParentesco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04Principal frame = new Ex04Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex04Principal() {
		Ex04ColegaTrabalho ct = new Ex04ColegaTrabalho();
		Ex04Amigo am = new Ex04Amigo();
		Ex04Parente pa = new Ex04Parente();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAgenda = new JLabel("Agenda");
		lblAgenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenda.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAgenda.setBounds(12, 0, 426, 17);
		contentPane.add(lblAgenda);

		JLabel lblNewLabel = new JLabel("Escolha o tipo de contato:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 34, 199, 17);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Colega de trabalho", "Amigo", "Parente" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(220, 29, 208, 26);
		contentPane.add(comboBox);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNome.setBounds(22, 75, 60, 17);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 13));
		lblIdade.setBounds(22, 104, 60, 17);
		contentPane.add(lblIdade);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSexo.setBounds(22, 133, 60, 17);
		contentPane.add(lblSexo);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 13));
		lblEmail.setBounds(22, 161, 60, 17);
		contentPane.add(lblEmail);

		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSetor.setBounds(22, 192, 60, 17);
		contentPane.add(lblSetor);

		JLabel lblNumeroPessoal = new JLabel("Numero pessoal");
		lblNumeroPessoal.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNumeroPessoal.setBounds(22, 225, 140, 17);
		contentPane.add(lblNumeroPessoal);

		tfNome = new JTextField();
		tfNome.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfNome.setBounds(83, 75, 236, 21);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		tfIdade = new JTextField();
		tfIdade.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfIdade.setColumns(10);
		tfIdade.setBounds(83, 102, 60, 21);
		contentPane.add(tfIdade);

		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfEmail.setColumns(10);
		tfEmail.setBounds(83, 162, 236, 21);
		contentPane.add(tfEmail);

		tfSetor = new JTextField();
		tfSetor.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfSetor.setColumns(10);
		tfSetor.setBounds(83, 190, 236, 21);
		contentPane.add(tfSetor);

		tfNumeroPessoal = new JTextField();
		tfNumeroPessoal.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfNumeroPessoal.setColumns(10);
		tfNumeroPessoal.setBounds(155, 223, 164, 21);
		contentPane.add(tfNumeroPessoal);

		JRadioButton rdMasculino = new JRadioButton("Masculino");
		rdMasculino.setSelected(true);
		buttonGroup.add(rdMasculino);
		rdMasculino.setFont(new Font("Dialog", Font.BOLD, 13));
		rdMasculino.setBounds(83, 129, 130, 25);
		contentPane.add(rdMasculino);

		JRadioButton rdFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdFeminino);
		rdFeminino.setFont(new Font("Dialog", Font.BOLD, 13));
		rdFeminino.setBounds(220, 129, 130, 25);
		contentPane.add(rdFeminino);

		JLabel lblParentesco = new JLabel("Parentesco");
		lblParentesco.setFont(new Font("Dialog", Font.BOLD, 13));
		lblParentesco.setBounds(22, 252, 95, 17);
		contentPane.add(lblParentesco);

		tfParentesco = new JTextField();
		tfParentesco.setFont(new Font("Dialog", Font.PLAIN, 13));
		tfParentesco.setColumns(10);
		tfParentesco.setBounds(135, 252, 184, 21);
		contentPane.add(tfParentesco);

		JButton btnCadastrar = new JButton("Cadastrar");

		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCadastrar.setBounds(155, 299, 105, 27);
		contentPane.add(btnCadastrar);

		lblSetor.setVisible(true);
		tfSetor.setVisible(true);
		lblNumeroPessoal.setVisible(false);
		tfNumeroPessoal.setVisible(false);
		lblParentesco.setVisible(false);
		tfParentesco.setVisible(false);

		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					lblSetor.setVisible(true);
					tfSetor.setVisible(true);
					lblNumeroPessoal.setVisible(false);
					tfNumeroPessoal.setVisible(false);
					lblParentesco.setVisible(false);
					tfParentesco.setVisible(false);
				} else if (comboBox.getSelectedIndex() == 1) {
					lblSetor.setVisible(false);
					tfSetor.setVisible(false);
					lblNumeroPessoal.setVisible(true);
					tfNumeroPessoal.setVisible(true);
					lblParentesco.setVisible(false);
					tfParentesco.setVisible(false);
				} else {
					lblSetor.setVisible(false);
					tfSetor.setVisible(false);
					lblNumeroPessoal.setVisible(false);
					tfNumeroPessoal.setVisible(false);
					lblParentesco.setVisible(true);
					tfParentesco.setVisible(true);
				}
			}

			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}
		});

		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					ct.setEmail(tfEmail.getText());
					ct.setIdade(Integer.parseInt(tfIdade.getText()));
					ct.setNome(tfNome.getText());
					ct.setSetor(tfSetor.getText());
					if (rdMasculino.isSelected()) {
						ct.setSexo(rdMasculino.getText());
					} else {
						ct.setSexo(rdFeminino.getText());
					}
					JOptionPane.showMessageDialog(btnCadastrar, ct.imprime());
				} else if (comboBox.getSelectedIndex() == 1) {
					am.setEmail(tfEmail.getText());
					am.setIdade(Integer.parseInt(tfIdade.getText()));
					am.setNome(tfNome.getText());
					am.setNumeroPessoal(Integer.parseInt(tfNumeroPessoal.getText()));
					if (rdMasculino.isSelected()) {
						am.setSexo(rdMasculino.getText());
					} else {
						am.setSexo(rdFeminino.getText());
					}
					JOptionPane.showMessageDialog(btnCadastrar, am.imprime());
				} else {
					pa.setEmail(tfEmail.getText());
					pa.setIdade(Integer.parseInt(tfIdade.getText()));
					pa.setNome(tfNome.getText());
					pa.setParentesco(tfParentesco.getText());
					if (rdMasculino.isSelected()) {
						pa.setSexo(rdMasculino.getText());
					} else {
						pa.setSexo(rdFeminino.getText());
					}
					JOptionPane.showMessageDialog(btnCadastrar, pa.imprime());
				}
			}
		});

	}

}
