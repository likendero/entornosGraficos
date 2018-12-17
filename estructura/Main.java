package estructura;
import javax.swing.SwingUtilities;
public class Main {
	
	/**
	 * metodo que crea la ventana y la muestra
	 */
	private static void mostrar() {
		Ventana ven = new Ventana();
		ven.setVisible(true);
	}
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> mostrar());
	}
}
