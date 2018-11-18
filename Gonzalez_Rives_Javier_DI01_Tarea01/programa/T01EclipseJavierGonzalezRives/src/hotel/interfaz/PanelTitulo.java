package hotel.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Panel pon el titulo del hotel hecho con paint comoponent
 * @author Javier Gonzalez Rives
 *
 */
public class PanelTitulo extends JPanel {
	
	/**
	 * 
	 */
	public PanelTitulo() {
		super();
		setBackground(Color.BLACK);
		repaint();
		
		
		this.setPreferredSize(new Dimension(500, 100));
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//Graphics2D g2d = (Graphics2D) g;
		
		g.setFont(new Font("Khmer OS System",Font.PLAIN,40));
		g.setColor(Color.CYAN);
		g.drawString("HOTEL Rives*******", 50, 50);
	}
	
}
