package Action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;





public class PrimeraPrueba {
	public static void main(String[] args) {
		ventana1 ven = new ventana1();
		ven.setVisible(true);
	}
}
/**
 * clase que crea la ventana con ciertos eventos
 * @author linuxdiurno
 *
 */
class ventana1 extends JFrame{
	
	public ventana1() {
		setTitle("ventana oyente juas juas");
		panel1 pan  = new panel1();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pan);
		
	}
	/*
	@Override
	public void windowActivated(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "jakeando tarjetas de credito","JAKIANDO",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "la ventana se ha cerrado","cerrado",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "la ventana se esta cerrando","cerrando",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "la ventana se esta desfucoseando","defocus",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("la ventana se ha abierto");
		
	}
	*/
	
}
/**
 * panel que contiene los botones con las acciones
 * @author linuxdiurno
 *
 */
class panel1 extends JPanel implements ActionListener {
	JButton botonAzul ;
	JButton botonRojo ;
	colorFondo fondo,fondo2;
	public panel1() {
		//botonAzul = new JButton("boton azul");
		//botonRojo = new JButton("boton rojo");
		fondo = new colorFondo(Color.BLUE);
		fondo2 = new colorFondo(Color.RED);
		botonAzul = new JButton(fondo);
		botonAzul.setIcon(new ImageIcon("/home/linuxdiurno/Imagenes/azul.png"));
		botonAzul.setText("azul");
		botonAzul.setSize(100, 30);
		
		botonRojo = new JButton(fondo2);
		botonRojo.setIcon(new ImageIcon("/home/linuxdiurno/Imagenes/azul.png"));
		botonRojo.setText("rojo");
		botonRojo.setSize(100, 30);
		// mensaje emerjente
		botonAzul.setToolTipText("jajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajaja\njajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajajaja");
		// accion con alt
		botonAzul.setMnemonic(KeyEvent.VK_M);
		
		InputMap map = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("cntl b");
		map.put(teclaAmarilla, "fondoAmarillo");
		ActionMap ac = getActionMap();
		//ac.put(teclaAmarilla, "fondoAmarillo");
		// annadir
		add(botonAzul);
		add(botonRojo);
		// acciones
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botonAzul ) {
			setBackground(Color.BLUE);
		}
		if(e.getSource() == botonRojo ) {
			setBackground(Color.RED);
			
		}
		
	}
	class colorFondo extends AbstractAction{
		private Color color;
		public colorFondo(Color color) {
			super();
			this.color = color;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(this.color);
			
		}
		
	}
}








