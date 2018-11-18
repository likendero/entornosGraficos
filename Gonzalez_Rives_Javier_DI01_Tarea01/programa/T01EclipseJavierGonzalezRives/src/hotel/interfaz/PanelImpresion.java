package hotel.interfaz;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Panel con dos pestañas,una con los datos personales 
 * y otra con los datos de la reserva
 * @author Javier Gonzalez Rives
 *
 */
public class PanelImpresion extends JTabbedPane {
	private static final long serialVersionUID = 1L;
	private JTextArea txPersonales;
	private JTextArea txReserva;
	/**
	 * cosntructor del panel
	 */
	public PanelImpresion() {
		super();
		init();
	}
	/**
	 * metodo que inicializa los elementos del panel
	 */
	private void init () {
	// instanciacion cuadros de texto
		txPersonales = new JTextArea();
		txReserva = new JTextArea();
		// hacer no editables
		txPersonales.setEditable(false);
		txReserva.setEditable(false);
		// annadir elementos
		addTab("datos Personales",txPersonales);
		addTab("datos Reserva",txReserva);
	}
	/**
	 * @return the txPersonales
	 */
	public JTextArea getTxPersonales() {
		return txPersonales;
	}
	/**
	 * @param txPersonales the txPersonales to set
	 */
	public void setTxPersonales(JTextArea txPersonales) {
		this.txPersonales = txPersonales;
	}
	/**
	 * @return the txReserva
	 */
	public JTextArea getTxReserva() {
		return txReserva;
	}
	/**
	 * @param txReserva the txReserva to set
	 */
	public void setTxReserva(JTextArea txReserva) {
		this.txReserva = txReserva;
	}
	
	//// metodos para control
	/**
	 * metodo que sirve para reiniciar los campos del panel
	 */
	public void reinicio() {
		// se cambia el texto a cadena vacia
		this.txPersonales.setText("");
		this.txReserva.setText("");
	}
}








