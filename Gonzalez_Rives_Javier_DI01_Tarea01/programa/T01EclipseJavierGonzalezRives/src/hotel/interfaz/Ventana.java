package hotel.interfaz;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.sun.glass.events.KeyEvent;


/**
 * clase que prepara una ventana con todos sus elementos,
 * esta ademas aparecera en la parte central con las dimensiones
 * a la mitad (width/2,heigh/2), en esta habra un menu para acceder
 * al resto de apartados del programa
 * @author Javier Gonzalez Rives
 *
 */
public class Ventana extends JFrame {
	private JMenuBar mbVentana;
	private JMenu meSalir,meReservas,meAcercaDe;
	private JMenuItem miAltas,miBajas,miAyuda;
	private JButton btAltas;
	private DialogAltaReservas altasDi;
	private PanelColorFondo panelColorFondo;
	
	/**
	 * metodo constructor de la venntana
	 * 
	 */
	public Ventana() {
		super("Gestión Hotel Rives");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		initToolkit();
		init();
	
		
	}
	/**
	 * metodo que incializa los elementos de la ventana
	 */
	private void init() {
		// instanciacion elementos
		// menu Bar
		mbVentana = new JMenuBar();
		// menus
		meReservas = new JMenu("reservas");
		meSalir = new JMenu("salir");
		meAcercaDe = new JMenu("acerca de");
		// elementos
		miAltas = new JMenuItem("altas");
		miBajas = new JMenuItem("bajas");
		miAyuda = new JMenuItem("ayuda");
		// boton altas
		meReservas.setMnemonic(KeyEvent.VK_R);
		// dialogo
		altasDi = new DialogAltaReservas(this);
		btAltas = new JButton("ALTAS");
		// panel con los colores
		panelColorFondo = new PanelColorFondo(this.getContentPane());
		panelColorFondo.setBorder(BorderFactory.createTitledBorder("color de fondo"));
		/// aciones 
		btAltas.addActionListener(e->altas());
		miBajas.addActionListener(e->bajas());
		miAltas.addActionListener(e->altas());
		meSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		miAyuda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "es ta es una aplicacion proyecto sobre reservas en un hotel\n hecha por Javier Gonzalez Rives", "ayuda", JOptionPane.DEFAULT_OPTION);
			}
		});
		// menu reservas
		
		// cambio de layout
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(fl);
		// composicion de menubar
		mbVentana.add(meReservas);
		mbVentana.add(meSalir);
		mbVentana.add(meAcercaDe);
		// composicion reservas
		meReservas.add(miBajas);
		meReservas.add(miAltas);
		meAcercaDe.add(miAyuda);
		// annadir elementos
		this.setJMenuBar(mbVentana);
		add(btAltas);
		add(panelColorFondo);
	}
	/**
	 * metodo en caso de pulsar boton de bajas
	 */
	private void bajas() {
		JOptionPane.showMessageDialog(null, "todavia no esta desarrollado", "bajas", JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * metodo para abrir dialogo altas
	 */
	private void altas() {
		altasDi.setVisible(true);
	}
	/**
	 * metodo que coloca la ventan en el centro de la pantalla
	 * con sus dimensiones a la mitad
	 */
	private void initToolkit() {
		// variables para almacenar el tamanno
		int width,heihg;
		Dimension dimenAux;
		// creacion de toolkit para capturar las dimensiones
		Toolkit toolkit = this.getToolkit();
		dimenAux = toolkit.getScreenSize();
		// nuevos valores
		width = (int)dimenAux.getWidth()/2;
		heihg = (int)dimenAux.getHeight()/2;

		/// definicion de la ventana
		// tamanno
		this.setSize(width,heihg);
		// posicion
		this.setLocation(width/2, heihg/2);
		// cambio del icono
		this.setIconImage(toolkit.getImage(this.getClass().getResource("/images/logoIcono.png")));
		
	}
	/**
	 * @return the mbVentana
	 */
	public JMenuBar getMbVentana() {
		return mbVentana;
	}
	/**
	 * @param mbVentana the mbVentana to set
	 */
	public void setMbVentana(JMenuBar mbVentana) {
		this.mbVentana = mbVentana;
	}
	/**
	 * @return the meSalir
	 */
	public JMenu getMeSalir() {
		return meSalir;
	}
	/**
	 * @param meSalir the meSalir to set
	 */
	public void setMeSalir(JMenu meSalir) {
		this.meSalir = meSalir;
	}
	/**
	 * @return the meReservas
	 */
	public JMenu getMeReservas() {
		return meReservas;
	}
	/**
	 * @param meReservas the meReservas to set
	 */
	public void setMeReservas(JMenu meReservas) {
		this.meReservas = meReservas;
	}
	/**
	 * @return the meAcercaDe
	 */
	public JMenu getMeAcercaDe() {
		return meAcercaDe;
	}
	/**
	 * @param meAcercaDe the meAcercaDe to set
	 */
	public void setMeAcercaDe(JMenu meAcercaDe) {
		this.meAcercaDe = meAcercaDe;
	}
	/**
	 * @return the miAltas
	 */
	public JMenuItem getMiAltas() {
		return miAltas;
	}
	/**
	 * @param miAltas the miAltas to set
	 */
	public void setMiAltas(JMenuItem miAltas) {
		this.miAltas = miAltas;
	}
	/**
	 * @return the miBajas
	 */
	public JMenuItem getMiBajas() {
		return miBajas;
	}
	/**
	 * @param miBajas the miBajas to set
	 */
	public void setMiBajas(JMenuItem miBajas) {
		this.miBajas = miBajas;
	}
	/**
	 * @return the btAltas
	 */
	public JButton getBtAltas() {
		return btAltas;
	}
	/**
	 * @param btAltas the btAltas to set
	 */
	public void setBtAltas(JButton btAltas) {
		this.btAltas = btAltas;
	}
	/**
	 * @return the altasDi
	 */
	public DialogAltaReservas getAltasDi() {
		return altasDi;
	}
	/**
	 * @param altasDi the altasDi to set
	 */
	public void setAltasDi(DialogAltaReservas altasDi) {
		this.altasDi = altasDi;
	}
	
}
