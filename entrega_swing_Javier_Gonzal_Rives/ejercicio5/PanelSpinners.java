package ejercicio5;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
/**
 * clase que contiene una serie de spinners de distinto tipo
 * 
 * @author Javier Gonzalez Rives
 *
 */
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * Clase que constr
 * @author Javier Gonzalez Rives
 *
 */
public class PanelSpinners extends JPanel
implements ChangeListener
{
	private JSpinner spDias,spProgreso,spFecha;
	private String dias[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
	private JProgressBar progreso;
	
	/**
	 * metodo constructor del panel que contiene
	 * los elementos
	 */
	public PanelSpinners()
	{
		super();
		init();
	}
	/**
	 * metodo que incicializa los elementos del panel
	 */
	private void init() 
	{
		// instanciacion de los spinners
		// spinner con cadenas con dias de la semana
		spDias = new JSpinner(new SpinnerListModel(dias));
		// spinner que tiene modelo de texto
		spFecha = new JSpinner(new SpinnerDateModel());
		// spinner de modelo numerico
		spProgreso = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		// instanciacion de la barra de progreso
		progreso = new JProgressBar();
		
		// annadir acction para el progreso
		spProgreso.addChangeListener(this);
		
		// cambio de layout
		BoxLayout ly = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(ly);
		// adds
		// el panel progreso sirve para que los componentes no ocupen todo el hueco
		add(panelRapido(spDias));
		add(panelRapido(spFecha));
		add(panelRapido(spProgreso));
		add(panelRapido(progreso));
	}
	
	/**
	 * metodo que devuelve un panel con un componente que 
	 * se le halla pasado por parametro
	 * @param com componente a annadir
	 * @return el panel con el componente
	 */
	private JPanel panelRapido(Component com) 
	{
		JPanel panel = new JPanel();
		panel.add(com);
		return panel;
	}
	@Override
	public void stateChanged(ChangeEvent e) 
	{
		Integer numero = (Integer) spProgreso.getValue();
		// paso a la barra de progreso el valor
		progreso.setValue(numero.intValue());
	}
}
