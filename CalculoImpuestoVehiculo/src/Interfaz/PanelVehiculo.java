package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelVehiculo extends JPanel {
	private JTextField tfMarca;
	private JTextField tfLinea;
	private JTextField tfModelo;
	private JTextField tfValor;

	/**
	 * Create the panel.
	 */
	public PanelVehiculo() {
		setBorder(new TitledBorder(null, "Datos del vehiculo", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(5, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblNewLabel);
		
		tfMarca = new JTextField();
		add(tfMarca);
		tfMarca.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Linea");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblNewLabel_1);
		
		tfLinea = new JTextField();
		add(tfLinea);
		tfLinea.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblModelo);
		
		tfModelo = new JTextField();
		add(tfModelo);
		tfModelo.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblValor);
		
		tfValor = new JTextField();
		tfValor.setEditable(false);
		add(tfValor);
		tfValor.setColumns(10);
		
		JLabel label = new JLabel("");
		add(label);
		
		JButton btnNewButton = new JButton("Buscar");
		add(btnNewButton);

	}
	
	public String getMarca() {
		return tfMarca.getText();
	}
	
	public String getLinea() {
		return tfLinea.getText();
	}
	
	public String getModelo() {
		return tfModelo.getText();
	}
	
	public void setPrecio(double precio) {
		DecimalFormat df=(DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###.###,###");
		String strPrecio=df.format(precio);
		tfValor.setText(strPrecio);
	}
	
	public void Limpiar() {
		tfMarca.setText("");
		tfLinea.setText("");
		tfModelo.setText("");
	}
	
}
