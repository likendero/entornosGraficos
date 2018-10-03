package PracticasPropuestas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TerceraPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ventanucoPie ven = new ventanucoPie();
		ven.setVisible(true);
	}
}
class ventanucoPie extends JFrame{
	/**
	 * constructor principal
	 */
	public ventanucoPie() {
		super("Tercera practica propuesta");
		// establezco dimensiones y posicion de la ventana
		this.setBounds(100, 100, 400, 400);
		// la hago no redimensionable
		this.setResizable(false);
		PanelPie panel = new PanelPie();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
	}
	
}
class PanelPie extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// pinto una cadena por arriba centrado
		g.drawString("cabeza", 175, 50);
		// pinto una cadena por abajo centrado
		g.drawString("pie", 175, 350);
	}
}







