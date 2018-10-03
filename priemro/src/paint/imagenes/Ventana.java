package paint.imagenes;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private Panel panel;
	
	public Ventana() {
		super("ventana imagen");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		inicio();
	}
	/**
	 * metodo que inicializa los componentes
	 */
	public void inicio() {
		panel = new Panel();
		add(panel,BorderLayout.CENTER);
	}
}
