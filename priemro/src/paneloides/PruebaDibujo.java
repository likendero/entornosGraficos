package paneloides;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.javafx.geom.Line2D;

import javafx.scene.text.Font;

public class PruebaDibujo {
	public static void main(String[] args) {
		MarcoDibujo mar = new MarcoDibujo();
		mar.setVisible(true);
	}
	
	
}
class MarcoDibujo extends JFrame{
		
		public MarcoDibujo(){
			super("dibujando varios marcos");
			setBounds(100, 200, 600, 600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			paneloide panel = new paneloide();
			panel.setBackground(SystemColor.window);
			add(panel);
			
		}
		
}
class paneloide extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawRect(50, 100, 50, 50);
		g.drawLine(10, 10, 500, 500);
		// optener objeto 2d a trabes de casting
		Graphics2D g2 = (Graphics2D) g;
		
		// no podemos instanciar Rectangle2d directamente
		// por el principio de liskov lo instanciamos a trabes de una sub clase
		// double
		Rectangle2D rec = new Rectangle2D.Double(100.0,100.0,100.0,100.0);
		g2.setPaint(Color.CYAN);
		Ellipse2D elip = new Ellipse2D.Double(200,200,200,200);
		g2.draw(new java.awt.geom.Line2D.Double(50, 10, 300, 456));
		g2.draw(rec);
		g2.setPaint(Color.BLUE);
		g2.setPaint(new Color(555));
		g2.fill(rec);
		g2.draw(elip);
		
		// se va a optener el centro del circulo
		double centroX = rec.getCenterX();
		double centroY = rec.getCenterY();
		
		Font fuente = new Font("liberation mono", 33);
		g2.setFont(fuente);
		g2.drawString("hola",200,200);
	}
}
