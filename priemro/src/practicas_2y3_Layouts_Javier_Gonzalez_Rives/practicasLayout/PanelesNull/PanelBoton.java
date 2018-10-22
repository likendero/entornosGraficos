package practicasLayout.PanelesNull;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBoton extends JPanel {
	/**
	 * metodo constructor del panel con boton
	 */
	public PanelBoton() {
		super();
		init();
	}
	/**
	 * metodo que inicia el panel
	 */
	public void init() {
		// cambio de layout
		setLayout(new BorderLayout());
		// panel contenedor
		JPanel cont = new JPanel();
		// colores
		cont.setBackground(Color.GREEN);
		setBackground(Color.GREEN);
		// annadir boton
		cont.add(new JButton("boton"));
		// add
		add(new JLabel("titulo panel2"),BorderLayout.PAGE_START);
		add(cont,BorderLayout.CENTER);
	}
}
