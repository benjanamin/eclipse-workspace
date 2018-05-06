package Interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class PanelDescuentos extends JPanel {
	private JCheckBox chckbxServicioPublico;
	private JCheckBox chckbxProntoPago;
	private JCheckBox chckbxTrasladoDeCuenta;

	/**
	 * Create the panel.
	 */
	public PanelDescuentos() {
		setBorder(new TitledBorder(null, "Descuentos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(2, 2, 5, 5));
		
		chckbxProntoPago = new JCheckBox("Pronto pago");
		add(chckbxProntoPago);
		
		chckbxTrasladoDeCuenta = new JCheckBox("Traslado de cuenta");
		add(chckbxTrasladoDeCuenta);
		
		chckbxServicioPublico = new JCheckBox("Servicio Publico");
		add(chckbxServicioPublico);
		
		JLabel label = new JLabel("");
		add(label);

	}

	public JCheckBox getChckbxServicioPublico() {
		return chckbxServicioPublico;
	}
	public JCheckBox getChckbxProntoPago() {
		return chckbxProntoPago;
	}
	public JCheckBox getChckbxTrasladoDeCuenta() {
		return chckbxTrasladoDeCuenta;
	}
	
	public boolean hayDescuentoProntoPago() {
		return chckbxProntoPago.isSelected();
	}
	
	public boolean hayDescuentoServicioPublico() {
		return chckbxServicioPublico.isSelected();
	}
	
	public boolean hayDescuentoTrasladoDeCuenta() {
		return chckbxTrasladoDeCuenta.isSelected();
	}
	
	public void limpiar() {
		chckbxProntoPago.setSelected(false);
		chckbxServicioPublico.setSelected(false);
		chckbxTrasladoDeCuenta.setSelected(false);
	}
}
