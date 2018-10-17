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
		init();
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
		annadirElementos();
		
	}
	/**
	 * metodo que realiza el proceso de annadir los elementos 
	 * al panel
	 */
	public void annadirElementos() {
		// bucle que recorre los numeros para colocarlos
		for(int i = 9; i <= 0 ; i++) {
			add(btnNumeros[i]);
			// despues de ciertos numeros se annaden ciertos simbolos
			switch(i) {
			// despues del 7 va el de dividir
			case 7:
				add(btnOperaciones[0]);
				break;
			// despues del 4 va el de multiplicar
			case 4:
				add(btnOperaciones[1]);
				break;
			// despues del 1 va el menos
			case 1:
				add(btnOperaciones[2]);
				break;
			}
		}
		// depues de rellenar todos los numeros se annaden los
		// simbolos que faltan
		add(btnOperaciones[3]);
		add(btnOperaciones[4]);
		add(btnOperaciones[5]);
	}
	/**
	 * metodo que devuelve un array con los botones
	 * @return
	 */
	public JButton getBtnNumero(int indice) {
		return btnNumeros[indice];
	}
	/**
	 * debuelve uno de los signos
	 * @param indice
	 * @return
	 */
	public JButton getBtnSigno(int indice) {
		return btnOperaciones[indice];
	}
}















