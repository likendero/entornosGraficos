package ejercicio3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
/**
 * 
 * @author Javier Gonzalez Rives
 *
 */
public class PrincipalCombo
{
	/**
	 * metodo que crea y muestra una ventana
	 */
	public static void mostrar() 
	{
		VentanaCombo ven = new VentanaCombo();
		ven.setVisible(true);
	}
	/**
	 * metodo principal que inicia la aplicacion
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
 * 
 * @author Javier Gonzalez Rives
 *
 */
class VentanaCombo extends JFrame
implements ItemListener
{
	private JComboBox<String> cbFuentes;
	private String fuentes[] = {"selecciona una fuente","arial","times new roman","liberation serif","comic sans"};
	private JLabel lbTexto;
	/**
	 * constructor de la ventana
	 */
	public VentanaCombo()
	{
		super();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	/**
	 * metodo que inicializa los elementos de
	 * la ventana
	 */
	private void init()
	{
		// instanciacion de los paneles
		PanelCombo panelCombo = new PanelCombo(fuentes);
		PanelTexto panelTexto = new PanelTexto();
		// captura de combo y etiqueta
		cbFuentes = panelCombo.getCbFuentes();
		lbTexto = panelTexto.getLbTexto();
		// annadir acction listener
		cbFuentes.addItemListener(this);
		cbFuentes.setSelectedIndex(0);
		// add paneles
		add(panelCombo,BorderLayout.PAGE_START);
		add(panelTexto,BorderLayout.CENTER);
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// comprobacion que no sea elemento para elegir fuente
		if(cbFuentes.getSelectedIndex() != 0)
			// cambio de la fuente
			lbTexto.setFont(new Font((String)cbFuentes.getSelectedItem(),Font.PLAIN , 20));
	}
	
}
