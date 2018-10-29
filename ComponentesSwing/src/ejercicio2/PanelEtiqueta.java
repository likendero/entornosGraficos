package ejercicio2;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * clase que crea un panel una etiqueta que mas 
 * tarde ira cambiando de tamanno
 * @author Javier Gonzalez Rives
 *
 */
public class PanelEtiqueta extends JPanel {
	private JLabel lbTexto;
	public PanelEtiqueta () {
		super();
		init();
	}
	/**
	 * metodo que inicaliza los elementos del panel
	 */
	private void init() {
		//instanciacion de la etiqueta
		lbTexto = new JLabel("en un lugar de la mancha cuyo nombre ...");
		// cambio de fuente
		lbTexto.setFont(new Font("arial",Font.PLAIN,14));
		// annadir el texto
		add(lbTexto);
	}
	/**
	 * metodo que devuelve la etiqueta mas tarde para poder 
	 * modificar su texto
	 * @return
	 */
	public JLabel getLbTexto() {
		return lbTexto;
	}
	
}
