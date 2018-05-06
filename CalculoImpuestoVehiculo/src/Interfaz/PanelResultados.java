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
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {
	private JTextField tfTotalAPagar;

	/**
	 * Create the panel.
	 */
	public PanelResultados() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(2, 3, 5, 5));
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JButton btnLimpiar = new JButton("Limpiar");
		add(btnLimpiar);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblTotalAPagar);
		
		tfTotalAPagar = new JTextField();
		tfTotalAPagar.setEditable(false);
		add(tfTotalAPagar);
		tfTotalAPagar.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		add(btnCalcular);

	}
	
	public void refrezcarPago(double pago) {
		DecimalFormat df=(DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###.###,###");
		String strPrecio=df.format(pago);
		tfTotalAPagar.setText(strPrecio);
	}
	
	public void limpiar() {
		tfTotalAPagar.setText("");
	}

}
