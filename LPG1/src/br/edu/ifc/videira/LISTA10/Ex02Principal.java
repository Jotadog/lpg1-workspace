package br.edu.ifc.videira.LISTA10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ex02Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfPrecoNovo;
	private JTextField tfToneladas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfAnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02Principal frame = new Ex02Principal();
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
	public Ex02Principal() {
		Ex02Moto mt = new Ex02Moto();
		Ex02Automovel au = new Ex02Automovel();
		Ex02Caminhao ca = new Ex02Caminhao();
		DecimalFormat df = new DecimalFormat("R$ #00.00");
		JLabel lblSelecioneOTipo = new JLabel("Selecione o tipo de veículo");
		JRadioButton rdCaminhao = new JRadioButton("Caminhão");
		JRadioButton rdMoto = new JRadioButton("Moto");
		JLabel lblPreoDoVeculo = new JLabel("Preço do veículo novo");
		tfPrecoNovo = new JTextField();
		JLabel lblCapacidadeEmTonaladas = new JLabel("Capacidade em tonaladas");
		tfToneladas = new JTextField();
		JButton btnFinalizar = new JButton("Finalizar");
		JLabel lblValor = new JLabel("Valor atual");
		JLabel lblValorSeguro = new JLabel("Valor do seguro");
		JLabel lblValorDoIpva = new JLabel("Valor do IPVA");
		JLabel lblValorAtual = new JLabel("vazio");
		JLabel lblSeguro = new JLabel("vazio");
		JLabel lblIpva = new JLabel("vazio");
		tfAnos = new JTextField();
		JRadioButton rdAutomovel = new JRadioButton("Automóvel");
		rdAutomovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfToneladas.setVisible(false);
				lblCapacidadeEmTonaladas.setVisible(false);
			}
		});

		tfToneladas.setVisible(false);
		lblCapacidadeEmTonaladas.setVisible(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		rdAutomovel.setSelected(true);
		buttonGroup.add(rdAutomovel);
		rdAutomovel.setBounds(226, 19, 90, 25);
		contentPane.add(rdAutomovel);

		lblSelecioneOTipo.setBounds(18, 52, 158, 17);
		lblSelecioneOTipo.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblSelecioneOTipo);

		rdCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdCaminhao.isSelected()) {
					lblCapacidadeEmTonaladas.setVisible(true);
					tfToneladas.setVisible(true);
				}
			}
		});
		buttonGroup.add(rdCaminhao);
		rdCaminhao.setBounds(226, 51, 86, 25);
		contentPane.add(rdCaminhao);

		rdMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfToneladas.setVisible(false);
				lblCapacidadeEmTonaladas.setVisible(false);
			}
		});
		buttonGroup.add(rdMoto);
		rdMoto.setBounds(226, 83, 55, 25);
		contentPane.add(rdMoto);

		lblPreoDoVeculo.setBounds(18, 144, 158, 17);
		lblPreoDoVeculo.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblPreoDoVeculo);

		tfPrecoNovo.setBounds(206, 142, 121, 21);
		contentPane.add(tfPrecoNovo);
		tfPrecoNovo.setColumns(10);
		lblCapacidadeEmTonaladas.setBounds(18, 173, 172, 17);
		contentPane.add(lblCapacidadeEmTonaladas);
		tfToneladas.setBounds(206, 175, 121, 21);
		contentPane.add(tfToneladas);
		tfToneladas.setColumns(10);
		
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdAutomovel.isSelected()) {
					au.setAnos(Integer.parseInt(tfAnos.getText()));
					au.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					lblValorAtual.setText(df.format(au.getValorNovo()));
					lblSeguro.setText(df.format(au.seguro()));
					lblIpva.setText(df.format(au.ipva()));
				} else if(rdMoto.isSelected()) {
					mt.setAnos(Integer.parseInt(tfAnos.getText()));
					mt.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					lblValorAtual.setText(df.format(mt.getValorNovo()));
					lblSeguro.setText("Não é possível");
					lblIpva.setText(df.format(mt.ipva()));
				} else {
					ca.setAnos(Integer.parseInt(tfAnos.getText()));
					ca.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					ca.setToneladas(Double.parseDouble(tfToneladas.getText()));
					lblValorAtual.setText(df.format(ca.getValorNovo()));
					lblSeguro.setText(df.format(ca.seguro()));
					lblIpva.setText(df.format(ca.ipva()));
				}
			}
		});
		btnFinalizar.setBounds(155, 252, 105, 27);
		contentPane.add(btnFinalizar);

		lblValor.setBounds(111, 307, 90, 17);
		contentPane.add(lblValor);

		lblValorSeguro.setBounds(111, 336, 105, 17);
		contentPane.add(lblValorSeguro);

		lblValorDoIpva.setBounds(111, 367, 105, 17);
		contentPane.add(lblValorDoIpva);

		lblValorAtual.setBounds(252, 307, 105, 17);
		contentPane.add(lblValorAtual);

		lblSeguro.setBounds(252, 336, 158, 17);
		contentPane.add(lblSeguro);

		lblIpva.setBounds(252, 367, 105, 17);
		contentPane.add(lblIpva);
		
		JLabel lblNewLabel = new JLabel("Anos de uso");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(18, 202, 129, 17);
		contentPane.add(lblNewLabel);
		
		tfAnos.setBounds(206, 208, 121, 21);
		contentPane.add(tfAnos);
		tfAnos.setColumns(10);
	}

}
