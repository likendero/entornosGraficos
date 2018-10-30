package ejercicio5;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PrincipalSpinners
{
	private static void mostrar()
	{
		VentanaSpinners ven = new VentanaSpinners();
		ven.setVisible(true);
	}
	/**
	 * metodo principal que inicia el programa
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				mostrar();
				
			}
		});
	}
}
/**
 * clase que genera la ventana donde ver los 
 * paneles
 * @author Javier Gonzalez Rives
 *
 */
class VentanaSpinners extends JFrame
{
	/**
	 * constructor de la ventana
	 */
	public VentanaSpinners ()
	{
		super();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	/**
	 * metodo que inicializa los elementos de la ventanan
	 * panel con los spinners
	 */
	private void init() 
	{
		// instanciar panel
		PanelSpinners panelSpinner = new PanelSpinners();
		// add panel
		add(panelSpinner);
	}
}
