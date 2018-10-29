package ejercicio3;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelCombo extends JPanel 
{
	private JComboBox<String> cbFuentes;
	/**
	 * constructor del panel que contiene el combo box
	 */
	public PanelCombo(String[] fuentes)
	{
		super();
		cbFuentes = new JComboBox<String>(fuentes);
		init();
	}
	/**
	 * metodo que inicializa los elementos del panel
	 * y los annade
	 */
	private void init()
	{
		// Cambio del layout a uno flow centrado
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);
		// annadir el combo
		add(cbFuentes);
	}
	/**
	 * metodo que devuelve el combo box
	 * @return
	 */
	public JComboBox<String> getCbFuentes()
	{
		return cbFuentes;
	}
	
}
