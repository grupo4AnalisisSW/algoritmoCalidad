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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fun1=calculadorDePuntajes.seguridadAcceso(chckbxNewCheckBox.isSelected(), chckbxInicioDeSesin.isSelected());
				fun2=calculadorDePuntajes.exactitudResultados(comboBox.getSelectedIndex());
				System.out.println(fun1+" "+fun2);
			}
		});
		btnNewButton.setBounds(494, 293, 89, 23);
		panelFunc.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
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
		
		JLabel lblCategoraEficiencia_1 = new JLabel("Categor\u00EDa: Eficiencia");
		lblCategoraEficiencia_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraEficiencia_1.setForeground(SystemColor.textHighlight);
		lblCategoraEficiencia_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraEficiencia_1.setBounds(10, 66, 288, 24);
		panelEfi.add(lblCategoraEficiencia_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 101, 602, 13);
		panelEfi.add(separator_2);
		
		JTextPane txtpnCalculeLaComplejidad = new JTextPane();
		txtpnCalculeLaComplejidad.setText("Calcule la complejidad computacional de cada m\u00E9todo y seleccione la que se cumpla en el peor caso.");
		txtpnCalculeLaComplejidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnCalculeLaComplejidad.setEditable(false);
		txtpnCalculeLaComplejidad.setBackground(SystemColor.menu);
		txtpnCalculeLaComplejidad.setBounds(10, 125, 288, 60);
		panelEfi.add(txtpnCalculeLaComplejidad);
		
		JTextPane txtpnPromedioDeTiempo = new JTextPane();
		txtpnPromedioDeTiempo.setText("Promedio de tiempo de espera que tiene la aplicaci\u00F3n para responder una solicitud");
		txtpnPromedioDeTiempo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnPromedioDeTiempo.setEditable(false);
		txtpnPromedioDeTiempo.setBackground(SystemColor.menu);
		txtpnPromedioDeTiempo.setBounds(324, 125, 288, 47);
		panelEfi.add(txtpnPromedioDeTiempo);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(308, 126, 6, 146);
		panelEfi.add(separator_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Menor a N^2", "N^2", "Mayor a N^2"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(10, 207, 259, 20);
		panelEfi.add(comboBox_1);
		
		JButton button = new JButton("Siguiente");
		button.setBounds(494, 293, 89, 23);
		panelEfi.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(52, 293, 89, 23);
		panelEfi.add(button_1);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(324, 207, 205, 20);
		panelEfi.add(textField);
		textField.setColumns(10);
		
		JLabel lblSegundos = new JLabel("Segundos");
		lblSegundos.setBounds(539, 211, 67, 13);
		panelEfi.add(lblSegundos);
		
		JPanel panelFia = new JPanel();
		panelFia.setLayout(null);
		frame.getContentPane().add(panelFia, "name_585451753393896");
		
		JLabel label_2 = new JLabel("Algoritmo de Calidad");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_2.setBounds(170, 11, 267, 47);
		panelFia.add(label_2);
		
		JLabel lblCategoraEficiencia = new JLabel("Categor\u00EDa: Fiabilidad");
		lblCategoraEficiencia.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraEficiencia.setForeground(SystemColor.textHighlight);
		lblCategoraEficiencia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraEficiencia.setBounds(10, 66, 288, 24);
		panelFia.add(lblCategoraEficiencia);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 101, 602, 13);
		panelFia.add(separator_4);
		
		JTextPane txtpnCuandoOcurreUn = new JTextPane();
		txtpnCuandoOcurreUn.setText("Cuando ocurre un error...");
		txtpnCuandoOcurreUn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnCuandoOcurreUn.setEditable(false);
		txtpnCuandoOcurreUn.setBackground(SystemColor.menu);
		txtpnCuandoOcurreUn.setBounds(10, 125, 288, 47);
		panelFia.add(txtpnCuandoOcurreUn);
		
		JTextPane txtpncomoFuncionaEl = new JTextPane();
		txtpncomoFuncionaEl.setText("\u00BFComo funciona el sistema frente a los errores cr\u00EDticos?");
		txtpncomoFuncionaEl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpncomoFuncionaEl.setEditable(false);
		txtpncomoFuncionaEl.setBackground(SystemColor.menu);
		txtpncomoFuncionaEl.setBounds(324, 125, 288, 47);
		panelFia.add(txtpncomoFuncionaEl);
		
		JCheckBox chckbxSeProtegen = new JCheckBox("... se protegen los datos procesados.");
		chckbxSeProtegen.setBounds(20, 179, 267, 23);
		panelFia.add(chckbxSeProtegen);
		
		JCheckBox chckbxSeGuarda = new JCheckBox("... se guarda un log con las actividades que el sistema estaba llevando a cabo.");
		chckbxSeGuarda.setVerticalAlignment(SwingConstants.TOP);
		chckbxSeGuarda.setBounds(20, 218, 278, 24);
		panelFia.add(chckbxSeGuarda);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(308, 126, 6, 146);
		panelFia.add(separator_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"El sistema no se recupera automaticamente.", "El sistema reanuda las actividades si se produce una falla cr\u00EDtica.", "El sistema reanuda sus actividades y vuelve al estado en que estaba."}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(324, 203, 288, 20);
		panelFia.add(comboBox_2);
		
		JButton button_2 = new JButton("Siguiente");
		button_2.setBounds(494, 293, 89, 23);
		panelFia.add(button_2);
		
		JButton button_3 = new JButton("Cancelar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
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
		
		JLabel lblCategoraMantenibilidad_1 = new JLabel("Categor\u00EDa: Mantenibilidad");
		lblCategoraMantenibilidad_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraMantenibilidad_1.setForeground(SystemColor.textHighlight);
		lblCategoraMantenibilidad_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraMantenibilidad_1.setBounds(10, 66, 288, 24);
		panelMant.add(lblCategoraMantenibilidad_1);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 101, 602, 13);
		panelMant.add(separator_6);
		
		JTextPane txtpnCalculeElPorcentaje = new JTextPane();
		txtpnCalculeElPorcentaje.setText("Calcule el porcentaje de l\u00EDneas de c\u00F3digo por m\u00E9todo y luego calcule el promedio");
		txtpnCalculeElPorcentaje.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnCalculeElPorcentaje.setEditable(false);
		txtpnCalculeElPorcentaje.setBackground(SystemColor.menu);
		txtpnCalculeElPorcentaje.setBounds(10, 125, 288, 47);
		panelMant.add(txtpnCalculeElPorcentaje);
		
		JTextPane txtpnCapacidadDelCdigo = new JTextPane();
		txtpnCapacidadDelCdigo.setText("Capacidad del c\u00F3digo para ser cambiado, seg\u00FAn la complejidad ciclom\u00E1tica");
		txtpnCapacidadDelCdigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnCapacidadDelCdigo.setEditable(false);
		txtpnCapacidadDelCdigo.setBackground(SystemColor.menu);
		txtpnCapacidadDelCdigo.setBounds(324, 125, 288, 47);
		panelMant.add(txtpnCapacidadDelCdigo);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(308, 126, 6, 146);
		panelMant.add(separator_7);
		
		JButton button_4 = new JButton("Siguiente");
		button_4.setBounds(494, 293, 89, 23);
		panelMant.add(button_4);
		
		JButton button_5 = new JButton("Cancelar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_5.setBounds(52, 293, 89, 23);
		panelMant.add(button_5);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(83, 204, 86, 20);
		panelMant.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_10 = new JLabel("%");
		label_10.setBounds(179, 207, 46, 14);
		panelMant.add(label_10);
		
		JLabel lblVg = new JLabel("V(G)=");
		lblVg.setBounds(354, 207, 34, 14);
		panelMant.add(lblVg);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(398, 204, 86, 20);
		panelMant.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panelUsa = new JPanel();
		panelUsa.setLayout(null);
		frame.getContentPane().add(panelUsa, "name_585463213137497");
		
		JLabel label_6 = new JLabel("Algoritmo de Calidad");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_6.setBounds(170, 11, 267, 47);
		panelUsa.add(label_6);
		
		JLabel lblCategoraUsabilidad = new JLabel("Categor\u00EDa: Usabilidad");
		lblCategoraUsabilidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraUsabilidad.setForeground(SystemColor.textHighlight);
		lblCategoraUsabilidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraUsabilidad.setBounds(10, 66, 288, 24);
		panelUsa.add(lblCategoraUsabilidad);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(10, 101, 602, 13);
		panelUsa.add(separator_8);
		
		JTextPane txtpnAsistenciaAlUsuario = new JTextPane();
		txtpnAsistenciaAlUsuario.setText("Asistencia al usuario ofrecida por el sistema");
		txtpnAsistenciaAlUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnAsistenciaAlUsuario.setEditable(false);
		txtpnAsistenciaAlUsuario.setBackground(SystemColor.menu);
		txtpnAsistenciaAlUsuario.setBounds(10, 125, 288, 47);
		panelUsa.add(txtpnAsistenciaAlUsuario);
		
		JTextPane txtpnEvaluacinDeUsuarios = new JTextPane();
		txtpnEvaluacinDeUsuarios.setText("Evaluaci\u00F3n de usuarios, sobre 5 usuarios");
		txtpnEvaluacinDeUsuarios.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnEvaluacinDeUsuarios.setEditable(false);
		txtpnEvaluacinDeUsuarios.setBackground(SystemColor.menu);
		txtpnEvaluacinDeUsuarios.setBounds(335, 104, 288, 24);
		panelUsa.add(txtpnEvaluacinDeUsuarios);
		
		JCheckBox chckbxPoseeAyudaContextual = new JCheckBox("Posee ayuda contextual.");
		chckbxPoseeAyudaContextual.setBounds(20, 179, 267, 23);
		panelUsa.add(chckbxPoseeAyudaContextual);
		
		JCheckBox chckbxManualDeUsuario = new JCheckBox("Manual de usuario incorporado al sistema como un men\u00FA dedicado.");
		chckbxManualDeUsuario.setBounds(20, 218, 267, 23);
		panelUsa.add(chckbxManualDeUsuario);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(308, 126, 6, 146);
		panelUsa.add(separator_9);
		
		JButton button_6 = new JButton("Siguiente");
		button_6.setBounds(494, 293, 89, 23);
		panelUsa.add(button_6);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_7.setBounds(52, 293, 89, 23);
		panelUsa.add(button_7);
		
		JLabel lblPersona = new JLabel("Persona 2: ");
		lblPersona.setBounds(324, 167, 55, 14);
		panelUsa.add(lblPersona);
		
		JLabel lblPersona_1 = new JLabel("Persona 3: ");
		lblPersona_1.setBounds(324, 193, 55, 14);
		panelUsa.add(lblPersona_1);
		
		JLabel lblPersona_2 = new JLabel("Persona 4: ");
		lblPersona_2.setBounds(324, 224, 55, 14);
		panelUsa.add(lblPersona_2);
		
		JLabel lblPersona_3 = new JLabel("Persona 5: ");
		lblPersona_3.setBounds(324, 252, 55, 14);
		panelUsa.add(lblPersona_3);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"El usuario requiere consultar a personal especializado para operar el producto software.", "El usuario requiere ayuda contextual y manual de uso para operar el producto software.", "El usuario opera el producto software sin asistencia."}));
		comboBox_8.setSelectedIndex(0);
		comboBox_8.setMaximumRowCount(3);
		comboBox_8.setBounds(376, 136, 236, 20);
		panelUsa.add(comboBox_8);
		
		JLabel label_9 = new JLabel("Persona 1: ");
		label_9.setBounds(324, 139, 55, 14);
		panelUsa.add(label_9);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"El usuario requiere consultar a personal especializado para operar el producto software.", "El usuario requiere ayuda contextual y manual de uso para operar el producto software.", "El usuario opera el producto software sin asistencia."}));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setMaximumRowCount(3);
		comboBox_3.setBounds(376, 164, 236, 20);
		panelUsa.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"El usuario requiere consultar a personal especializado para operar el producto software.", "El usuario requiere ayuda contextual y manual de uso para operar el producto software.", "El usuario opera el producto software sin asistencia."}));
		comboBox_4.setSelectedIndex(0);
		comboBox_4.setMaximumRowCount(3);
		comboBox_4.setBounds(376, 192, 236, 20);
		panelUsa.add(comboBox_4);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"El usuario requiere consultar a personal especializado para operar el producto software.", "El usuario requiere ayuda contextual y manual de uso para operar el producto software.", "El usuario opera el producto software sin asistencia."}));
		comboBox_6.setSelectedIndex(0);
		comboBox_6.setMaximumRowCount(3);
		comboBox_6.setBounds(376, 221, 236, 20);
		panelUsa.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"El usuario requiere consultar a personal especializado para operar el producto software.", "El usuario requiere ayuda contextual y manual de uso para operar el producto software.", "El usuario opera el producto software sin asistencia."}));
		comboBox_7.setSelectedIndex(0);
		comboBox_7.setMaximumRowCount(3);
		comboBox_7.setBounds(376, 249, 236, 20);
		panelUsa.add(comboBox_7);
		
		JPanel panelPort = new JPanel();
		panelPort.setLayout(null);
		frame.getContentPane().add(panelPort, "name_585480031189602");
		
		JLabel label_8 = new JLabel("Algoritmo de Calidad");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_8.setBounds(170, 11, 267, 47);
		panelPort.add(label_8);
		
		JLabel lblCategoraPortabilidad = new JLabel("Categor\u00EDa: Portabilidad");
		lblCategoraPortabilidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraPortabilidad.setForeground(SystemColor.textHighlight);
		lblCategoraPortabilidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraPortabilidad.setBounds(10, 66, 288, 24);
		panelPort.add(lblCategoraPortabilidad);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 101, 602, 13);
		panelPort.add(separator_10);
		
		JTextPane txtpnconCuntosSistemas = new JTextPane();
		txtpnconCuntosSistemas.setText("\u00BFCon cu\u00E1ntos sistemas operativos es compatible el software?");
		txtpnconCuntosSistemas.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnconCuntosSistemas.setEditable(false);
		txtpnconCuntosSistemas.setBackground(SystemColor.menu);
		txtpnconCuntosSistemas.setBounds(10, 125, 288, 47);
		panelPort.add(txtpnconCuntosSistemas);
		
		JTextPane txtpncuntosPasosLleva = new JTextPane();
		txtpncuntosPasosLleva.setText("\u00BFCu\u00E1ntos pasos lleva instalarlo?");
		txtpncuntosPasosLleva.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpncuntosPasosLleva.setEditable(false);
		txtpncuntosPasosLleva.setBackground(SystemColor.menu);
		txtpncuntosPasosLleva.setBounds(324, 125, 288, 47);
		panelPort.add(txtpncuntosPasosLleva);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(308, 126, 6, 146);
		panelPort.add(separator_11);
		
		JButton button_8 = new JButton("Siguiente");
		button_8.setBounds(494, 293, 89, 23);
		panelPort.add(button_8);
		
		JButton button_9 = new JButton("Cancelar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_9.setBounds(52, 293, 89, 23);
		panelPort.add(button_9);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Uno", "Dos", "Tres o mas"}));
		comboBox_9.setBounds(10, 204, 221, 20);
		panelPort.add(comboBox_9);
		
		JLabel lblSos = new JLabel("SO's");
		lblSos.setBounds(237, 207, 46, 14);
		panelPort.add(lblSos);
		
		textField_4 = new JTextField();
		textField_4.setBounds(324, 204, 86, 20);
		panelPort.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPasosDeInstalacin = new JLabel("Pasos de instalaci\u00F3n");
		lblPasosDeInstalacin.setBounds(420, 207, 163, 14);
		panelPort.add(lblPasosDeInstalacin);
		
		JPanel panelMant2 = new JPanel();
		panelMant2.setLayout(null);
		frame.getContentPane().add(panelMant2, "name_586960475183739");
		
		JLabel label_3 = new JLabel("Algoritmo de Calidad");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_3.setBounds(170, 11, 267, 47);
		panelMant2.add(label_3);
		
		JLabel lblCategoraMantenibilidad = new JLabel("Categor\u00EDa: Mantenibilidad");
		lblCategoraMantenibilidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoraMantenibilidad.setForeground(SystemColor.textHighlight);
		lblCategoraMantenibilidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCategoraMantenibilidad.setBounds(10, 66, 288, 24);
		panelMant2.add(lblCategoraMantenibilidad);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(10, 101, 602, 13);
		panelMant2.add(separator_12);
		
		JTextPane txtpnEvaleElPromedio = new JTextPane();
		txtpnEvaleElPromedio.setText("Eval\u00FAe el promedio de fallas por m\u00E9todo probado");
		txtpnEvaleElPromedio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnEvaleElPromedio.setEditable(false);
		txtpnEvaleElPromedio.setBackground(SystemColor.menu);
		txtpnEvaleElPromedio.setBounds(149, 121, 288, 47);
		panelMant2.add(txtpnEvaleElPromedio);
		
		JButton button_10 = new JButton("Siguiente");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_10.setBounds(494, 293, 89, 23);
		panelMant2.add(button_10);
		
		JButton button_11 = new JButton("Cancelar");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_11.setBounds(52, 293, 89, 23);
		panelMant2.add(button_11);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setBounds(149, 201, 86, 20);
		panelMant2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEnPromedio = new JLabel("En promedio");
		lblEnPromedio.setBounds(252, 204, 135, 14);
		panelMant2.add(lblEnPromedio);
	}
}
