package PracticasPropuestas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SextaBisPracticaPorpuesta {
	/**
	 * inicio
	 * @param args
	 */
	public static void main(String[] args) {
		V2 v = new V2();
		v.setVisible(true);
	}
	
}
class V2 extends JFrame{
	public V2() {
		super();
		setBounds(100, 100, 400, 400);
		P2 p = new P2();
		add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
class P2 extends JPanel{
	private JButton btnSaludo,btnDespedida;
	private JLabel lbEtiqueta;
	
	
	public P2() {
		super();
		btnSaludo = new JButton("saludo");
		btnDespedida = new JButton("despedida");
		lbEtiqueta = new JLabel();
		// annadir los botones
		add(btnSaludo);
		add(btnDespedida);
		add(lbEtiqueta);
		// acciones
		
		btnSaludo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbEtiqueta.setText("hola buenas");
				
			}
		});
		btnDespedida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbEtiqueta.setText("adios");
			}
		});
				
	}
}
