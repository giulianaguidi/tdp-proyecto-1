package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField txtGuidi;
	private JTextField txtGiulianaCecilia;
	private JTextField txtGiuliguidigmailcom;
	private JTextField txtHttpsgithubcomgiulianaguidi;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 184);
		tabInformation = new JPanel();
		tabInformation.setBorder(new LineBorder(new Color(30, 144, 255)));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setBounds(10, 11, 31, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(10, 43, 59, 21);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 75, 72, 21);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(10, 103, 59, 21);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setBounds(10, 128, 78, 21);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabInformation.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(104, 13, 285, 20);
		textField.setText(studentData.getId() + "");
		tabInformation.add(textField);
		textField.setColumns(10);
		
		txtGuidi = new JTextField();
		txtGuidi.setBounds(104, 43, 285, 20);
		txtGuidi.setText(studentData.getFirstName());
		txtGuidi.setColumns(10);
		tabInformation.add(txtGuidi);
		
		txtGiulianaCecilia = new JTextField();
		txtGiulianaCecilia.setBounds(104, 74, 285, 20);
		txtGiulianaCecilia.setText(studentData.getLastName());
		txtGiulianaCecilia.setColumns(10);
		tabInformation.add(txtGiulianaCecilia);
		
		txtGiuliguidigmailcom = new JTextField();
		txtGiuliguidigmailcom.setBounds(104, 105, 285, 20);
		txtGiuliguidigmailcom.setText(studentData.getMail());
		txtGiuliguidigmailcom.setColumns(10);
		tabInformation.add(txtGiuliguidigmailcom);
		
		txtHttpsgithubcomgiulianaguidi = new JTextField();
		txtHttpsgithubcomgiulianaguidi.setBounds(104, 130, 285, 20);
		txtHttpsgithubcomgiulianaguidi.setText(studentData.getGithubURL());
		txtHttpsgithubcomgiulianaguidi.setColumns(10);
		tabInformation.add(txtHttpsgithubcomgiulianaguidi);
		contentPane.add(tabbedPane);
		
		lblNewLabel_6 = new JLabel(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lblNewLabel_6.setBounds(445, 30, 144, 151);
		contentPane.add(lblNewLabel_6);
		
	
		lblNewLabel_7 = new JLabel("Esta ventana fue generada el "+LocalDate.now() +" a las: " + LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond());
		lblNewLabel_7.setBounds(10, 186, 420, 25);
		contentPane.add(lblNewLabel_7);
		
		
	}
}
