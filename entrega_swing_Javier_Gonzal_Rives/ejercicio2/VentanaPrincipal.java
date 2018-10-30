package ejercicio2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
/**
 * clase principal que incia el programa
 * @author Javier Gonzalez Rives
 *
 */
public class VentanaPrincipal 
{
	/**
	 * metodo que crea la ventana y la vuelve
	 * visible
	 */
	public static void mostrar()
	{
		Ventana ven = new Ventana();
		ven.setVisible(true);
	}
	/**
	 * metodo principal que incia el programa
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				mostrar();
				
			}
		});
	}
}
/**
 * clase que 
 * @author Javier Gonzalez Rives
 *
 */
class Ventana extends JFrame
implements ActionListener
{
	private JRadioButton rdTamanno[] = new JRadioButton[4];
	private JLabel lbTexto;
	/**
	 * metodo constructor de la ventana
	 */
	public Ventana()
	{
		super();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	/**
	 * metodo que  incicaliza los elementos de la 
	 * ventana
	 */
	private void init() {
		// instanciacion de los paneles
		PanelEtiqueta panelEtiqueta = new PanelEtiqueta();
		PanelRadios panelRadios = new PanelRadios();
		// captura de los elementos
		for(int i = 0; i < rdTamanno.length; i++) 
		{
			// captura desde el array del panel
			rdTamanno[i] = panelRadios.getRdTamanno()[i];
		}
		
		
		// captura del cuadro de texto
		lbTexto = panelEtiqueta.getLbTexto();
		// annadir acciones radios
		for(int i = 0; i < rdTamanno.length; i++) 
		{
			// add
			rdTamanno[i].addActionListener(this);
		}
		// add paneles
		add(panelEtiqueta,BorderLayout.CENTER);
		add(panelRadios,BorderLayout.PAGE_END);
		
		// defincion rado por defecto
		rdTamanno[1].doClick();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Font fuente = new Font("arial",Font.PLAIN,24) ;
		// caso pequenno
		if(rdTamanno[0].isSelected()) 
		{
			fuente = new Font("arial",Font.PLAIN,14);
		}
		// grande
		if(rdTamanno[2].isSelected()) 
		{
			fuente = new Font("arial",Font.PLAIN,34);
		}
		// caso muy grande
		if(rdTamanno[3].isSelected()) 
		{
			fuente = new Font("arial",Font.PLAIN,44);
		}
		//  cambio de la fuente
		lbTexto.setFont(fuente);
	}
}






