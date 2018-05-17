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

public class InterfazVerHorario extends JFrame {
	private  ArrayList<Horario> Actividades=new ArrayList<Horario>();
	private JPanel contentPane;
	private JTable table;
	private String Texto="";
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
		btnVolver.setBounds(10, 227, 89, 23);
		contentPane.add(btnVolver);
		

		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(324, 227, 89, 23);
		contentPane.add(btnEditar);
		
		
		
	}
	
	public InterfazVerHorario(ArrayList<Horario> lista, String texto) {
		this.Actividades=lista;
		this.Texto=texto;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(10, 227, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(324, 227, 89, 23);
		contentPane.add(btnEditar);
		
		
		
		
		
	}
}


