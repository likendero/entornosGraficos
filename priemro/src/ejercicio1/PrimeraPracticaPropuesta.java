package ejercicio1;

import javax.swing.JFrame;

public class PrimeraPracticaPropuesta {
	
	public static void main(String[] args) {
		Ventana ventanuco = new Ventana();
	}
	
}
class Ventana extends JFrame{
	/**
	 * constructor de la clase, en este se definen todos los paramatros de la ventana
	 */
	public Ventana() {
		super("primera practica propuesta");
		// definicon de caso de cierre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// definicion de los parametros de tamnno y posicion
		this.setBounds(200, 300, 500, 300);
		// se hace visible la ventana
		this.setVisible(true);
	}
	
}
