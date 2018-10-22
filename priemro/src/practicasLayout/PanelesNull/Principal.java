package practicasLayout.PanelesNull;

import javax.swing.SwingUtilities;

public class Principal {
	/**
	 * metodo que instancia lo que se va a crear
	 */
	public static void mostrar() {
		Ventana ven = new Ventana();
		ven.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				mostrar();
				
			}
		});
	}
}
