package practicasLayout.Calculadora;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * panel que contiene todos los botones, usa GridLayout
 * que dispone los botones como en una tabla
 * @author linuxdiurno
 *
 */
public class PanelBotones extends JPanel {
	private JButton btnNumeros[],btnOperaciones[];
	/**
	 * metodo constructor del panel que contiene
	 * todos los botones
	 */
	public PanelBotones () {
		super();
		
	}
	/**
	 * metodo que incializa los componentes del panel
	 */
	private void init() {
		// definicion del array de botones
		btnNumeros = new JButton[10];
		// bucle for que instancia los botones
		for(int i = 0; i < 10; i++) {
			btnNumeros[i] = new JButton("" + i);
		}
		// definicion del array de operaciones
		btnOperaciones = new JButton[6];
		// isntanciacion de los bones 
		// el 0 es /
		btnOperaciones[0] = new JButton("/");
		// el 1 es *
		btnOperaciones[1] = new JButton("*");
		// el 2 es -
		btnOperaciones[2] = new JButton("-");
		// el 3 es . o , como quieras
		btnOperaciones[3] = new JButton(".");
		// el 4 es =
		btnOperaciones[4] = new JButton("=");
		// el 5 es +
		btnOperaciones[5] = new JButton("+");
		// cambio de layout
		GridLayout grid = new GridLayout(4, 4);
		this.setLayout(grid);
		// annadir elementos
		
		
	}
	/**
	 * metodo que realiza el proceso de annadir los elementos 
	 * al panel
	 */
	public void annadirElementos() {
		for(int i = 0; i < btnNumeros.length ; i++) {
			
			
		}
		
	}
}















