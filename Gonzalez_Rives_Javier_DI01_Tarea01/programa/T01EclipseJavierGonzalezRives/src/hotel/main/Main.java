package hotel.main;

import javax.swing.SwingUtilities;

import hotel.interfaz.Ventana;
import hotel.logica.ControlCentral;

public class Main {
	/**
	 * metodo que prepara la ventana para ser mostrada
	 */
	private static void mostrar() {
		Ventana ven = new Ventana();
		ven.setVisible(true);
		// acciones
		ControlCentral control = new ControlCentral(ven);
	}
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				mostrar();
				
			}
		});
	}
}
