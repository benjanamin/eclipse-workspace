package asistente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

public class InterfazEditarHorario extends JFrame {
	private ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private String Texto;
	private boolean status;
	private int index;
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
					InterfazEditarHorario frame = new InterfazEditarHorario();
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
	public InterfazEditarHorario() {
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
		
		JLabel lblHorarioFin = new JLabel("Horario Fin (HH:MM)");
		contentPane.add(lblHorarioFin);
		
		tfHorarioFin = new JTextField();
		contentPane.add(tfHorarioFin);
		tfHorarioFin.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane);
		
		JButton btnVolver = new JButton("Volver");
		splitPane.setLeftComponent(btnVolver);
		
		JButton btnListo = new JButton("Listo");
		splitPane.setRightComponent(btnListo);
	}
	
	
	public InterfazEditarHorario(ArrayList<Horario> lista,String texto,boolean modoEspera,int index) {
		this.status=modoEspera;
		this.Actividades=lista;
		this.Texto=texto;
		this.index=index;
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
		tfActividad.setText(Actividades.get(index).getActividad());
		tfActividad.setColumns(10);
		
		JLabel lblHorarioInicio = new JLabel("Horario Inicio (HH:MM)");
		contentPane.add(lblHorarioInicio);
		
		tfHorarioInicio = new JTextField();
		contentPane.add(tfHorarioInicio);
		tfHorarioInicio.setText(Actividades.get(index).getHorarioInicio());
		tfHorarioInicio.setColumns(10);
		
		JLabel lblHorarioFin = new JLabel("Horario Fin (HH:MM)");
		contentPane.add(lblHorarioFin);
		
		tfHorarioFin = new JTextField();
		contentPane.add(tfHorarioFin);
		tfHorarioFin.setText(Actividades.get(index).getHorarioFin());
		tfHorarioFin.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazMenu menu= new InterfazMenu(Actividades,Texto,status);
				menu.setVisible(true);
				dispose();
			}
			
		});
		splitPane.setLeftComponent(btnVolver);
		
		JButton btnListo = new JButton("Listo");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inicio;
				String Fin;
				String Actividad;
				Horario aux;
				Actividad=tfActividad.getText();
				Inicio=tfHorarioInicio.getText();
				Fin=tfHorarioFin.getText();
				if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
					JOptionPane.showMessageDialog(null,"Horario mal ingresado");
					
				}
				else  if(Inicio.charAt(2)==':'&&Inicio.length()==5&&Fin.charAt(2)==':'&&Fin.length()==5){
					aux=new Horario(Inicio,Fin,Actividad);
					Actividades.set(index, aux);
					Insercion(Actividades);
					InterfazMenu menu= new InterfazMenu(Actividades,Texto,status);
					menu.setVisible(true);
					dispose();
				}
			}
			
		});
		splitPane.setRightComponent(btnListo);
	}
	public static void Insercion (ArrayList<Horario> vector) {
	      for (int i=1; i < vector.size(); i++) {
	        Horario aux = vector.get(i);
	         int j;
	         for (j=i-1; j >=0 && vector.get(j).IniciotoInt() > aux.IniciotoInt(); j--){
	              vector.set(j+1, vector.get(j));
	          }
	         vector.set(j+1, aux);
	      }
	   }
}
