package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class acciones1 {
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
class ventana1 extends JFrame implements WindowListener{
	
	public ventana1() {
		setTitle("ventana oyente juas juas");
		panel1 pan  = new panel1();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pan);
		addWindowListener(this);
	}

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
	
	
}
/**
 * panel que contiene los botones con las acciones
 * @author linuxdiurno
 *
 */
class panel1 extends JPanel implements ActionListener{
	JButton botonAzul ;
	JButton botonRojo ;
	public panel1() {
		botonAzul = new JButton("boton azul");
		botonRojo = new JButton("boton rojo");
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
}
