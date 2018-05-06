package asistente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazAgregarHorario extends JFrame {
	public static ArrayList<Horario> Actividades=new ArrayList<Horario>();

	private JPanel contentPane;
	private JTextField tfActividad;
	private JTextField tfHorarioInicio;
	private JTextField tfHorarioFin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarHorario frame = new InterfazAgregarHorario();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazAgregarHorario() {
		setTitle("Agregar Horario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 2, 5, 5));
		
		JLabel lblActividad = new JLabel("Actividad");
		contentPane.add(lblActividad);
		
		tfActividad = new JTextField();
		contentPane.add(tfActividad);
		tfActividad.setColumns(10);
		
		JLabel lblHorarioInicio = new JLabel("Horario Inicio (HH:MM)");
		contentPane.add(lblHorarioInicio);
		
		tfHorarioInicio = new JTextField();
		contentPane.add(tfHorarioInicio);
		tfHorarioInicio.setColumns(10);
		
		JLabel lblHorarioFinhhmm = new JLabel("Horario Fin (HH:MM)");
		contentPane.add(lblHorarioFinhhmm);
		
		tfHorarioFin = new JTextField();
		contentPane.add(tfHorarioFin);
		tfHorarioFin.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inicio;
				String Fin;
				String Actividad;
				Horario aux;
				Actividad=tfActividad.getText();
				Inicio=tfHorarioInicio.getText();
				Fin=tfHorarioFin.getText();
				if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
					label.setText("Horario mal ingresado, ingreselo de nuevo");
					
				}
				else  if(Inicio.charAt(2)==':'&&Inicio.length()==5&&Fin.charAt(2)==':'&&Fin.length()==5){
					aux=new Horario(Inicio,Fin,Actividad);
					Actividades.add(aux);
					InterfazMenu menu= new InterfazMenu();
					menu.setVisible(true);
					dispose();
				}
				
				
			}
		});
		contentPane.add(btnAgregar);
	}
	

	
	
	

}
