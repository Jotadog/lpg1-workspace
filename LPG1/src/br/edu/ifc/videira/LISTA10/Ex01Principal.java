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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Ex01Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	JRadioButton rdNotebook = new JRadioButton("Notebook");
	JRadioButton rdDesktop = new JRadioButton("Desktop");
	JComboBox cbPlacaMae = new JComboBox();
	JComboBox cbProcessador = new JComboBox();
	JComboBox cbHd = new JComboBox();
	JComboBox cbMemoria = new JComboBox();
	JComboBox cbPlacaVideo = new JComboBox();
	JCheckBox chGarantia = new JCheckBox("Garantia extendida");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 150,00");
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 120,00");
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 180,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 50,00");
	Ex01Notebook no = new Ex01Notebook();
	Ex01Desktop de = new Ex01Desktop();
	private final JButton btnNewButton = new JButton("Finalizar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01Principal frame = new Ex01Principal();
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
	public Ex01Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 407);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEscolhaAsOpes = new JLabel("Escolha as op\u00E7\u00F5es desejadas");
		lblEscolhaAsOpes.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaAsOpes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblEscolhaAsOpes.setBounds(122, 11, 232, 20);
		contentPane.add(lblEscolhaAsOpes);

		rdNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chPasta.setEnabled(true);
				chCarregador.setEnabled(true);
				chEstabilizador.setSelected(false);
				chTeclado.setSelected(false);
				chEstabilizador.setEnabled(false);
				chTeclado.setEnabled(false);
			}
		});
		rdNotebook.setSelected(true);
		buttonGroup.add(rdNotebook);
		rdNotebook.setHorizontalAlignment(SwingConstants.LEFT);
		rdNotebook.setBounds(95, 38, 98, 23);
		contentPane.add(rdNotebook);

		buttonGroup.add(rdDesktop);
		rdDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chPasta.setEnabled(false);
				chCarregador.setEnabled(false);
				chPasta.setSelected(false);
				chCarregador.setSelected(false);
				chEstabilizador.setEnabled(true);
				chTeclado.setEnabled(true);
			}
		});
		rdDesktop.setHorizontalAlignment(SwingConstants.LEFT);
		rdDesktop.setBounds(254, 38, 100, 23);
		contentPane.add(rdDesktop);

		JLabel lblPlacaMe = new JLabel("Placa m\u00E3e:");
		lblPlacaMe.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblPlacaMe.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlacaMe.setBounds(56, 70, 110, 20);
		contentPane.add(lblPlacaMe);

		cbPlacaMae.setModel(new DefaultComboBoxModel(
				new String[] { "Modelo 1 - R$ 400,00", "Modelo 2- R$ 500,00", "Modelo 3 - R$ 600,00" }));
		cbPlacaMae.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
			}

			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		cbPlacaMae.setBounds(197, 68, 157, 20);
		contentPane.add(cbPlacaMae);

		JLabel lblProcessador = new JLabel("Processador:");
		lblProcessador.setHorizontalAlignment(SwingConstants.LEFT);
		lblProcessador.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblProcessador.setBounds(56, 101, 124, 20);
		contentPane.add(lblProcessador);

		cbProcessador.setModel(new DefaultComboBoxModel(
				new String[] { "Modelo 1 - R$ 500,00", "Modelo 2 - R$ 600,00", "Modelo 3 - R$ 700,00" }));
		cbProcessador.setBounds(197, 101, 157, 20);
		contentPane.add(cbProcessador);

		JLabel lblHd = new JLabel("HD:");
		lblHd.setHorizontalAlignment(SwingConstants.LEFT);
		lblHd.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblHd.setBounds(56, 132, 83, 20);
		contentPane.add(lblHd);

		cbHd.setModel(new DefaultComboBoxModel(
				new String[] { "Modelo 1 - R$ 300,00", "Modelo 2 - R$ 400,00", "Modelo 3 - R$ 500,00" }));
		cbHd.setBounds(197, 132, 157, 20);
		contentPane.add(cbHd);

		JLabel lblMemria = new JLabel("Mem\u00F3ria:");
		lblMemria.setHorizontalAlignment(SwingConstants.LEFT);
		lblMemria.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblMemria.setBounds(56, 163, 110, 20);
		contentPane.add(lblMemria);

		cbMemoria.setModel(new DefaultComboBoxModel(
				new String[] { "Modelo 1 - R$ 200,00", "Modelo 2 - R$ 400,00", "Modelo 3 - R$ 600,00" }));
		cbMemoria.setBounds(197, 163, 157, 20);
		contentPane.add(cbMemoria);

		JLabel lblPlacaDeVdeo = new JLabel("Placa de v\u00EDdeo:");
		lblPlacaDeVdeo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlacaDeVdeo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblPlacaDeVdeo.setBounds(56, 193, 137, 20);
		contentPane.add(lblPlacaDeVdeo);

		cbPlacaVideo.setModel(new DefaultComboBoxModel(
				new String[] { "Modelo 1 - R$ 500,00", "Modelo 1 - R$ 700,00", "Modelo 1 - R$ 1000,00" }));
		cbPlacaVideo.setBounds(197, 193, 157, 20);
		contentPane.add(cbPlacaVideo);

		chGarantia.setBounds(174, 220, 148, 23);
		contentPane.add(chGarantia);

		chPasta.setBounds(56, 246, 136, 23);
		contentPane.add(chPasta);

		chCarregador.setBounds(44, 272, 173, 23);
		contentPane.add(chCarregador);
		chEstabilizador.setEnabled(false);

		chEstabilizador.setBounds(222, 247, 178, 23);
		contentPane.add(chEstabilizador);
		chTeclado.setEnabled(false);

		chTeclado.setBounds(221, 272, 157, 23);
		contentPane.add(chTeclado);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdNotebook.isSelected()) {
					if (cbPlacaMae.getSelectedIndex() == 0) {
						no.setPlacaMae(400);
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						no.setPlacaMae(500);
					} else {
						no.setPlacaMae(600);
					}

					no.setConfig("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");

					if (cbProcessador.getSelectedIndex() == 0) {
						no.setProcessador(500);
					} else if (cbProcessador.getSelectedIndex() == 1) {
						no.setProcessador(600);
					} else {
						no.setProcessador(700);
					}

					no.setConfig("Processador: " + cbProcessador.getSelectedItem() + "\n");

					if (cbHd.getSelectedIndex() == 0) {
						no.setHd(300);
					} else if (cbHd.getSelectedIndex() == 1) {
						no.setHd(400);
					} else {
						no.setHd(500);
					}

					no.setConfig("HD: " + cbHd.getSelectedItem() + "\n");

					if (cbMemoria.getSelectedIndex() == 0) {
						no.setMemoria(200);
					} else if (cbMemoria.getSelectedIndex() == 1) {
						no.setMemoria(400);
					} else {
						no.setMemoria(600);
					}

					no.setConfig("Memoria: " + cbMemoria.getSelectedItem() + "\n");

					if (cbPlacaVideo.getSelectedIndex() == 0) {
						no.setPlacaVideo(500);
					} else if (cbPlacaVideo.getSelectedIndex() == 1) {
						no.setPlacaVideo(700);
					} else {
						no.setPlacaVideo(1000);
					}

					no.setConfig("Placa de video: " + cbPlacaVideo.getSelectedItem() + "\n");

					if (chPasta.isSelected()) {
						no.setPasta(150);
						no.setConfig(chPasta.getText() + "\n");
					}

					if (chCarregador.isSelected()) {
						no.setCarregador(120);
						no.setConfig(chCarregador.getText() + "\n");
					}

					if (chGarantia.isSelected()) {
						no.setGarantia(no.calculaGarantia());
						no.setConfig("Garantia extendida\n");
					}

					JOptionPane.showMessageDialog(null, no.imprime());
					no.zera();
				} else {
					if (cbPlacaMae.getSelectedIndex() == 0) {
						de.setPlacaMae(400);
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						de.setPlacaMae(500);
					} else {
						de.setPlacaMae(600);
					}

					de.setConfig("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");

					if (cbProcessador.getSelectedIndex() == 0) {
						de.setProcessador(500);
					} else if (cbProcessador.getSelectedIndex() == 1) {
						de.setProcessador(600);
					} else {
						de.setProcessador(700);
					}

					de.setConfig("Processador: " + cbProcessador.getSelectedItem() + "\n");

					if (cbHd.getSelectedIndex() == 0) {
						de.setHd(300);
					} else if (cbHd.getSelectedIndex() == 1) {
						de.setHd(400);
					} else {
						de.setHd(500);
					}

					de.setConfig("HD: " + cbHd.getSelectedItem() + "\n");

					if (cbMemoria.getSelectedIndex() == 0) {
						de.setMemoria(200);
					} else if (cbMemoria.getSelectedIndex() == 1) {
						de.setMemoria(400);
					} else {
						de.setMemoria(600);
					}

					de.setConfig("Memoria: " + cbMemoria.getSelectedItem() + "\n");

					if (cbPlacaVideo.getSelectedIndex() == 0) {
						de.setPlacaVideo(500);
					} else if (cbPlacaVideo.getSelectedIndex() == 1) {
						de.setPlacaVideo(700);
					} else {
						de.setPlacaVideo(1000);
					}

					de.setConfig("Placa de video: " + cbPlacaVideo.getSelectedItem() + "\n");

					if (chTeclado.isSelected()) {
						de.setTeclado(50);
						de.setConfig(chTeclado.getText() + "\n");
					}

					if (chEstabilizador.isSelected()) {
						de.setEstabilizador(180);
						de.setConfig(chEstabilizador.getText() + "\n");
					}

					if (chGarantia.isSelected()) {
						de.setGarantia(de.calculaGarantia());
						de.setConfig("Garantia extendida\n");
					}

					JOptionPane.showMessageDialog(null, de.imprime());
					de.zera();
				}
			}
		});
		btnNewButton.setBounds(157, 322, 124, 23);

		contentPane.add(btnNewButton);
	}
}
