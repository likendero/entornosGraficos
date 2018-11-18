package hotel.interfaz;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * Clase que sirve para realizar una alta en las reservas
 * esta clase incorpora una serie de paneles que permiten dar 
 * de alta una reserva, los paneles tendran cada uno un color de 
 * fondo
 * @author Javier Gonzalez Rives
 *
 */
public class DialogAltaReservas extends JDialog {
	private PanelTitulo panelTitulo;
	private PanelPersonal panelPersonal;
	private PanelReserva panelReserva;
	private PanelImpresion panelImpresion;
//	private PanelImagenHotel panelImagenHotel;
	private JPanel panelCompuest;
	private JButton btImprimir,btSalir,btAceptar;
	/**
	 * constructor del menu con las altas
	 */
	public DialogAltaReservas(JFrame frame) {
		super(frame,true);
		this.setTitle("altas reservas");
		
		init();
		initToolKit();
		
	}
	/**
	 * metodo que incicializa los componentes
	 */
	public void init() {
		// init panel titulo
		panelTitulo = new PanelTitulo();
		// panel Personal 
		panelPersonal = new PanelPersonal();
		// panel reserva 
		panelReserva = new PanelReserva();
		// panel impresion
		panelImpresion = new PanelImpresion();
		// panel Imagen
//		panelImagenHotel = new PanelImagenHotel();
		// botones
		btAceptar = new JButton("aceptar");
		btImprimir = new JButton("imprimir");
		btSalir = new JButton("salir");
		// panel compuesto
		composicionCompuesto();
		// panel contenedor
		JPanel panelInferior = new JPanel();
		JPanel panelSuperior = new JPanel();
		JPanel panelPie = new JPanel();
		// annadir a subpaneles
		panelInferior.add(panelCompuest);
//		panelInferior.add(panelImagenHotel);
		panelSuperior.add(panelTitulo);
		
		panelPie.add(btImprimir);
		panelPie.add(btAceptar);
		panelPie.add(btSalir);
		// establecer layout
		
		BorderLayout bl = new  BorderLayout();
		setLayout(bl);
		
		// add paneles
		add(panelSuperior, BorderLayout.PAGE_START);
		add(panelInferior,BorderLayout.CENTER);
		add(panelPie,BorderLayout.PAGE_END);
		// poner bordes
		ponerBordes();
	}
	private void composicionCompuesto() {
		panelCompuest = new JPanel();
		// group
		GroupLayout gl = new GroupLayout(panelCompuest);
		panelCompuest.setLayout(gl);
		// adds
		panelCompuest.add(panelPersonal);
		panelCompuest.add(panelReserva);
		panelCompuest.add(panelImpresion);
		// definicion horizontal
		gl.setHorizontalGroup(
				gl.createSequentialGroup()
				.addGroup(
						gl.createParallelGroup()
						.addComponent(panelPersonal)
						.addComponent(panelImpresion)
						)
				.addComponent(panelReserva)
				);
		// definicion vertical 
		gl.setVerticalGroup(
				gl.createParallelGroup()
				.addGroup(
						gl.createSequentialGroup()
						.addComponent(panelPersonal,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
						.addComponent(panelImpresion)
						)
				
//				.addComponent(panelPersonal,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				.addComponent(panelReserva,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				
				);
	}
	/**
	 * metodo que pone lso bordes con titulos a los paneles
	 */
	private void ponerBordes() {
		panelPersonal.setBorder(BorderFactory.createTitledBorder("datos personales"));
		panelReserva.setBorder(BorderFactory.createTitledBorder("datos Reserva"));
	}
	/**
	 * metod que usa las propieadades de toolkit
	 */
	public void initToolKit() {
		// captura del toolkit
		Toolkit toolKit = this.getToolkit();
		// cambio de la dimension
		this.setSize(toolKit.getScreenSize());
		
		// cambio del icono
		this.setIconImage(toolKit.getImage(this.getClass().getResource("/images/logoIcono.png")));
		
	}
	/**
	 * @return the panelTitulo
	 */
	public PanelTitulo getPanelTitulo() {
		return panelTitulo;
	}
	/**
	 * @param panelTitulo the panelTitulo to set
	 */
	public void setPanelTitulo(PanelTitulo panelTitulo) {
		this.panelTitulo = panelTitulo;
	}
	/**
	 * @return the panelPersonal
	 */
	public PanelPersonal getPanelPersonal() {
		return panelPersonal;
	}
	/**
	 * @param panelPersonal the panelPersonal to set
	 */
	public void setPanelPersonal(PanelPersonal panelPersonal) {
		this.panelPersonal = panelPersonal;
	}
	/**
	 * @return the panelReserva
	 */
	public PanelReserva getPanelReserva() {
		return panelReserva;
	}
	/**
	 * @param panelReserva the panelReserva to set
	 */
	public void setPanelReserva(PanelReserva panelReserva) {
		this.panelReserva = panelReserva;
	}
	/**
	 * @return the panelCompuest
	 */
	public JPanel getPanelCompuest() {
		return panelCompuest;
	}
	/**
	 * @param panelCompuest the panelCompuest to set
	 */
	public void setPanelCompuest(JPanel panelCompuest) {
		this.panelCompuest = panelCompuest;
	}
	/**
	 * @return the panelImpresion
	 */
	public PanelImpresion getPanelImpresion() {
		return panelImpresion;
	}
	/**
	 * @param panelImpresion the panelImpresion to set
	 */
	public void setPanelImpresion(PanelImpresion panelImpresion) {
		this.panelImpresion = panelImpresion;
	}
	/**
	 * @return the btImprimir
	 */
	public JButton getBtImprimir() {
		return btImprimir;
	}
	/**
	 * @param btImprimir the btImprimir to set
	 */
	public void setBtImprimir(JButton btImprimir) {
		this.btImprimir = btImprimir;
	}
	/**
	 * @return the btSalir
	 */
	public JButton getBtSalir() {
		return btSalir;
	}
	/**
	 * @param btSalir the btSalir to set
	 */
	public void setBtSalir(JButton btSalir) {
		this.btSalir = btSalir;
	}
	/**
	 * @return the btAceptar
	 */
	public JButton getBtAceptar() {
		return btAceptar;
	}
	/**
	 * @param btAceptar the btAceptar to set
	 */
	public void setBtAceptar(JButton btAceptar) {
		this.btAceptar = btAceptar;
	}
	
	
}
