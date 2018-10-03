package PracticasPropuestas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * clase que crea una ventana con el dibujo de un movil
 * @author likendero
 *
 */
public class CuartaPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ventanuco33 ven = new ventanuco33();
		ven.setVisible(true);
	}
}
/**
 * definicion de las carecteristicas de la ventana
 * @author likendero
 *
 */
class ventanuco33 extends JFrame{
	
	public ventanuco33() {
		super("cuarta practica propueta");
		// definicion posicion t tamanno
		this.setBounds(100, 100, 400, 500);
		this.setResizable(false);
		paneloide22 pan = new paneloide22();
		this.add(pan);
	}
	
}
/**
 * panel que dibuja cosas en el panel
 * @author likendero
 *
 */
class paneloide22 extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		// defino un rectangulo que hace del exterior de un movil
		Rectangle2D rec = new Rectangle2D.Double(75,50,200,350);
		// el rectangulo interior que hace de pantalla
		Rectangle2D rec2 = new Rectangle2D.Double(100,80,150,300);
		// una linea que hace de altavoz
		Line2D line = new Line2D.Double(150,70,200,70);
		// una elipse que hace de bocadillo
		Ellipse2D elip = new Ellipse2D.Double(100,125,150,50);
		// se pinta el rectangulo
		g2d.draw(rec);
		// relleno el rectangulo
		g2d.fill(rec);
		// cambio de color
		g2d.setPaint(Color.GRAY);
		// segundo rectangulo
		g2d.draw(rec2);
		// relleno
		g2d.fill(rec2);
		// cambio de color
		g2d.setPaint(Color.WHITE);
		// dibujado de la linea
		g2d.draw(line);
		// dibujado de la elipse
		g2d.draw(elip);
		// relleno de la elipse
		g2d.fill(elip);
		// ambio de color
		// cambio de fuente
		g2d.setFont(new Font("liberation mono", Font.BOLD, 10));
		// cambio de color a uno chillon
		g2d.setPaint(Color.GREEN);
		// dibujo una cadena
		g2d.drawString("no uses el movil en clase", 105, 155);
	}
	
}




