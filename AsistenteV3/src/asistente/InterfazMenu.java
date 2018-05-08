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

public class InterfazMenu extends JFrame {
	private  ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private JPanel contentPane;
	private boolean status=false;
	private String Texto="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					InterfazMenu frame = new InterfazMenu();
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
	public InterfazMenu(ArrayList<Horario> lista, String texto) { //Interfaz con horario agregado
		this.Actividades=lista;
		this.Texto=texto;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnVerHorarios = new JButton("Ver Horarios");
		btnVerHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVerHorarios.setBounds(10, 24, 119, 23);
		contentPane.add(btnVerHorarios);
		
		JButton btnAgregarActividad = new JButton("Agregar Actividad");
		btnAgregarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarHorario Agregar= new InterfazAgregarHorario(Actividades,Texto);
				Agregar.setVisible(true);
				dispose();
			}
			
		});
		btnAgregarActividad.setBounds(10, 67, 119, 23);
		contentPane.add(btnAgregarActividad);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(215, 11, 209, 239);
		contentPane.add(textArea);
		textArea.setText(Texto);
		JButton btnModoEspera = new JButton("Modo espera");
		btnModoEspera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status) {
					status=false;
				}
				else {
					status=true;
					
				}

				
			}
		});
		btnModoEspera.setBounds(10, 214, 89, 23);
		contentPane.add(btnModoEspera);
	}
	
	public InterfazMenu() {// Interfaz sin ingresar horarios
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnVerHorarios = new JButton("Ver Horarios");
		btnVerHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"No ha ingresado ningun horario");
			}
		});
		btnVerHorarios.setBounds(10, 24, 119, 23);
		contentPane.add(btnVerHorarios);
		
		JButton btnAgregarActividad = new JButton("Agregar Actividad");
		btnAgregarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarHorario Agregar= new InterfazAgregarHorario(Actividades,Texto);
				Agregar.setVisible(true);
				dispose();
			}
			
		});
		btnAgregarActividad.setBounds(10, 67, 119, 23);
		contentPane.add(btnAgregarActividad);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(215, 11, 209, 239);
		contentPane.add(textArea);
		
		JButton btnModoEspera = new JButton("Modo espera");
		btnModoEspera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status) {
					status=false;
				}
				else {
					status=true;
					
				}

				
			}
		});
		btnModoEspera.setBounds(10, 214, 89, 23);
		contentPane.add(btnModoEspera);
		
	}
	
}
