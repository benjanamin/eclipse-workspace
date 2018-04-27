package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class PanelInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicio() {
		setLayout(null);
		
		JButton btnIngresarModoOcupado = new JButton("Modo ocupado");
		btnIngresarModoOcupado.setBounds(30, 240, 109, 23);
		add(btnIngresarModoOcupado);
		
		JLabel lblHola = new JLabel("Hola");
		lblHola.setBounds(286, 29, 46, 14);
		add(lblHola);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
		panel.setBackground(Color.GREEN);
		panel.setBounds(252, 11, 188, 278);
		add(panel);

	}
	public static void main(String[] args) {
		
	}
}
