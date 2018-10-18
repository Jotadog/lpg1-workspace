package br.edu.ifc.videira.LISTA10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ex03Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfAp;
	private JTextField tfLp;
	private JTextField tfA;
	private JTextField tfLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex03Principal frame = new Ex03Principal();
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
	public Ex03Principal() {
		Ex03Calculadora ca = new Ex03Calculadora();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCalculadoraDeAzulejos = new JLabel("Calculadora de azulejos");
		lblCalculadoraDeAzulejos.setBackground(Color.WHITE);
		lblCalculadoraDeAzulejos.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCalculadoraDeAzulejos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeAzulejos.setBounds(12, 12, 426, 17);
		contentPane.add(lblCalculadoraDeAzulejos);

		JLabel lblColoque = new JLabel("Altura da parede");
		lblColoque.setFont(new Font("Dialog", Font.BOLD, 14));
		lblColoque.setBounds(79, 58, 132, 17);
		contentPane.add(lblColoque);

		JLabel lblLarguraDaParede = new JLabel("Largura da parede");
		lblLarguraDaParede.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLarguraDaParede.setBounds(79, 87, 132, 17);
		contentPane.add(lblLarguraDaParede);

		JLabel lblAlturaDoAzulejo = new JLabel("Altura do azulejo");
		lblAlturaDoAzulejo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAlturaDoAzulejo.setBounds(79, 116, 132, 17);
		contentPane.add(lblAlturaDoAzulejo);

		JLabel lblLarguraDoAzulejo = new JLabel("Largura do azulejo");
		lblLarguraDoAzulejo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLarguraDoAzulejo.setBounds(79, 145, 132, 17);
		contentPane.add(lblLarguraDoAzulejo);

		JLabel lblQuantidadeDeAzulejos = new JLabel("Quantidade de azulejos:");
		lblQuantidadeDeAzulejos.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQuantidadeDeAzulejos.setBounds(90, 311, 191, 17);
		contentPane.add(lblQuantidadeDeAzulejos);

		JButton btnCalcular = new JButton("Calcular");

		btnCalcular.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCalcular.setBounds(158, 250, 105, 27);
		contentPane.add(btnCalcular);

		JLabel lblQuantidade = new JLabel("0");
		lblQuantidade.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQuantidade.setBounds(299, 311, 60, 17);
		contentPane.add(lblQuantidade);

		tfAp = new JTextField();
		tfAp.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfAp.setBounds(245, 55, 114, 21);
		contentPane.add(tfAp);
		tfAp.setColumns(10);

		tfLp = new JTextField();
		tfLp.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfLp.setColumns(10);
		tfLp.setBounds(245, 84, 114, 21);
		contentPane.add(tfLp);

		tfA = new JTextField();
		tfA.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfA.setColumns(10);
		tfA.setBounds(245, 113, 114, 21);
		contentPane.add(tfA);

		tfLa = new JTextField();
		tfLa.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfLa.setColumns(10);
		tfLa.setBounds(245, 142, 114, 21);
		contentPane.add(tfLa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quadrado", "Retangular", "Triangular de lados iguais", "Triangular de lados diferentes"}));
		comboBox.setBounds(158, 184, 201, 26);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Tipo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(79, 189, 78, 17);
		contentPane.add(lblNewLabel);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setA(Double.parseDouble(tfA.getText()));
				ca.setAp(Double.parseDouble(tfAp.getText()));
				ca.setLa(Double.parseDouble(tfLa.getText()));
				ca.setLp(Double.parseDouble(tfLp.getText()));
				lblQuantidade.setText(""+ca.calculaAzulejos(comboBox.getSelectedIndex()));
			}
		});
	}

}
