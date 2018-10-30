package ejercicio3;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author Javier Gonzalez Rives
 * @since 29-10-2018
 *
 */
public class PanelTexto extends JPanel
{
	private JLabel lbTexto;
	/**
	 * cosntructor del panel que contiene
	 * la etiqueta de texto
	 */
	public PanelTexto()
	{
		super();
		init();
	}
	/**
	 * metodo que inicializa los elementos
	 * del panel con texto
	 */
	private void init() 
	{
		// instanciacion de la etiqueta
		lbTexto = new JLabel("en un lugar de la mancha de cuyo nombre...");
		// add al panel 
		add(lbTexto);
	}
	/**
	 * metodo que devuelve la etiqueta texto
	 * @return
	 */
	public JLabel getLbTexto()
	{
		return this.lbTexto;
	}
}
