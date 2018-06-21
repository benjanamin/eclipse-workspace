package asistente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.SystemException;

import java.awt.Window.Type;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Interfaz extends JFrame {

	private JTextArea textArea;
	static ArrayList<Horario> Actividades=new ArrayList<Horario>();
	static ArrayList<Llamada> Llamadas=new ArrayList<Llamada>();
	private JPanel contentPane;
	private static boolean status=false;
	private static String Texto2="";
	private static JTable table_1;
	private JTextField tfActividad;
	private JTextField tfInicio;
	private JTextField tfFin;
	private int opcion=0;
	private static String textotwitter;
	private static String texto=" ";
	/**
	 * Launch the application.
	 * @throws TwitterException 
	 */
	public static void main(String[] args) throws TwitterException {
		Interfaz frame = new Interfaz();
		frame.setVisible(true);
		Llamadas.add(new Llamada("Pepe","+56945917556"));
		Llamadas.get(0).setHora("12:37");
		Llamadas.add(new Llamada("Jefe","+56924713579"));
		Llamadas.get(1).setHora("14:24");
		Llamadas.add(new Llamada("Mama","+56945917556"));
		Llamadas.get(2).setHora("15:50");
		int hora;
		int dia;
		int mes;
		int año;
		
		String Stringaux;
		texto="";
		int fechatotal;
		int second;
		
		while(true) {

			Calendar cal=new GregorianCalendar();
			hora=cal.get(Calendar.HOUR_OF_DAY)*100+cal.get(Calendar.MINUTE);
			dia=cal.get(Calendar.DAY_OF_MONTH);
			second=cal.get(Calendar.SECOND);
			mes=cal.get(Calendar.MONTH)+1;
			año=cal.get(Calendar.YEAR);
			if(!Actividades.isEmpty()) {
				for(int i=0;i<Actividades.size();i++) {
					//System.out.println(Actividades.get(i).FinotoInt());
					if(!Actividades.get(i).getLeido()&&Integer.parseInt(Actividades.get(i).getDia())==dia) {
						texto=texto+"\n"+Actividades.get(i).toString();
						Actividades.get(i).leido();
					}
					
					if(!Actividades.get(i).getNotificado()&&Integer.parseInt(Actividades.get(i).getYear())==año
							&&Integer.parseInt(Actividades.get(i).getDia())==dia&&
						Actividades.get(i).FinotoInt()>=hora&&Math.abs(Actividades.get(i).IniciotoInt()-hora)<=30) {
						JOptionPane.showMessageDialog(null,"Tiene: "+Actividades.get(i).getActividad()+"\n"+"Dentro de:"+Math.abs(Actividades.get(i).IniciotoInt()-hora)+" minutos");
						Actividades.get(i).Notificado();
						System.out.println("hola");
					}
					if(Actividades.get(i).FinotoInt()<hora&&Integer.parseInt(Actividades.get(i).getDia())<=dia&&
						Integer.parseInt(Actividades.get(i).getMes())<=mes&&Integer.parseInt(Actividades.get(i).getYear())<=año) {
						texto=read(Actividades.get(i).IniciotoInt(),Actividades.get(i).FinotoInt());
						for(int j=0;j<Llamadas.size();j++) {
							if(!Llamadas.get(j).getRecibida()&&Llamadas.get(j).HoratoInt()<Actividades.get(i).FinotoInt()
									&&Llamadas.get(j).HoratoInt()>Actividades.get(i).IniciotoInt()) {
								texto=texto+"\n"+ Llamadas.get(j).toString();
								
								Llamadas.get(j).setRecibida(true);
							}
						}
						Actividades.remove(i);
						
					}
					
					
				}
				
				
			}
			
			if(frame.textArea.getText()!=texto) {
				frame.textArea.setText(texto);
			}
			
			
			
		}
		

		
		
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar");
		
		btnEliminar.setBounds(395, 178, 89, 23);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(262, 11, 233, 156);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		JTable table_1 = new JTable(modelo);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Actividad", "Fecha"
			}
		));
		
		
		scrollPane.setViewportView(table_1);
		
		JLabel lblActividad = new JLabel("Actividad");
		lblActividad.setBounds(10, 30, 79, 14);
		contentPane.add(lblActividad);
		
		tfActividad = new JTextField();

		tfActividad.setToolTipText("");
		tfActividad.setBounds(99, 19, 135, 37);
		contentPane.add(tfActividad);
		tfActividad.setColumns(10);
		
		JLabel lblHorarioIniciohhmm = new JLabel("Horario Inicio");
		lblHorarioIniciohhmm.setBounds(10, 62, 89, 26);
		contentPane.add(lblHorarioIniciohhmm);
		
		tfInicio = new JTextField();
		tfInicio.setColumns(10);
		tfInicio.setBounds(99, 67, 135, 37);
		contentPane.add(tfInicio);
		
		JLabel lblHorarioFin = new JLabel("Horario Fin");
		lblHorarioFin.setBounds(10, 115, 89, 14);
		contentPane.add(lblHorarioFin);
		
		tfFin = new JTextField();
		tfFin.setColumns(10);
		tfFin.setBounds(99, 115, 135, 37);
		contentPane.add(tfFin);
		
		JLabel lblHhmm = new JLabel("(HH:MM)");
		lblHhmm.setBounds(10, 90, 79, 14);
		contentPane.add(lblHhmm);
		
		JLabel label = new JLabel("(HH:MM)");
		label.setBounds(10, 138, 79, 14);
		contentPane.add(label);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(99, 163, 135, 20);
		contentPane.add(dateChooser);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 163, 46, 14);
		contentPane.add(lblFecha);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inicio;
				String Fin;
				String Actividad;
				String Fecha;
				String Dia;
				String Mes;
				String Year;
				boolean correcto=true;
				DateFormat df=new SimpleDateFormat("dd-MM-yyy");
				//System.out.println(df.format(dateChooser.getDate()));
				Fecha=df.format(dateChooser.getDate());
				Horario aux;
				Dia=Fecha.substring(0, 2);
				Mes=Fecha.substring(3,5);
				Year=Fecha.substring(6, 10);
				Actividad=tfActividad.getText();
				Inicio=tfInicio.getText();
				Fin=tfFin.getText();
				
				if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
					JOptionPane.showMessageDialog(null,"Horario mal ingresado");
					
				}
				else  if(Inicio.charAt(2)==':'&&Inicio.length()==5&&Fin.charAt(2)==':'&&Fin.length()==5){
					aux=new Horario(Dia,Mes,Year,Inicio,Fin,Actividad);
					if(Actividades.isEmpty()) {
						Actividades.add(aux);
						//Insercion(Actividades);

					}
					else {
						for(int index=0;index<Actividades.size();index++) {
							if(Actividades.get(index).getFecha()==aux.getFecha()) {
								
							}
							if(Actividades.get(index).FechatoInt()==aux.FechatoInt()&&Actividades.get(index).IniciotoInt()<=aux.IniciotoInt()&&aux.IniciotoInt()<=Actividades.get(index).FinotoInt()) {
								correcto=false;
								JOptionPane.showMessageDialog(null,"Horario ocupado");
								break;
							}
							if(Actividades.get(index).FechatoInt()==aux.FechatoInt()&&Actividades.get(index).IniciotoInt()<=aux.FinotoInt()&&aux.FinotoInt()<=Actividades.get(index).FinotoInt()) {
								correcto=false;
								JOptionPane.showMessageDialog(null,"Horario ocupado");
								break;
							}
						}
						if(correcto) {
							Actividades.add(aux);
							
								texto="";
							
							Insercion(Actividades);
							for(int i=0;i<Actividades.size();i++) {
								Actividades.get(i).setLeido(false);
							}
							if(!Llamadas.isEmpty()) {
								for(int j=0;j<Llamadas.size();j++) {
									Llamadas.get(j).setRecibida(false);
								}
							}
							
							
							
							
						}
					}
				}
				
				table_1.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Actividad", "Fecha"
						}
					));
				
				int numCols = table_1.getModel().getColumnCount();
				for(int i=0;i<Actividades.size();i++) {
					
					Object [] fila = new Object[numCols]; 
					 fila[0] = Actividades.get(i).getActividad();
					 fila[1] = Actividades.get(i).getFecha();
					 ((DefaultTableModel) table_1.getModel()).addRow(fila);
					 
				}
				tfActividad.setText("");
				tfFin.setText("");
				tfInicio.setText("");
				
				
			}
		});
		
		JButton btnListo = new JButton("Listo");
		btnListo.setEnabled(false);
		btnListo.setBounds(145, 194, 89, 23);
		contentPane.add(btnListo);
		btnListo.setVisible(false);
		
		btnAgregar.setBounds(10, 194, 89, 23);
		contentPane.add(btnAgregar);
		//
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index;
				if(!Actividades.isEmpty()) {
					index=table_1.getSelectedRow();
					tfActividad.setText(Actividades.get(index).getActividad());
					tfFin.setText(Actividades.get(index).getHorarioFin());
					tfInicio.setText(Actividades.get(index).getHorarioInicio());
					opcion=index;
					btnListo.setVisible(true);
					btnListo.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"No ha ingresado ningun horario");
				}
				
				
				
			}
		});
		btnEditar.setBounds(273, 178, 89, 23);
		contentPane.add(btnEditar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 228, 485, 296);
		contentPane.add(scrollPane_1);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);
		
		
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Inicio;
				String Fin;
				String Actividad;
				String Fecha;
				String Dia;
				String Mes;
				String Year;
				boolean correcto=true;
				DateFormat df=new SimpleDateFormat("dd-MM-yyy");
				//System.out.println(df.format(dateChooser.getDate()));
				Fecha=df.format(dateChooser.getDate());
				Horario aux;
				Dia=Fecha.substring(0, 2);
				Mes=Fecha.substring(3,5);
				Year=Fecha.substring(6, 10);
				Actividad=tfActividad.getText();
				Inicio=tfInicio.getText();
				Fin=tfFin.getText();
				
				if(Inicio.length()!=5||Inicio.charAt(1)==':'||Integer.parseInt(Inicio.substring(0, 2))>24||Integer.parseInt(Inicio.substring(3, 5))>60||Fin.length()!=5||Fin.charAt(1)==':'||Integer.parseInt(Fin.substring(0, 2))>24||Integer.parseInt(Fin.substring(3, 5))>60||Integer.parseInt(Inicio.substring(0, 2))>Integer.parseInt(Fin.substring(0, 2))) {
					JOptionPane.showMessageDialog(null,"Horario mal ingresado");
					
				}
				else  if(Inicio.charAt(2)==':'&&Inicio.length()==5&&Fin.charAt(2)==':'&&Fin.length()==5){
					aux=new Horario(Dia,Mes,Year,Inicio,Fin,Actividad);
					if(Actividades.isEmpty()) {
						Actividades.add(aux);
						//Insercion(Actividades);

					}
					else {
						for(int index=0;index<Actividades.size();index++) {
							if(Actividades.get(index).getFecha()==aux.getFecha()) {
								
							}
							if(opcion!=index&&Actividades.get(index).FechatoInt()==aux.FechatoInt()&&Actividades.get(index).IniciotoInt()<=aux.IniciotoInt()&&aux.IniciotoInt()<=Actividades.get(index).FinotoInt()) {
								correcto=false;
								JOptionPane.showMessageDialog(null,"Horario ocupado");
								break;
							}
							if(opcion!=index&&Actividades.get(index).FechatoInt()==aux.FechatoInt()&&Actividades.get(index).IniciotoInt()<=aux.FinotoInt()&&aux.FinotoInt()<=Actividades.get(index).FinotoInt()) {
								correcto=false;
								JOptionPane.showMessageDialog(null,"Horario ocupado");
								break;
							}
						}
						if(correcto) {
							Actividades.set(opcion, aux);
							texto="";
							Insercion(Actividades);
							for(int i=0;i<Actividades.size();i++) {
								Actividades.get(i).setLeido(false);
							}
							
							if(!Llamadas.isEmpty()) {
								for(int j=0;j<Llamadas.size();j++) {
									Llamadas.get(j).setRecibida(false);
								}
							}
							tfActividad.setText("");
							tfFin.setText("");
							tfInicio.setText("");
							opcion=0;
							
						}
					}
				}
				
				table_1.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Actividad", "Fecha"
						}
					));
				
				int numCols = table_1.getModel().getColumnCount();
				for(int i=0;i<Actividades.size();i++) {
					
					Object [] fila = new Object[numCols]; 
					 fila[0] = Actividades.get(i).getActividad();
					 fila[1] = Actividades.get(i).getFecha();
					 ((DefaultTableModel) table_1.getModel()).addRow(fila);
					 
				}
				
				btnListo.setVisible(false);
				btnListo.setEnabled(false);
			}
		});

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index;
				if(!Actividades.isEmpty()) {
					index=table_1.getSelectedRow();
					Actividades.remove(index);
					texto="";
					for(int i=0;i<Actividades.size();i++) {
						Actividades.get(i).setLeido(false);
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"No ha ingresado ningun horario");
				}
				table_1.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Actividad", "Fecha"
						}
					));
				
				int numCols = table_1.getModel().getColumnCount();
				for(int i=0;i<Actividades.size();i++) {
					
					Object [] fila = new Object[numCols]; 
					 fila[0] = Actividades.get(i).getActividad();
					 fila[1] = Actividades.get(i).getFecha();
					 ((DefaultTableModel) table_1.getModel()).addRow(fila);
					 
				}
			}
			
		});
	}
	public static String read(int inicio,int fin) throws TwitterException {
		String txt="";
		int hora;
		int dia;
		int minuto;
		Calendar cal=new GregorianCalendar();
		dia=cal.get(Calendar.DAY_OF_MONTH);
		try {
			ConfigurationBuilder cf=new ConfigurationBuilder(); 
			cf.setDebugEnabled(true);
			cf.setOAuthConsumerKey("HWErwx471fKbRaijhuoMqEll7")
			.setOAuthConsumerSecret("Oc03o8QGJvhWaCiCqmpZQ2IUtF851ZeC54M4MJT58IzLATMN5u")
				.setOAuthAccessToken("93493520-C7BCoYFBb1R9JlfgWgzlMUh671togzGNw5aHhxJ4Q")
				.setOAuthAccessTokenSecret("rTkJB41N99c0WViGefiLlOVXdtZS7gWW98UHD0EMJZ4YH");
			TwitterFactory tf= new TwitterFactory(cf.build());
			twitter4j.Twitter twitter =tf.getInstance();
			List<Status> status =twitter.getHomeTimeline();
			
			for(int i=0;i<100;i++) {
				int contador=0;
				hora=Integer.parseInt(status.get(i).getCreatedAt().toString().substring(11, 13))*100+
						Integer.parseInt(status.get(i).getCreatedAt().toString().substring(11, 13));
				
				if(!Actividades.isEmpty()&&hora>=inicio&&hora<=fin) {
					if(txt.isEmpty()) {
						txt=status.get(i).getUser().getName()+": "+status.get(i).getText()+"  "+status.get(i).getCreatedAt();
					}
					else {
						txt=txt+"\n"+status.get(i).getUser().getName()+": "+status.get(i).getText()+"  "+status.get(i).getCreatedAt();
					}
					
				}
				
			}
			if(txt.isEmpty()) {
				txt="No hubo ninguna noticia importante mientras no estabas";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return txt;
	}
	
	public static void Insercion (ArrayList<Horario> vector) {
	      for (int i=1; i < vector.size(); i++) {
	        Horario aux = vector.get(i);
	         int j;
	         
	         for (j=i-1; j >=0 && vector.get(j).FechatoDouble() > aux.FechatoDouble(); j--){
	              vector.set(j+1, vector.get(j));
	          }
	         vector.set(j+1, aux);
	      }
	}
}
