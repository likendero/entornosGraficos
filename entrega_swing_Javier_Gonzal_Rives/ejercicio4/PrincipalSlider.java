package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class PrincipalSlider 
{
	public static void mostrar() 
	{
		VentanaSlider ven = new VentanaSlider();
		ven.setVisible(true);
	}
	/**
	 * incio del programa
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
 * clase que construye la ventana y le da funcionalidad
 * @author Javier Gonzalez Rives
 *
 */
class VentanaSlider extends JFrame
implements ChangeListener
{
	private JLabel lbTexto;
	private JSlider slTamanno;
	
	/**
	 * constructor de la ventana
	 */
	public VentanaSlider()
	{
		super();
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		init();
	}
	private void init()
	{
		// instanciacion de los paneles
		PanelSlider panelSlider = new PanelSlider();
		PanelTexto panelTexto = new PanelTexto();
		// captura del texto y el slider
		slTamanno = panelSlider.getSlTamanno();
		lbTexto = panelTexto.getLbTexto();
		// definicion inicial del tamanno del texto
		actualizarTamanno();
		// annadir listener
		slTamanno.addChangeListener(this);
		
		// add paneles
		add(panelSlider,BorderLayout.PAGE_START);
		add(panelTexto,BorderLayout.CENTER);
	}
	
	/**
	 * metdo que actualiza el tamanno de la fuente
	 * esto lo hace segun el tamanno actual del slider
	 */
	private void actualizarTamanno() {
		// cambio del tamanno segun el slider
		lbTexto.setFont(new Font("arial", Font.PLAIN, slTamanno.getValue()));
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// actualizacion del tamanno de la fuente
		actualizarTamanno();
	}
}
