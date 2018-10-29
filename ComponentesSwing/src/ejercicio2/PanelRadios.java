package ejercicio2;


import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;


public class PanelRadios extends JPanel 
{
	private JRadioButton rdTamanno[] = new JRadioButton[4];
	
	/**
	 * Metodo constructor de los botones
	 */
	public PanelRadios()
	{
		super();
		init();
		
	}
	/**
	 * metodo que inicializa los elementos del panel
	 */
	private void init()
	{
		// instanciacion de los botones
		rdTamanno[0] = new JRadioButton("pequenno");
		rdTamanno[1] = new JRadioButton("mediano");
		rdTamanno[2] = new JRadioButton("Grande");
		rdTamanno[3] = new JRadioButton("muy grande");
		
		// creacion de un radio group para controlar los radio buttons
		ButtonGroup botones = new ButtonGroup();
		// annadir los rdButton al button group
		for(int i = 0; i < rdTamanno.length;i++) 
		{
			botones.add(rdTamanno[i]);
		}
		//  cambiar layout del panel
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);
		// annadir los botones al layout
		for(int i = 0; i < rdTamanno.length;i++) 
		{
			add(rdTamanno[i]);
		}
	}
	/**
	 * metodo que devuelve el array con los 
	 * radio button
	 * @return
	 */
	public JRadioButton[] getRdTamanno() {
		return rdTamanno;
	}
	
}









