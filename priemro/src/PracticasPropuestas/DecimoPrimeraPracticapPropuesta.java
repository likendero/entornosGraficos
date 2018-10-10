package PracticasPropuestas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * @author Javier Gonzalez Rives
 *
 */
public class DecimoPrimeraPracticapPropuesta {
	public static void main(String[] args) {
		VentanaInterna ven = new VentanaInterna();
		ven.setVisible(true);
	}
}
/**
 * ventana
 * @author likendero
 *
 */
class VentanaInterna extends JFrame{
	
	public VentanaInterna() {
		super();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelInterna panel = new PanelInterna(this);
		add(panel);
	}
	
}
/**
 * panel con los botones
 * @author likendero
 *
 */
class PanelInterna extends JPanel{
	private JButton btnPrin,btnAvan;
	private JFrame ven;
	public PanelInterna(JFrame ven){
		super();
		this.ven = ven;
		init();
	}
	public void init() {
		btnPrin = new JButton("principiante");
		btnAvan = new JButton("Avanzado");
		// funcionalidad
		btnAvan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ven.setTitle("avanzado");
			}
		});
		btnPrin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ven.setTitle("principiante");
			}
		});
		// adds
		add(btnPrin);
		add(btnAvan);
	}
}
