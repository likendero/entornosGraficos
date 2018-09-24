package PracticasPropuestas;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SegundaPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Ventana2 ven = new Ventana2();
		ven.setVisible(true);
	}
	
}
class Ventana2 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ventana2() {
		super("segunda practica propuesta");
		this.setBounds(200, 300, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ponerIcono();
	}
	public void ponerIcono() {
		// creacion de la herramienta
		Toolkit cajita = this.getToolkit();
		// se coge la imagen
		// imagen
		Image imagen =cajita.getImage("/home/likendero/Imágenes/Wallpapers/Alberto-Contador-Tinkoff-1.jpg");
		this.setIconImage(imagen);
		
	}
	
}
