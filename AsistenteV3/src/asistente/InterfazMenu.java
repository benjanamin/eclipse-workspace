package asistente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class InterfazMenu extends JFrame {
	private static  ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private JPanel contentPane;
	private static boolean status=false;
	private static String Texto="";
	private static boolean prendido=false;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		InterfazMenu frame = new InterfazMenu(Actividades,Texto,status);
		frame.setVisible(true);
		while(true) {
			
			addTexto("Llamada x");
			frame.addTexto("Noticia x");
			
			if(frame.status) {
			System.out.println("hola");	
			
			}
			
			
		
		}
		
		
	}

	/**
	 * Create the frame.
	 */

	
	public InterfazMenu() {// Interfaz sin ingresar horarios
		
		setTitle("Asistente\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(219, 11, 205, 239);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		JButton btnVerHorarios = new JButton("Ver Horarios");
		btnVerHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Actividades.isEmpty()) {
					JOptionPane.showMessageDialog(null,"No ha ingresado ningun horario");
					
				}
				else {
					InterfazVerHorario VerHorario= new InterfazVerHorario(Actividades,Texto,status);
					VerHorario.setVisible(true);
					dispose();
				}
				
			}
		});
		btnVerHorarios.setBounds(10, 24, 119, 23);
		contentPane.add(btnVerHorarios);
		
		JButton btnAgregarActividad = new JButton("Agregar Actividad");
		btnAgregarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarHorario Agregar= new InterfazAgregarHorario(Actividades,Texto,status);
				Agregar.setVisible(true);
				dispose();
			}
			
		});
		btnAgregarActividad.setBounds(10, 67, 119, 23);
		contentPane.add(btnAgregarActividad);
		JButton btnModoEspera = new JButton("Modo espera");
		btnModoEspera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status) {
					status=false;
					setTitle("Asistente: Modo Espera Activado\r\n");
					textArea.setText("");
				}
				else {
					status=true;
					textArea.setText(Texto);
					setTitle("Asistente");
				}

				
			}
		});
		btnModoEspera.setBounds(10, 214, 146, 23);
		contentPane.add(btnModoEspera);
		
		
		
	}
	
	
	public InterfazMenu(ArrayList<Horario> lista, String texto,boolean modoEspera) { //Interfaz con horario agregado
		setTitle("Asistente\r\n");
		this.Actividades=lista;
		this.Texto=texto;
		this.status=modoEspera;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(219, 11, 205, 239);
		contentPane.add(scrollPane);
		
		
		
		JButton btnVerHorarios = new JButton("Ver Horarios");
		btnVerHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Actividades.isEmpty()) {
					JOptionPane.showMessageDialog(null,"No ha ingresado ningun horario");
					
				}
				else {
					InterfazVerHorario VerHorario= new InterfazVerHorario(Actividades,Texto,status);
					VerHorario.setVisible(true);
					dispose();
				}
				
			}
		});
		btnVerHorarios.setBounds(10, 24, 119, 23);
		contentPane.add(btnVerHorarios);
		
		JButton btnAgregarActividad = new JButton("Agregar Actividad");
		btnAgregarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarHorario Agregar= new InterfazAgregarHorario(Actividades,Texto,status);
				Agregar.setVisible(true);
				dispose();
			}
			
		});
		btnAgregarActividad.setBounds(10, 67, 119, 23);
		contentPane.add(btnAgregarActividad);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setText(Texto);
		textArea.setEditable(false);
		JButton btnModoEspera = new JButton("Modo espera");
		btnModoEspera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status) {
					status=false;
					setTitle("Asistente: Modo Espera Activado\r\n");
					textArea.setText("");
				}
				else {
					status=true;
					textArea.setText(Texto);
					setTitle("Asistente\r\n");
				}

				
			}
		});
		btnModoEspera.setBounds(10, 214, 89, 23);
		contentPane.add(btnModoEspera);
	}
	
	
	public static void addTexto(String s) {
		Texto=Texto+"\n"+s;
	}
	public void printhora() {
		System.out.println("hola");
	}

}
