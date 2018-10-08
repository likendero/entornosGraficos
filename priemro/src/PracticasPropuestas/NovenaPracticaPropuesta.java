package PracticasPropuestas;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
/**
 * mostrar por terminal que botones se pulsan en la aplicacion
 * @author linuxdiurno
 *
 */
public class NovenaPracticaPropuesta {
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ventanaArastrar ven = new ventanaArastrar();
		ven.setVisible(true);
	}
}
class ventanaArastrar extends JFrame implements MouseListener{
	/**
	 * cosntructor
	 */
	public ventanaArastrar() {
		super("ventana clicks");
		setBounds(100,100,400,400);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("deslizar");
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("arrastrar");
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
