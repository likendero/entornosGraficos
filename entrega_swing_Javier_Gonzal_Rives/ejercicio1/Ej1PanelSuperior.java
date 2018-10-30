package ejercicio1;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ej1PanelSuperior extends JPanel {
	private JLabel lbTexto;
	/**
	 * constructor de panel superior que contiene
	 * una etiqueta
	 */
	public Ej1PanelSuperior() {
		super();
		init();
	}
	/**
	 * metodo que inicia los elementos del panel
	 */
	private void init() {
		// inicializar etiqueta
		lbTexto = new JLabel("En un lugarde la mancha de cuyo nombre...");
		// set caracterisitcas etiqueta
		lbTexto.setFont(new Font("arial", Font.PLAIN, 25));
		// Cambiar layout
		FlowLayout ly = new FlowLayout(FlowLayout.CENTER);
		// cambio del layout
		setLayout(ly);
		// add
		add(lbTexto);
		
	}
	/**
	 * metodo que devuelve la etiqueta
	 * @return
	 */
	public JLabel getLbTexto() {
		return lbTexto;
	}
	
}
