package PracticasPropuestas;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SegundaBisPractivaPropuesta {
	public static void main(String[] args) {
		VentanaCompleta vent = new VentanaCompleta();
		vent.setVisible(true);
	}
	
}
/**
 * clase que define los parametros de una ventana
 * @author likendero
 *
 */
class VentanaCompleta extends JFrame{
	/**
	 * metodo constructor por defecto
	 */
	public VentanaCompleta() {
		super("Segunda bis");
		// fin del programa en caso de cerrar la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tamanno();
	}
	/**
	 * metodo que convierte la ventana al mismo tamanno de la pantalla
	 */
	private void tamanno() {
		// creacion del de la caja de herramientas
		Toolkit cajita = this.getToolkit();
		// se saca la dimension de la pantalla
		Dimension dimensiones = cajita.getScreenSize();
		// se establece las dimensiones de la ventana
		this.setSize(dimensiones);
	}
	
}
