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
import javax.swing.JOptionPane;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	
	//Cosas a guardar para enviar
	private int fun1;
	private int fun2;
	private int efi1;
	private int efi2;
	private int fia1;
	private int fia2;
	private int man1;
	private int man2;
	private int man3;
	private int usa1;
	private int usa2;
	private int por1;
	private int por2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		frame.getContentPane().setLayout(null);
		
		JPanel VentanaPrincipal = new JPanel();
		VentanaPrincipal.setBounds(0, 0, 631, 319);
		frame.getContentPane().add(VentanaPrincipal);
		VentanaPrincipal.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		VentanaPrincipal.add(panel_1, "name_3905731650812336");
		
		JLabel label = new JLabel("Algoritmo de Calidad");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setBounds(170, 11, 267, 47);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Categor\u00EDa: Funcionalidad");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(SystemColor.textHighlight);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(10, 66, 288, 24);
		panel_1.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 602, 13);
		panel_1.add(separator);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Seleccione cu\u00E1les de los siguientes m\u00E9todos est\u00E1n implementados en el software:");
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(10, 125, 288, 47);
		panel_1.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Indique cu\u00E1ntos registros corruptos se encontraron cada 1000 registros:");
		textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_1.setEditable(false);
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(324, 125, 288, 47);
		panel_1.add(textPane_1);
		
		JCheckBox checkBox = new JCheckBox("Encriptaci\u00F3n de datos");
		checkBox.setBounds(20, 179, 267, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Inicio de sesi\u00F3n de usuarios");
		checkBox_1.setBounds(20, 218, 267, 23);
		panel_1.add(checkBox_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(308, 126, 6, 146);
		panel_1.add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cero", "Uno", "Mas de uno"}));
		comboBox.setSelectedIndex(0);
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(361, 204, 133, 20);
		panel_1.add(comboBox);
		
		JButton button = new JButton("Siguiente");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fun1=calculadorDePuntajes.seguridadAcceso(checkBox.isSelected(), checkBox_1.isSelected());
				fun2=calculadorDePuntajes.exactitudResultados(comboBox.getSelectedIndex());
				System.out.println(fun1+" "+fun2);
				CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
				cl.next(VentanaPrincipal);
			}
		});
		button.setBounds(494, 293, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setBounds(52, 293, 89, 23);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		VentanaPrincipal.add(panel_2, "name_3905731663411324");
		
		JLabel label_2 = new JLabel("Algoritmo de Calidad");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_2.setBounds(170, 11, 267, 47);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Categor\u00EDa: Eficiencia");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(10, 66, 288, 24);
		panel_2.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 101, 602, 13);
		panel_2.add(separator_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Calcule la complejidad computacional de cada m\u00E9todo y seleccione la que se cumpla en el peor caso.");
		textPane_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_2.setEditable(false);
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(10, 125, 288, 60);
		panel_2.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Promedio de tiempo de espera que tiene la aplicaci\u00F3n para responder una solicitud");
		textPane_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setBounds(324, 125, 288, 47);
		panel_2.add(textPane_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(308, 126, 6, 146);
		panel_2.add(separator_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mayor a N^2", "N^2", "Menor a N^2"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(10, 207, 259, 20);
		panel_2.add(comboBox_1);
		
		JButton button_2 = new JButton("Siguiente");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					efi1=calculadorDePuntajes.utilizacionRecursos(comboBox_1.getSelectedIndex());
					efi2=calculadorDePuntajes.comportamientoEnElTiempo(Integer.parseInt(textField.getText()));
					System.out.println(efi1+" "+efi2);
					CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
					cl.next(VentanaPrincipal);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo números en el campo de segundos", "InfoBox: " + "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_2.setBounds(494, 293, 89, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Cancelar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.setBounds(52, 293, 89, 23);
		panel_2.add(button_3);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		textField.setBounds(324, 207, 205, 20);
		panel_2.add(textField);
		
		JLabel label_4 = new JLabel("Segundos");
		label_4.setBounds(539, 211, 67, 13);
		panel_2.add(label_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		VentanaPrincipal.add(panel_3, "name_3905731675205301");
		
		JLabel label_5 = new JLabel("Algoritmo de Calidad");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_5.setBounds(170, 11, 267, 47);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("Categor\u00EDa: Fiabilidad");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(SystemColor.textHighlight);
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_6.setBounds(10, 66, 288, 24);
		panel_3.add(label_6);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 101, 602, 13);
		panel_3.add(separator_4);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Cuando ocurre un error...");
		textPane_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_4.setEditable(false);
		textPane_4.setBackground(SystemColor.menu);
		textPane_4.setBounds(10, 125, 288, 47);
		panel_3.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("\u00BFComo funciona el sistema frente a los errores cr\u00EDticos?");
		textPane_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_5.setEditable(false);
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(324, 125, 288, 47);
		panel_3.add(textPane_5);
		
		JCheckBox chckbxSeProtegen = new JCheckBox("   ... se protegen los datos procesados.");
		chckbxSeProtegen.setBounds(20, 179, 267, 23);
		panel_3.add(chckbxSeProtegen);
		
		JCheckBox chckbxSeGuarda = new JCheckBox("... se guarda un log con las actividades que el sistema estaba llevando a cabo.");
		chckbxSeGuarda.setVerticalAlignment(SwingConstants.TOP);
		chckbxSeGuarda.setBounds(20, 218, 22, 24);
		panel_3.add(chckbxSeGuarda);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(308, 126, 6, 146);
		panel_3.add(separator_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"No se recupera automaticamente", "Reanuda las actividades si se produce una falla cr\u00EDtica.", "Reanuda sus actividades y vuelve al estado en que estaba."}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(324, 203, 288, 24);
		panel_3.add(comboBox_2);
		
		JButton button_4 = new JButton("Siguiente");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
				cl.next(VentanaPrincipal);}
		});
		button_4.setBounds(494, 293, 89, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Cancelar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_5.setBounds(52, 293, 89, 23);
		panel_3.add(button_5);
		
		JTextPane txtpnSeGuarda = new JTextPane();
		txtpnSeGuarda.setText("... se guarda un log con las actividades que el sistema estaba llevando a cabo.");
		txtpnSeGuarda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnSeGuarda.setEditable(false);
		txtpnSeGuarda.setBackground(SystemColor.menu);
		txtpnSeGuarda.setBounds(48, 218, 250, 47);
		panel_3.add(txtpnSeGuarda);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		VentanaPrincipal.add(panel_4, "name_3905731685858074");
		
		JLabel label_7 = new JLabel("Algoritmo de Calidad");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_7.setBounds(170, 11, 267, 47);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("Categor\u00EDa: Mantenibilidad");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setForeground(SystemColor.textHighlight);
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_8.setBounds(10, 66, 288, 24);
		panel_4.add(label_8);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 101, 602, 13);
		panel_4.add(separator_6);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Calcule el porcentaje de l\u00EDneas de c\u00F3digo por m\u00E9todo y luego calcule el promedio");
		textPane_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_6.setEditable(false);
		textPane_6.setBackground(SystemColor.menu);
		textPane_6.setBounds(10, 125, 288, 47);
		panel_4.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Capacidad del c\u00F3digo para ser cambiado, seg\u00FAn la complejidad ciclom\u00E1tica");
		textPane_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_7.setEditable(false);
		textPane_7.setBackground(SystemColor.menu);
		textPane_7.setBounds(324, 125, 288, 47);
		panel_4.add(textPane_7);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(308, 126, 6, 146);
		panel_4.add(separator_7);
		
		JButton button_6 = new JButton("Siguiente");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
				cl.next(VentanaPrincipal);}
		});
		button_6.setBounds(494, 293, 89, 23);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_7.setBounds(52, 293, 89, 23);
		panel_4.add(button_7);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(83, 204, 86, 20);
		panel_4.add(textField_1);
		
		JLabel label_9 = new JLabel("%");
		label_9.setBounds(179, 207, 46, 14);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("V(G)=");
		label_10.setBounds(354, 207, 34, 14);
		panel_4.add(label_10);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(398, 204, 86, 20);
		panel_4.add(textField_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		VentanaPrincipal.add(panel_4_1, "name_3905731740249265");
		
		JLabel label_22 = new JLabel("Algoritmo de Calidad");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_22.setBounds(170, 11, 267, 47);
		panel_4_1.add(label_22);
		
		JLabel label_23 = new JLabel("Categor\u00EDa: Mantenibilidad");
		label_23.setHorizontalAlignment(SwingConstants.LEFT);
		label_23.setForeground(SystemColor.textHighlight);
		label_23.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_23.setBounds(10, 66, 288, 24);
		panel_4_1.add(label_23);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(10, 101, 602, 13);
		panel_4_1.add(separator_12);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("Eval\u00FAe el promedio de fallas por m\u00E9todo probado");
		textPane_12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_12.setEditable(false);
		textPane_12.setBackground(SystemColor.menu);
		textPane_12.setBounds(149, 121, 288, 47);
		panel_4_1.add(textPane_12);
		
		JButton button_12 = new JButton("Siguiente");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
				cl.next(VentanaPrincipal);}
		});
		button_12.setBounds(494, 293, 89, 23);
		panel_4_1.add(button_12);
		
		JButton button_13 = new JButton("Cancelar");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_13.setBounds(52, 293, 89, 23);
		panel_4_1.add(button_13);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setColumns(10);
		textField_4.setBounds(149, 201, 86, 20);
		panel_4_1.add(textField_4);
		
		JLabel label_24 = new JLabel("En promedio");
		label_24.setBounds(252, 204, 135, 14);
		panel_4_1.add(label_24);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		VentanaPrincipal.add(panel_5, "name_3905731696093949");
		
		JLabel label_11 = new JLabel("Algoritmo de Calidad");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_11.setBounds(170, 11, 267, 47);
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("Categor\u00EDa: Usabilidad");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setForeground(SystemColor.textHighlight);
		label_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_12.setBounds(10, 66, 288, 24);
		panel_5.add(label_12);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(10, 101, 602, 13);
		panel_5.add(separator_8);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("Asistencia al usuario ofrecida por el sistema");
		textPane_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_8.setEditable(false);
		textPane_8.setBackground(SystemColor.menu);
		textPane_8.setBounds(10, 125, 288, 47);
		panel_5.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("Evaluaci\u00F3n de usuarios, sobre 5 usuarios");
		textPane_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_9.setEditable(false);
		textPane_9.setBackground(SystemColor.menu);
		textPane_9.setBounds(335, 104, 288, 24);
		panel_5.add(textPane_9);
		
		JCheckBox checkBox_4 = new JCheckBox("Posee ayuda contextual.");
		checkBox_4.setBounds(20, 179, 267, 23);
		panel_5.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Manual de usuario incorporado al sistema como un men\u00FA dedicado.");
		checkBox_5.setBounds(20, 218, 267, 23);
		panel_5.add(checkBox_5);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(308, 126, 6, 146);
		panel_5.add(separator_9);
		
		JButton button_8 = new JButton("Siguiente");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (VentanaPrincipal.getLayout());
				cl.next(VentanaPrincipal);}
		});
		button_8.setBounds(494, 293, 89, 23);
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("Cancelar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_9.setBounds(52, 293, 89, 23);
		panel_5.add(button_9);
		
		JLabel label_13 = new JLabel("Persona 2: ");
		label_13.setBounds(324, 167, 55, 14);
		panel_5.add(label_13);
		
		JLabel label_14 = new JLabel("Persona 3: ");
		label_14.setBounds(324, 193, 55, 14);
		panel_5.add(label_14);
		
		JLabel label_15 = new JLabel("Persona 4: ");
		label_15.setBounds(324, 224, 55, 14);
		panel_5.add(label_15);
		
		JLabel label_16 = new JLabel("Persona 5: ");
		label_16.setBounds(324, 252, 55, 14);
		panel_5.add(label_16);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setMaximumRowCount(3);
		comboBox_3.setBounds(376, 136, 236, 20);
		panel_5.add(comboBox_3);
		
		JLabel label_17 = new JLabel("Persona 1: ");
		label_17.setBounds(324, 139, 55, 14);
		panel_5.add(label_17);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_4.setSelectedIndex(0);
		comboBox_4.setMaximumRowCount(3);
		comboBox_4.setBounds(376, 164, 236, 20);
		panel_5.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_5.setSelectedIndex(0);
		comboBox_5.setMaximumRowCount(3);
		comboBox_5.setBounds(376, 192, 236, 20);
		panel_5.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_6.setSelectedIndex(0);
		comboBox_6.setMaximumRowCount(3);
		comboBox_6.setBounds(376, 221, 236, 20);
		panel_5.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_7.setSelectedIndex(0);
		comboBox_7.setMaximumRowCount(3);
		comboBox_7.setBounds(376, 249, 236, 20);
		panel_5.add(comboBox_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		VentanaPrincipal.add(panel_6, "name_3905731724007166");
		
		JLabel label_18 = new JLabel("Algoritmo de Calidad");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_18.setBounds(170, 11, 267, 47);
		panel_6.add(label_18);
		
		JLabel label_19 = new JLabel("Categor\u00EDa: Portabilidad");
		label_19.setHorizontalAlignment(SwingConstants.LEFT);
		label_19.setForeground(SystemColor.textHighlight);
		label_19.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_19.setBounds(10, 66, 288, 24);
		panel_6.add(label_19);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 101, 602, 13);
		panel_6.add(separator_10);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("\u00BFCon cu\u00E1ntos sistemas operativos es compatible el software?");
		textPane_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_10.setEditable(false);
		textPane_10.setBackground(SystemColor.menu);
		textPane_10.setBounds(10, 125, 288, 47);
		panel_6.add(textPane_10);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("\u00BFCu\u00E1ntos pasos lleva instalarlo?");
		textPane_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_11.setEditable(false);
		textPane_11.setBackground(SystemColor.menu);
		textPane_11.setBounds(324, 125, 288, 47);
		panel_6.add(textPane_11);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(308, 126, 6, 146);
		panel_6.add(separator_11);
		
		JButton button_10 = new JButton("Siguiente");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBounds(494, 293, 89, 23);
		panel_6.add(button_10);
		
		JButton button_11 = new JButton("Cancelar");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_11.setBounds(52, 293, 89, 23);
		panel_6.add(button_11);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"lala"}));
		comboBox_8.setBounds(10, 204, 221, 20);
		panel_6.add(comboBox_8);
		
		JLabel label_20 = new JLabel("SO's");
		label_20.setBounds(237, 207, 46, 14);
		panel_6.add(label_20);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(324, 204, 86, 20);
		panel_6.add(textField_3);
		
		JLabel label_21 = new JLabel("Pasos de instalaci\u00F3n");
		label_21.setBounds(420, 207, 163, 14);
		panel_6.add(label_21);
	}
}
