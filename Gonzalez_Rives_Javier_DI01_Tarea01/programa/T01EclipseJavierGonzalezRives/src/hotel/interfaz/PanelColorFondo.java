package hotel.interfaz;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.shape.Box;

/**
 * panel que con varios slider permite cambiar el color
 * del fondo de la ventana principal
 * @author Javier Gonzalez Rives
 *
 */
public class PanelColorFondo extends JPanel implements ChangeListener {
	private JSlider[] slColores;
	private Container con;
	
	/**
	 * metodo constructor
	 */
	public PanelColorFondo(Container con) {
		super();
		this.con = con;
		init();
	}
	/**
	 * metodo que iniciliaza los elementos del panel
	 */
	private void init() {
		// array de sliders
		slColores = new JSlider[3];
		// instanciacion de sliders
		for(int i = 0; i < slColores.length; i++) {
			// instanciacion 
			slColores[i] = new JSlider(0,255);
			// color inicial 
			slColores[i].setValue(0);
			// pintar rallitas
			slColores[i].setPaintTicks(true);
			slColores[i].setMajorTickSpacing(20);
			slColores[i].setMinorTickSpacing(2);
			// acciones
			slColores[i].addChangeListener(this);
		}
		// cambio del layout
		BoxLayout bl = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		this.setLayout(bl);
		
		// adds
		add(slColores[0]);
		add(slColores[1]);
		add(slColores[2]);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		con.setBackground(new Color(slColores[0].getValue(), slColores[1].getValue(), slColores[2].getValue()));
	}
}
