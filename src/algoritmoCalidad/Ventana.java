package algoritmoCalidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelFunc = new JPanel();
		frame.getContentPane().add(panelFunc, "name_583226343606795");
		panelFunc.setLayout(null);
		
		JLabel lblAlgoritmoDeCalidad = new JLabel("Algoritmo de Calidad");
		lblAlgoritmoDeCalidad.setForeground(new Color(0, 0, 0));
		lblAlgoritmoDeCalidad.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAlgoritmoDeCalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgoritmoDeCalidad.setBounds(170, 11, 267, 47);
		panelFunc.add(lblAlgoritmoDeCalidad);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa: Funcionalidad");
		lblCategora.setForeground(SystemColor.textHighlight);
		lblCategora.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategora.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategora.setBounds(10, 66, 288, 24);
		panelFunc.add(lblCategora);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 602, 13);
		panelFunc.add(separator);
		
		JTextPane txtpnSeleccioneCulesDe = new JTextPane();
		txtpnSeleccioneCulesDe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnSeleccioneCulesDe.setBackground(SystemColor.menu);
		txtpnSeleccioneCulesDe.setEditable(false);
		txtpnSeleccioneCulesDe.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		txtpnSeleccioneCulesDe.setBounds(10, 125, 288, 47);
		panelFunc.add(txtpnSeleccioneCulesDe);
		
		JTextPane txtpnIndiqueCuntosRegistros = new JTextPane();
		txtpnIndiqueCuntosRegistros.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		txtpnIndiqueCuntosRegistros.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnIndiqueCuntosRegistros.setEditable(false);
		txtpnIndiqueCuntosRegistros.setBackground(SystemColor.menu);
		txtpnIndiqueCuntosRegistros.setBounds(324, 125, 288, 47);
		panelFunc.add(txtpnIndiqueCuntosRegistros);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Encriptaci\u00F3n de datos");
		chckbxNewCheckBox.setBounds(20, 179, 267, 23);
		panelFunc.add(chckbxNewCheckBox);
		
		JCheckBox chckbxInicioDeSesin = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		chckbxInicioDeSesin.setBounds(20, 218, 267, 23);
		panelFunc.add(chckbxInicioDeSesin);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(308, 126, 6, 146);
		panelFunc.add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "Uno", "Mas de 1"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(361, 204, 133, 20);
		panelFunc.add(comboBox);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.setBounds(494, 293, 89, 23);
		panelFunc.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(52, 293, 89, 23);
		panelFunc.add(btnCancelar);
		
		JPanel panelEfi = new JPanel();
		panelEfi.setLayout(null);
		frame.getContentPane().add(panelEfi, "name_585447184834399");
		
		JLabel label = new JLabel("Algoritmo de Calidad");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setBounds(170, 11, 267, 47);
		panelEfi.add(label);
		
		JLabel label_1 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(SystemColor.textHighlight);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(10, 66, 288, 24);
		panelEfi.add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 101, 602, 13);
		panelEfi.add(separator_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(10, 125, 288, 47);
		panelEfi.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_1.setEditable(false);
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(324, 125, 288, 47);
		panelEfi.add(textPane_1);
		
		JCheckBox checkBox = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox.setBounds(20, 179, 267, 23);
		panelEfi.add(checkBox);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(308, 126, 6, 146);
		panelEfi.add(separator_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(361, 204, 133, 20);
		panelEfi.add(comboBox_1);
		
		JButton button = new JButton("Siguiente");
		button.setBounds(494, 293, 89, 23);
		panelEfi.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(52, 293, 89, 23);
		panelEfi.add(button_1);
		
		JPanel panelFia = new JPanel();
		panelFia.setLayout(null);
		frame.getContentPane().add(panelFia, "name_585451753393896");
		
		JLabel label_2 = new JLabel("Algoritmo de Calidad");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_2.setBounds(170, 11, 267, 47);
		panelFia.add(label_2);
		
		JLabel label_3 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(10, 66, 288, 24);
		panelFia.add(label_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 101, 602, 13);
		panelFia.add(separator_4);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_2.setEditable(false);
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(10, 125, 288, 47);
		panelFia.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setBounds(324, 125, 288, 47);
		panelFia.add(textPane_3);
		
		JCheckBox checkBox_2 = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox_2.setBounds(20, 179, 267, 23);
		panelFia.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		checkBox_3.setBounds(20, 218, 267, 23);
		panelFia.add(checkBox_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(308, 126, 6, 146);
		panelFia.add(separator_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(361, 204, 133, 20);
		panelFia.add(comboBox_2);
		
		JButton button_2 = new JButton("Siguiente");
		button_2.setBounds(494, 293, 89, 23);
		panelFia.add(button_2);
		
		JButton button_3 = new JButton("Cancelar");
		button_3.setBounds(52, 293, 89, 23);
		panelFia.add(button_3);
		
		JPanel panelMant = new JPanel();
		panelMant.setLayout(null);
		frame.getContentPane().add(panelMant, "name_585455538015623");
		
		JLabel label_4 = new JLabel("Algoritmo de Calidad");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_4.setBounds(170, 11, 267, 47);
		panelMant.add(label_4);
		
		JLabel label_5 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(SystemColor.textHighlight);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_5.setBounds(10, 66, 288, 24);
		panelMant.add(label_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 101, 602, 13);
		panelMant.add(separator_6);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_4.setEditable(false);
		textPane_4.setBackground(SystemColor.menu);
		textPane_4.setBounds(10, 125, 288, 47);
		panelMant.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_5.setEditable(false);
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(324, 125, 288, 47);
		panelMant.add(textPane_5);
		
		JCheckBox checkBox_4 = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox_4.setBounds(20, 179, 267, 23);
		panelMant.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		checkBox_5.setBounds(20, 218, 267, 23);
		panelMant.add(checkBox_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(308, 126, 6, 146);
		panelMant.add(separator_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setMaximumRowCount(3);
		comboBox_3.setBounds(361, 204, 133, 20);
		panelMant.add(comboBox_3);
		
		JButton button_4 = new JButton("Siguiente");
		button_4.setBounds(494, 293, 89, 23);
		panelMant.add(button_4);
		
		JButton button_5 = new JButton("Cancelar");
		button_5.setBounds(52, 293, 89, 23);
		panelMant.add(button_5);
		
		JPanel panelUsa = new JPanel();
		panelUsa.setLayout(null);
		frame.getContentPane().add(panelUsa, "name_585463213137497");
		
		JLabel label_6 = new JLabel("Algoritmo de Calidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_6.setBounds(170, 11, 267, 47);
		panelUsa.add(label_6);
		
		JLabel label_7 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(SystemColor.textHighlight);
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_7.setBounds(10, 66, 288, 24);
		panelUsa.add(label_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(10, 101, 602, 13);
		panelUsa.add(separator_8);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_6.setEditable(false);
		textPane_6.setBackground(SystemColor.menu);
		textPane_6.setBounds(10, 125, 288, 47);
		panelUsa.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_7.setEditable(false);
		textPane_7.setBackground(SystemColor.menu);
		textPane_7.setBounds(324, 125, 288, 47);
		panelUsa.add(textPane_7);
		
		JCheckBox checkBox_6 = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox_6.setBounds(20, 179, 267, 23);
		panelUsa.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		checkBox_7.setBounds(20, 218, 267, 23);
		panelUsa.add(checkBox_7);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(308, 126, 6, 146);
		panelUsa.add(separator_9);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setSelectedIndex(0);
		comboBox_4.setMaximumRowCount(3);
		comboBox_4.setBounds(361, 204, 133, 20);
		panelUsa.add(comboBox_4);
		
		JButton button_6 = new JButton("Siguiente");
		button_6.setBounds(494, 293, 89, 23);
		panelUsa.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.setBounds(52, 293, 89, 23);
		panelUsa.add(button_7);
		
		JPanel panelPort = new JPanel();
		panelPort.setLayout(null);
		frame.getContentPane().add(panelPort, "name_585480031189602");
		
		JLabel label_8 = new JLabel("Algoritmo de Calidad");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_8.setBounds(170, 11, 267, 47);
		panelPort.add(label_8);
		
		JLabel label_9 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setForeground(SystemColor.textHighlight);
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_9.setBounds(10, 66, 288, 24);
		panelPort.add(label_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 101, 602, 13);
		panelPort.add(separator_10);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_8.setEditable(false);
		textPane_8.setBackground(SystemColor.menu);
		textPane_8.setBounds(10, 125, 288, 47);
		panelPort.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_9.setEditable(false);
		textPane_9.setBackground(SystemColor.menu);
		textPane_9.setBounds(324, 125, 288, 47);
		panelPort.add(textPane_9);
		
		JCheckBox checkBox_8 = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox_8.setBounds(20, 179, 267, 23);
		panelPort.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		checkBox_9.setBounds(20, 218, 267, 23);
		panelPort.add(checkBox_9);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(308, 126, 6, 146);
		panelPort.add(separator_11);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setSelectedIndex(0);
		comboBox_5.setMaximumRowCount(3);
		comboBox_5.setBounds(361, 204, 133, 20);
		panelPort.add(comboBox_5);
		
		JButton button_8 = new JButton("Siguiente");
		button_8.setBounds(494, 293, 89, 23);
		panelPort.add(button_8);
		
		JButton button_9 = new JButton("Cancelar");
		button_9.setBounds(52, 293, 89, 23);
		panelPort.add(button_9);
	}
}
