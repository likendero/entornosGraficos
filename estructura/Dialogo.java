package estructura;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Dialogo extends JDialog {

	/**
	 * SERIAAAALLLL
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * constructor del dialogo
	 */
	public Dialogo(JFrame frame) {
		super(frame,"dialogo",true);
		// parametros del dialogo
		setBounds(100,100,800,600);
		setResizable(false);
		// init
	}
	/**
	 * metodo que inicializa los elementos del 
	 * dialogo
	 */
	private void init() {
		
		
	}
}
