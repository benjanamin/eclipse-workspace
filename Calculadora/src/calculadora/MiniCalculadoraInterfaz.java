package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MiniCalculadoraInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JTextField tftotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadoraInterfaz frame = new MiniCalculadoraInterfaz();
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
	public MiniCalculadoraInterfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNumero1 = new JTextField();
		tfNumero1.setBounds(60, 56, 86, 20);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);
		
		tfNumero2 = new JTextField();
		tfNumero2.setColumns(10);
		tfNumero2.setBounds(272, 56, 86, 20);
		contentPane.add(tfNumero2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,suma;
				
					num1=Integer.parseInt(tfNumero1.getText());
					num2=Integer.parseInt(tfNumero2.getText());
					suma=num1+num2;
					tftotal.setText(Integer.toString(suma));
					
				
			}
		});
		btnSumar.setBounds(10, 129, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRestar.setBounds(109, 129, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(208, 129, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBounds(329, 129, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReiniciar.setBounds(141, 237, 89, 23);
		contentPane.add(btnReiniciar);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultado.setBounds(35, 166, 111, 44);
		contentPane.add(lblResultado);
		
		tftotal = new JTextField();
		tftotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		tftotal.setEditable(false);
		tftotal.setColumns(10);
		tftotal.setBounds(240, 162, 171, 79);
		contentPane.add(tftotal);
	}
}
