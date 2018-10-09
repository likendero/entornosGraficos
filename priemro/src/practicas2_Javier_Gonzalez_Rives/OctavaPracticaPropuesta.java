package PracticasPropuestas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
/**
 * mostrar por terminal que botones se pulsan en la aplicacion
 * @author linuxdiurno
 *
 */
public class OctavaPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ventanaClicks ven = new ventanaClicks();
		ven.setVisible(true);
	}
}
class ventanaClicks extends JFrame implements MouseListener{
	/**
	 * cosntructor
	 */
	public ventanaClicks() {
		super("ventana clicks");
		setBounds(100,100,400,400);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == e.BUTTON1) {
			System.out.println("boton izquierdo");
		}
		else if(e.getButton() == e.BUTTON3) {
			System.out.println("boton derecho");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
