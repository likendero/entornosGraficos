package acciones;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyAccion {
	public static void main(String[] args) {
		VentanaTeclas ven = new VentanaTeclas();
		ven.setVisible(true);
	}
}
/**
 * clase que crea una ventana
 * @author linuxdiurno
 *
 */
class VentanaTeclas extends JFrame implements KeyListener,MouseListener{
	private JLabel lbTecla;
	private JPanel panel;
	public VentanaTeclas() {
		super();
		// definicion elementos
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lbTecla = new JLabel("la tecla pulsada es: ");
		panel = new JPanel();
		panel.add(lbTecla);
		this.add(panel);
		this.addKeyListener(this);
		this.addMouseListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		lbTecla.setText("la tecla pulsada es: " + e.getKeyChar());
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		lbTecla.setText("la tecla pulsada es: ");
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		lbTecla.setText("click del raton: " + e.getX() + "x " + e.getY() + "y" );
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		panel.setBackground(Color.RED);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		panel.setBackground(Color.WHITE);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
}
