package estructura;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * clase que implementa una ventana, para mostrar el programa
 * @author Javier Gonzalez Rives
 *
 */
public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// elementos
	private JMenuBar barraMenu;
	private JMenu mArchivo, mAcciones;
	private JMenuItem iSalir,iAlta,iBaja;
	private JButton btAlta;
	/**
	 * constructor de la ventana
	 */
	public Ventana() {
		super("titulo");
		// definicion de la ventana
		setBounds(100,100,400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// inicializacion de elementos
		init();
	}
	/**
	 * metodo que incializa los elementos
	 */
	private void init() {
		// creacion del menu
		barraMenu = new JMenuBar();
		// intanciacion de los menus
		mAcciones = new JMenu("Acciones");
		mArchivo = new JMenu("Archivo");
		// creacion de los elementos del menu
		iAlta = new JMenuItem("Alta");
		iBaja = new JMenuItem("Baja");
		iSalir = new JMenuItem("Salir");
		/// integracion del menu
		this.setJMenuBar(barraMenu);
		// annadir elementos del menu
		barraMenu.add(mAcciones);
		barraMenu.add(mArchivo);
		// annadir los items
		mArchivo.add(iSalir);
		mAcciones.add(iAlta);
		mAcciones.add(iBaja);
		/// botones
		btAlta = new JButton("Alta");
		// annadir acciones
		btAlta.addActionListener(e -> Alta());
		iBaja.addActionListener(e -> Baja());
		/// paneles contenedores
		JPanel panel = new JPanel();
		// add 
		panel.add(btAlta);
		/// annadir a la ventana
		this.add(panel,BorderLayout.CENTER);
	}
	/**
	 * metodo que realiza la accion de altas
	 */
	private void Alta() {
		// creacion del Dialogo
		Dialogo dialogo = new Dialogo(this);
		dialogo.setVisible(true);
	}
	/**
	 * metodo para la accion de bajas
	 */
	private void Baja() {
		JOptionPane.showMessageDialog(this, "esta opcion todavia no esta implementada", "SOOOOSIO", JOptionPane.INFORMATION_MESSAGE);
	}
}
