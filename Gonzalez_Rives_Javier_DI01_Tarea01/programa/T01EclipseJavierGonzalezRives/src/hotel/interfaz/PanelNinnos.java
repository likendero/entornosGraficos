package hotel.interfaz;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;


/**
 * sub panel del panel con los datos de la reserva
 * con selector de edad y un cuadro indicando el tipo de cama
 * segun la edad
 * @author likendero
 *
 */public
 class PanelNinnos extends JPanel {
	private JSpinner spEdad;
	private JTextArea taAclaracion;
	private GroupLayout gl;
	/**
	 * constructor
	 */
	public PanelNinnos() {
		super();
		setVisible(false);
		setBackground(Color.BLACK);
		init();
	}
	/**
	 * metodo que sirve para iniciar los componentes
	 */
	private void init() {
		///instanciacion
		//  spinner
		SpinnerNumberModel tipoSp = new SpinnerNumberModel(0, 0, 14, 1);
		spEdad = new JSpinner(tipoSp);
		// textArea
		taAclaracion = new JTextArea(
				"0-3 años cuna\n" 
				+ "4-10 supletoria pequeña\n"
				+ "11-14 supletoria grande");
		// layout
		gl = new GroupLayout(this);
		this.setLayout(gl);
		// adds
		add(spEdad);
		add(taAclaracion);
		// disposicion
		defGl();
	}
	/**
	 * metodo que define la disposicion con el group layout
	 */
	private void defGl() {
		// definicion horizontal
		gl.setHorizontalGroup(
				gl.createParallelGroup()
				.addComponent(spEdad)
				.addComponent(taAclaracion)
				);
		// definivion vertical
		gl.setVerticalGroup(
				gl.createSequentialGroup()
				.addComponent(spEdad)
				.addComponent(taAclaracion)
				);
	}
	// GETTERS SETTERS/////////////////////////////////
	public JSpinner getSpEdad() {
		return spEdad;
	}
	public void setSpEdad(JSpinner spEdad) {
		this.spEdad = spEdad;
	}
	public JTextArea getTaAclaracion() {
		return taAclaracion;
	}
	public void setTaAclaracion(JTextArea taAclaracion) {
		this.taAclaracion = taAclaracion;
	}
	
}