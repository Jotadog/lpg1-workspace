package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class PrincipalCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	JRadioButton rdSoma = new JRadioButton("Soma");
	JRadioButton rdSubtracao = new JRadioButton("Subtra\u00E7\u00E3o");
	JRadioButton rdMultiplicacao = new JRadioButton("Multiplica\u00E7\u00E3o");
	JRadioButton rdDivisao = new JRadioButton("Divis\u00E3o");
	Calculadora ca = new Calculadora();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCalculadora frame = new PrincipalCalculadora();
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
	public PrincipalCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 533);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		mnNewMenu_1.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		mnNewMenu_1.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblCalculadora.setForeground(Color.BLACK);
		lblCalculadora.setBackground(Color.WHITE);
		lblCalculadora.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalculadora.setBounds(74, 11, 86, 14);
		contentPane.add(lblCalculadora);

		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		lblNmero.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		lblNmero.setBounds(10, 39, 74, 14);
		contentPane.add(lblNmero);

		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		tfNum1.setBounds(94, 36, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);

		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		tfNum2.setColumns(10);
		tfNum2.setBounds(94, 66, 86, 20);
		contentPane.add(tfNum2);

		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		lblNmero_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		lblNmero_1.setBounds(10, 69, 74, 14);
		contentPane.add(lblNmero_1);

		JButton btnCalcular = new JButton("+");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				tfResult.setText(String.valueOf(ca.soma()));
			}
		});
		btnCalcular.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setBackground(Color.ORANGE);
		btnCalcular.setBounds(10, 110, 46, 23);
		contentPane.add(btnCalcular);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		lblResultado.setBounds(33, 354, 74, 14);
		contentPane.add(lblResultado);

		tfResult = new JTextField();
		tfResult.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		tfResult.setColumns(10);
		tfResult.setBounds(117, 351, 86, 20);
		contentPane.add(tfResult);

		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				tfResult.setText(String.valueOf(ca.subtracao()));
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		button.setBackground(Color.ORANGE);
		button.setBounds(66, 110, 41, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				tfResult.setText(String.valueOf(ca.multiplicacao()));
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(127, 110, 41, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				tfResult.setText(String.valueOf(ca.divisao()));
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(183, 110, 41, 23);
		contentPane.add(button_2);

		JComboBox cbOperacao = new JComboBox();
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}

			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				if (cbOperacao.getSelectedIndex() == 0) {
					tfResult.setText("" + ca.soma());
				} else if (cbOperacao.getSelectedIndex() == 1) {
					tfResult.setText("" + ca.subtracao());
				} else if (cbOperacao.getSelectedIndex() == 2) {
					tfResult.setText("" + ca.multiplicacao());
				} else if (cbOperacao.getSelectedIndex() == 3) {
					tfResult.setText("" + ca.divisao());
				}
			}

			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		cbOperacao.setModel(new DefaultComboBoxModel(
				new String[] { "Soma", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o" }));
		cbOperacao.setBounds(66, 144, 124, 20);
		contentPane.add(cbOperacao);

		JButton btCalcular = new JButton("Calcular");
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ca.setN1(Double.parseDouble(tfNum1.getText()));
				ca.setN2(Double.parseDouble(tfNum2.getText()));
				if (cbOperacao.getSelectedIndex() == 0) {
					tfResult.setText("" + ca.soma());
				} else if (cbOperacao.getSelectedIndex() == 1) {
					tfResult.setText("" + ca.subtracao());
				} else if (cbOperacao.getSelectedIndex() == 2) {
					tfResult.setText("" + ca.multiplicacao());
				} else if (cbOperacao.getSelectedIndex() == 3) {
					tfResult.setText("" + ca.divisao());
				}
				
				if(rdSoma.isSelected()) {
					tfResult.setText("" + ca.soma());
				} else if(rdSubtracao.isSelected()) {
					tfResult.setText("" + ca.subtracao());
				} else if(rdMultiplicacao.isSelected()) {
					tfResult.setText("" + ca.multiplicacao());
				} else if(rdDivisao.isSelected()) {
					tfResult.setText("" + ca.divisao());
				}
			}
		});
		btCalcular.setBounds(74, 282, 106, 23);
		contentPane.add(btCalcular);
		
		
		buttonGroup.add(rdSoma);
		rdSoma.setSelected(true);
		rdSoma.setBackground(Color.YELLOW);
		rdSoma.setBounds(74, 175, 109, 23);
		contentPane.add(rdSoma);
		buttonGroup.add(rdSubtracao);
		rdSubtracao.setBackground(Color.YELLOW);
		rdSubtracao.setBounds(74, 201, 109, 23);
		contentPane.add(rdSubtracao);

		buttonGroup.add(rdMultiplicacao);
		rdMultiplicacao.setBackground(Color.YELLOW);
		rdMultiplicacao.setBounds(74, 227, 109, 23);
		contentPane.add(rdMultiplicacao);

		buttonGroup.add(rdDivisao);
		rdDivisao.setBackground(Color.YELLOW);
		rdDivisao.setBounds(74, 252, 109, 23);
		contentPane.add(rdDivisao);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
