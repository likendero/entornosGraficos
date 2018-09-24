package paneloides;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class principalPaneles {
	public static void main(String[] args) {
		MarcoVentanaTexto ventanuco = new MarcoVentanaTexto();
		ventanuco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanuco.setVisible(true);
		
	}
}
/**
 * clase que crea una ventana
 * @author likendero
 *
 */
class MarcoVentanaTexto extends JFrame {
	/**
	 * constructor principal
	 */
	public MarcoVentanaTexto() {
		super("primer texto");
		setBounds(100, 200, 400, 400);
		lamina damina = new lamina();
		add(damina);
		
	}	
}

class lamina extends JPanel{
	/**
	 * constructor principal
	 */
	public lamina() {
		super();
		
		
	}
	// rescribir metodo paintcomponent
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("jajajajaj", 100, 100);
		g.drawLine(50, 100, 100, 50);
	}
	
}