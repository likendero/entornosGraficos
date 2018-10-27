package ejercicio1;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
/**
 * clase que contiene 2 check button que al pulsarlos hace que la fuente 
 * del JLabel se ponga negrita o cursion y viceversa
 * @author likendero
 *
 */
public class PanelInferior extends JPanel {
	private JCheckBox cbNegrita,cbItalica;
	/**
	 * metodo constructor del panel inferior
	 * 
	 */
	public PanelInferior() {
		super();
		init();
	}
	/**
	 * metodo que incializa los elementos de la ventana
	 */
	private void init() {
		// creacion check boxes
		cbNegrita = new JCheckBox("negrita como el ron");
		cbItalica = new JCheckBox("italica italia pequenna");
		// creacion del layout
		FlowLayout ly = new FlowLayout(FlowLayout.CENTER);
		setLayout(ly);
		// annadir Cajitas de texto
		add(cbNegrita);
		add(cbItalica);
	}
	// GETTERS ############################################################
	public JCheckBox getCbNegrita() {
		return cbNegrita;
	}
	public JCheckBox getCbItalica() {
		return cbItalica;
	}
	
}
