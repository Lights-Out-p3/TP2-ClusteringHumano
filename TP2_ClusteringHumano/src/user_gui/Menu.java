package user_gui;

import logic.Persona;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JList;

public class Menu extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JTextField textField;
	private ArrayList<Persona> personas;
	
	public Menu() {
		setTitle("TP2: Clustering Humano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,600,450);
		iniciar();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void iniciar() {
		panelPrincipal=new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JButton agregarPersonaButton = new JButton("Agregar persona");
		agregarPersonaButton.setBounds(32, 212, 139, 23);
		panelPrincipal.add(agregarPersonaButton);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(32, 14, 120, 14);
		panelPrincipal.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 11, 86, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Interes en Deportes");
		lblNewLabel_1.setBounds(32, 46, 127, 14);
		panelPrincipal.add(lblNewLabel_1);
		
		JComboBox comboBoxDeportes = new JComboBox();
		comboBoxDeportes.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		comboBoxDeportes.setBounds(204, 42, 44, 22);
		panelPrincipal.add(comboBoxDeportes);

		JLabel lblNewLabel_2 = new JLabel("Interes en Musica");
		lblNewLabel_2.setBounds(32, 79, 127, 14);
		panelPrincipal.add(lblNewLabel_2);
		
		JComboBox comboBoxMusica = new JComboBox();
		comboBoxMusica.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		comboBoxMusica.setBounds(204, 75, 44, 22);
		panelPrincipal.add(comboBoxMusica);

		JLabel lblNewLabel_3 = new JLabel("Interes en Farandula");
		lblNewLabel_3.setBounds(32, 112, 127, 14);
		panelPrincipal.add(lblNewLabel_3);
		
		JComboBox comboBoxFarandula = new JComboBox();
		comboBoxFarandula.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		comboBoxFarandula.setBounds(204, 108, 44, 22);
		panelPrincipal.add(comboBoxFarandula);

		JLabel lblNewLabel_4 = new JLabel("Interes en Ciencias");
		lblNewLabel_4.setBounds(32, 145, 127, 14);
		panelPrincipal.add(lblNewLabel_4);
		
		JComboBox comboBoxCiencias = new JComboBox();
		comboBoxCiencias.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		comboBoxCiencias.setBounds(204, 141, 44, 22);
		panelPrincipal.add(comboBoxCiencias);
		
		JButton calcularGruposButton = new JButton("Calcular Grupos");
		calcularGruposButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calcularGruposButton.setBounds(32, 287, 216, 74);
		panelPrincipal.add(calcularGruposButton);
		
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource()==agregarPersonaButton) {
//			
//		}
//	}
}