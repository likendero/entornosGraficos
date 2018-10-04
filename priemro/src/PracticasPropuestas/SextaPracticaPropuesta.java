package PracticasPropuestas;
/*
 * licencias windows
 * JT3JH-X9N93-8Y4JR-W4XDK-G7F8D
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class SextaPracticaPropuesta {
	/**
	 * inicio
	 * @param args
	 */
	public static void main(String[] args) {
		V v = new V();
		v.setVisible(true);
	}
	
}
class V extends JFrame{
	public V() {
		super();
		setBounds(100, 100, 400, 400);
		P p = new P();
		add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
class P extends JPanel{
	private JButton btnSaludo,btnDespedida;
	
	
	public P() {
		super();
		btnSaludo = new JButton("saludo");
		btnDespedida = new JButton("despedida");
		// annadir los botones
		add(btnSaludo);
		add(btnDespedida);
		// acciones
		
		btnSaludo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hola buenas", "saludo", JOptionPane.DEFAULT_OPTION);
				
			}
		});
		btnDespedida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "adios", "despedida", JOptionPane.DEFAULT_OPTION);
				System.exit(0);
			}
		});
				
	}
}
