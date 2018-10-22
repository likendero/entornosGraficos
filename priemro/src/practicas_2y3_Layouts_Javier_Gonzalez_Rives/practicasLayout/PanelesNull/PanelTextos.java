package practicasLayout.PanelesNull;
/**
 * panel que permite la introduccion de 
 * un nombre y apellidos
 * @author linuxdiurno
 *
 */

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import practicasLayout.Calculadora.PanelSuperior;

public class PanelTextos extends JPanel {
	private JTextField txtNombre, txtApellidos;
	
	/**
	 * metodo constructor del panel con textos
	 */
	public PanelTextos() {
		super();
		setBackground(Color.CYAN);
		init();
	}
	/**
	 * metodo qu einicializa y annade los elementos del panel
	 */
	private void init() {
		// cambio de layout
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(box);
		// creacion de paneles por lineas
		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new BoxLayout(panelSuperior,BoxLayout.X_AXIS));
		JPanel panelMedio = new JPanel();
		//panelMedio.setLayout(new BoxLayout(panelMedio,BoxLayout.X_AXIS));
		JPanel panelInferior = new JPanel();
		//panelInferior.setLayout(new BoxLayout(panelInferior,BoxLayout.X_AXIS));
		// cambio de colores 
		panelSuperior.setBackground(Color.CYAN);
		panelInferior.setBackground(Color.CYAN);
		panelMedio.setBackground(Color.CYAN);
		// instanciar cuadros de texto
		txtNombre = new JTextField(10);
		txtApellidos = new JTextField(8);
		// adds paneles secundarios
		// panel superior
		panelSuperior.add(new JLabel("titulo Panel1"));
		// panel medio
		panelMedio.add(new JLabel("nombre: "));
		panelMedio.add(txtNombre);
		// panel inferior
		panelInferior.add(new JLabel("apellidos: "));
		panelInferior.add(txtApellidos);
		
		// adds panel principal
		add(panelSuperior);
		add(panelMedio);
		add(panelInferior);
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public JTextField getTxtApellidos() {
		return txtApellidos;
	}
	
}
