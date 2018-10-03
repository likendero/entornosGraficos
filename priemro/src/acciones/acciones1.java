package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class acciones1 {
	public static void main(String[] args) {
		ventana1 ven = new ventana1();
		ven.setVisible(true);
	}
}
class ventana1 extends JFrame{
	
	public ventana1() {
		setTitle("ventana oyente juas juas");
		panel1 pan  = new panel1();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pan);
	}
	
}
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
