package swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PruebaMenu {
	private static void mostrar() {
		VentanaMenu ven = new VentanaMenu();
		ven.setVisible(true);
	}
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
 * clase que crea una ventana para probar un menu
 */
class VentanaMenu extends JFrame{
	private JMenu menu;
	private JMenuBar barra;
	public VentanaMenu(){
		super();
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	/**
	 * metodo que incializa los elementos de la ventana
	 */
	public void init() {
		// creacion de la barra del menu
		barra = new JMenuBar();
		// creacion del elemento de menu
		menu = new JMenu("menu");
		// creacion de elementos para el menu
		JMenuItem elemento = new JMenuItem("sub elemento del menu");
		elemento.addActionListener(e->prueba());
		// annadir menu a la barra
		barra.add(menu);
		// annadir el elemento en el menu
		menu.add(elemento);
		// annadir a la parte superior de la centana
		JPanel aux = new JPanel();
		//aux.add(barra);
		setJMenuBar(barra);
		//add(aux, BorderLayout.PAGE_START);
	}
	private void prueba() {
		JOptionPane.showMessageDialog(this, "has seleccionado una opcion en el menu", "menu", JOptionPane.INFORMATION_MESSAGE);
	}
}
