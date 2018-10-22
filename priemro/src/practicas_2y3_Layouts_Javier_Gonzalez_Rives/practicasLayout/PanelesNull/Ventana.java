package practicasLayout.PanelesNull;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		super();
		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		init();
	}
	/**
	 * metodo que incializa los elementos de la ventana
	 */
	private void init() {
		PanelContenedor panelContenedor = new PanelContenedor();
		// add
		add(panelContenedor);
		
	}
}
