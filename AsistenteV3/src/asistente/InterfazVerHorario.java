package asistente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazVerHorario extends JFrame {
	private  ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private JPanel contentPane;
	private JTable table;
	private String Texto="";
	private JTable table_1;
	private static boolean status=false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVerHorario frame = new InterfazVerHorario();
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
	public InterfazVerHorario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazMenu menu= new InterfazMenu(Actividades,Texto,status);
				menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(10, 227, 89, 23);
		contentPane.add(btnVolver);
		

		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(324, 227, 89, 23);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 24, 369, 184);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		JTable table_1 = new JTable(modelo);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Actividad", "Horario Inicio", "Horario Fin"
			}
		));
		
			
		scrollPane.setViewportView(table_1);
		
		
	}
	
	public InterfazVerHorario(ArrayList<Horario> lista, String texto,boolean modoEspera) {
		this.Actividades=lista;
		this.Texto=texto;
		this.status=modoEspera;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazMenu menu= new InterfazMenu(Actividades,Texto,status);
				menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(10, 227, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(324, 227, 89, 23);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 24, 369, 184);
		contentPane.add(scrollPane);
		DefaultTableModel modelo = new DefaultTableModel();
		JTable table_1 = new JTable(modelo);
		
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Actividad", "Horario Inicio", "Horario Fin"
			}
		));
		int numCols = table_1.getModel().getColumnCount();
		for(int i=0;i<Actividades.size();i++) {
			Object [] fila = new Object[numCols]; 
			 fila[0] = Actividades.get(i).getActividad();
			 fila[1] = Actividades.get(i).getHorarioInicio();
			 fila[2] = Actividades.get(i).getHorarioFin();
			 ((DefaultTableModel) table_1.getModel()).addRow(fila);
		}
		scrollPane.setViewportView(table_1);
		
		
		
	}
}


