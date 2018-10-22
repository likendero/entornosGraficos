package practicasLayout.Calculadora;

import javax.swing.SwingUtilities;

public class Principal {
	///////////////////////////////////////////////////////////////////////////////////////////////////
	// MOSTRAR                                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	* metod que crea y muestra la ventana
	*/
	public static void mostrar() {
	Ventana ven = new Ventana();
	ven.setVisible(true);
	}
	/**
	* metodo principal
	* @param args
	*/
	public static void main(String[] args) {
		mostrar();
	}
}
