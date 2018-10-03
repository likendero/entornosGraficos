package PracticasPropuestas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.scene.shape.Line;

/**
 * en esta practica se va a crear una panalla con la imagen de un movil
 * indicando que no se debe usar en clase
 * @author likendero
 *
 */
public class QuintaPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaMovilImagen ven = new VentanaMovilImagen();
		ven.setVisible(true);
	}
	
	
}
/**
 * metodo que crea la ventana
 * @author likendero
 *
 */
class VentanaMovilImagen extends JFrame{
	
	public VentanaMovilImagen() {
		// titulo
		super(" no usar movile ");
		// definicion de posicion y tamanno
		this.setBounds(100, 100, 700, 700);
		// caso de cierre
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//creacion del panel
		PanelMovilImagen panel = new PanelMovilImagen();
		add(panel);
	}
	
}
/**
 * creacion del panel que dibuja
 * @author likendero
 *
 */
class PanelMovilImagen extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// instanciacion de una imagen
		Image img = null;
		try {
			//  se saca la imagen leyendo de un directorio
			 img = ImageIO.read(new File(/*"/home/likendero/Imágenes/telefono.png"*/"telefono.png"));
		}catch(IOException io) {
			// mensaje de error
			JOptionPane.showMessageDialog(this, "ha sucedido un error");
		}
		// dibujado del movil
		g.drawImage(img, 160, 50, null);
		// creacion Graphics2d
		Graphics2D g2d = (Graphics2D)g;
		// creacion del circulo
		Ellipse2D elip = new Ellipse2D.Double(25,25,550,550);
		// cambiar a rojo
		g2d.setPaint(Color.RED);
		// cambiar grosor
		g2d.setStroke(new BasicStroke(20));
		// dibujado del circulo
		g2d.draw(elip);
		// dibujo de la linea
		g2d.drawLine(115, 115, 485, 485);
		
				
		
	}
}








