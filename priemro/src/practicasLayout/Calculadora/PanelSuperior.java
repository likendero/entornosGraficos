package practicasLayout.Calculadora;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase que crea un panel que contiene un JLabel para contener
 * el numero y las operaciones
 * @author linuxdiurno
 *
 */
public class PanelSuperior extends JPanel {
	private JLabel lbNumeros;
	/**
	 * metodo constructor
	 */
	public PanelSuperior() {
		super();
		init();
	}
	/**
	 * metodo que incializa los elementos del panel
	 */
	private void init() {
		// cambio del layout
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		// instanciacion de la etiqueta
		lbNumeros = new JLabel("0");
		// cambio de la fuente del JLabel
		lbNumeros.setFont(new Font("courier 10 pitch , arial", Font.PLAIN, 12));
		// add
		add(lbNumeros,BorderLayout.PAGE_START);
	}
}










