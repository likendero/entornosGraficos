package ejercicio4;

import javax.swing.JPanel;
import javax.swing.JSlider;
/**
 * panel que contiene un slider que va de 10 a 40
 * @author Javier Gonzalez Rives
 *
 */
public class PanelSlider extends JPanel
{
	private JSlider slTamanno;
	/**
	 * constructor del panel que lleva el Slider
	 */
	public PanelSlider()
	{
		super();
		init();
	}
	/**
	 * metodo que inicializa y cambia el layout del panel
	 */
	private void init()
	{
		// instanciacion del slider
		slTamanno = new JSlider(10,45);
		// cambio de formato en el slider
		// cambio del valor por defecto
		slTamanno.setValue(20);
		// acctivacion de las arcas
		slTamanno.setPaintTicks(true);
		// espacioado a 10 entre las marcas grandes
		slTamanno.setMajorTickSpacing(10);
		// espaciado a 5 entre las pequennas
		slTamanno.setMinorTickSpacing(5);
		// etiquetas indicando el numero
		slTamanno.setPaintLabels(true);
		
		//  annadir slider
		add(slTamanno);
	}
	/**
	 * metodo que devuelve el slider del panel
	 * que controla el tamanno
	 * @return
	 */
	public JSlider getSlTamanno()
	{
		return this.slTamanno;
	}
}
