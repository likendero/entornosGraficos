package hotel.interfaz;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.MaskFormatter;

/**
 * clase que sirve para crear un panel con los datos de la reserva
 * - fecha de entrada formatedtx con fecha
 * - fecha de salida igual al anterior pero adelantado un dia
 * - dias fin de la reserva
 * - tipo de habitacion Combo box
 * - numero de camas Spinner
 * - check box si hay niños
 * - selecctor de edad
 * - cuadro de texto indicando el tipo de cama
 * segun la edad
 * @author Javier Gonzalez Rives
 *
 */
public class PanelReserva extends JPanel {
	private JFormattedTextField tfEntrada, tfSalida;
	private JTextField txTotalDias,txTotalReserva;
	//private int total;
	private JLabel lbEntrada,lbSalida,lbTotal,lbTipo,lbPrecio;
	private JComboBox<String> cbTipo;
	private JSpinner spNumeroHabitaciones;
	private JCheckBox chNinnos;
	private String tipo[] = {"individual","doble","suite"};
	private PanelNinnos panelNinnos;
	private PanelImagenHotel panelImagen;
	private GroupLayout gl;
	
	/**
	 * metodo constructor
	 */
	public PanelReserva() {
		super();
		setBackground(Color.ORANGE);
		init();
	}
	/**
	 * metodo que incializa los elementos 
	 * de la ventana
	 */
	private void init() {
		/// instanciacion elementos
		// cuadros con formato
		initFormatedText();
		// textfield
		txTotalReserva = new JTextField(10);
		txTotalReserva.setEditable(false);
		txTotalDias = new JTextField(2);
		txTotalDias.setEditable(false);
		//total = 1;
		txTotalDias.setText(""+1);
		// isntanciacion etiquetas
		lbEntrada = new JLabel("fecha de entrada");
		lbSalida = new JLabel("fecha salida");
		lbTotal = new JLabel("Total de dias: ");
		lbTipo = new JLabel("tipo de habitacion");
		lbPrecio = new JLabel("Precio total ");
		// comboBox
		cbTipo = new JComboBox<String>(tipo);
		cbTipo.setSelectedIndex(0);
		// spinner
		spNumeroHabitaciones = new JSpinner();
		// definicion del tipo de spinner con paso de 1 hasta 50
		SpinnerNumberModel tipoSp = new SpinnerNumberModel(1, 1, 50, 1);
		// vinculacion
		spNumeroHabitaciones.setModel(tipoSp);
		///check box
		chNinnos = new JCheckBox("ninnos", false);
		// panel ninnos
		panelNinnos = new PanelNinnos();
		// panel Imagen
		panelImagen = new PanelImagenHotel();
		// layout
		gl = new GroupLayout(this);
		this.setLayout(gl);
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		/// adds
		// 
		// panel
		add(tfEntrada);
		add(tfSalida);
		add(lbPrecio);
		add(txTotalDias);
		add(lbEntrada);
		add(lbSalida);
		add(lbTotal);
		add(lbPrecio);
		add(spNumeroHabitaciones);
		add(chNinnos);
		add(lbTipo);
		add(cbTipo);
		add(panelNinnos);
		add(panelImagen);
		// edfinicion posicion 
		defGl();
	}
	/**
	 * metodo que inicializa el las cajas de texto
	 * con formato
	 */
	private void initFormatedText() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha1 = sdf.format(date);
		// annadir un dia
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.roll(Calendar.DATE, true);
		// definir fecha
		String fecha2 = sdf.format(cal.getTime());
		// creacion de la mascara
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// instanciacion 
		tfEntrada = new JFormattedTextField(mask);
		tfSalida = new JFormattedTextField(mask);
		// set text
		tfEntrada.setText(fecha1);
		tfSalida.setText(fecha2);
	}
	/**
	 * metodo que define la estructura del 
	 * layout
	 */
	private void defGl() {
		// alineacion horizontal
		gl.setHorizontalGroup(
				gl.createSequentialGroup()
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbEntrada)
						.addComponent(lbTotal)
						.addComponent(lbTipo)
						.addComponent(chNinnos)
						.addComponent(panelNinnos)
						.addComponent(lbPrecio)
						)
				.addGroup(
						gl.createParallelGroup()
						.addComponent(tfEntrada)
						.addComponent(txTotalDias)
						.addComponent(cbTipo)
						.addComponent(txTotalReserva)
						//.addComponent(panelNinnos)
						)
				.addComponent(lbSalida)
				.addComponent(tfSalida)
				.addComponent(panelImagen)
				);
		// alienacion vertical
		gl.setVerticalGroup(
				gl.createParallelGroup()
				.addGroup(
					gl.createSequentialGroup()	
					.addGroup(
							gl.createParallelGroup()
							.addComponent(lbEntrada,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(tfEntrada,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(lbSalida,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(tfSalida,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							//.addComponent(panelImagen)
							)
					.addGroup(
							gl.createParallelGroup()
							.addComponent(lbTotal,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(txTotalDias,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							
							)
					.addGroup(
							gl.createParallelGroup()
							.addComponent(lbTipo,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(cbTipo,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					.addComponent(chNinnos,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
					.addComponent(panelNinnos,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
					.addGroup(
							gl.createParallelGroup()
							.addComponent(lbPrecio,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							.addComponent(txTotalReserva,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
							)
					)
				.addComponent(panelImagen)
				);
	}
	/////////////////GETTERS SETTERS//////////////////////////////
	/**
	 * @return the tfEntrada
	 */
	public JFormattedTextField getTfEntrada() {
		return tfEntrada;
	}
	/**
	 * @param tfEntrada the tfEntrada to set
	 */
	public void setTfEntrada(JFormattedTextField tfEntrada) {
		this.tfEntrada = tfEntrada;
	}
	/**
	 * @return the tfSalida
	 */
	public JFormattedTextField getTfSalida() {
		return tfSalida;
	}
	/**
	 * @param tfSalida the tfSalida to set
	 */
	public void setTfSalida(JFormattedTextField tfSalida) {
		this.tfSalida = tfSalida;
	}
	/**
	 * @return the txTotal
	 */
	public JTextField getTxTotal() {
		return txTotalReserva;
	}
	/**
	 * @param txTotal the txTotal to set
	 */
	public void setTxTotal(JTextField txTotal) {
		this.txTotalReserva = txTotal;
	}
	/**
	 * @return the total
	 */
	/*
	public int getTotal() {
		return total;
	}
	*/
	/**
	 * @param total the total to set
	 *//*
	public void setTotal(int total) {
		this.total = total;
	}
	*/
	/**
	 * @return the lbEntrada
	 */
	public JLabel getLbEntrada() {
		return lbEntrada;
	}
	/**
	 * @param lbEntrada the lbEntrada to set
	 */
	public void setLbEntrada(JLabel lbEntrada) {
		this.lbEntrada = lbEntrada;
	}
	/**
	 * @return the lbSalida
	 */
	public JLabel getLbSalida() {
		return lbSalida;
	}
	/**
	 * @param lbSalida the lbSalida to set
	 */
	public void setLbSalida(JLabel lbSalida) {
		this.lbSalida = lbSalida;
	}
	/**
	 * @return the lbTotal
	 */
	public JLabel getLbTotal() {
		return lbTotal;
	}
	/**
	 * @param lbTotal the lbTotal to set
	 */
	public void setLbTotal(JLabel lbTotal) {
		this.lbTotal = lbTotal;
	}
	/**
	 * @return the lbTipo
	 */
	public JLabel getLbTipo() {
		return lbTipo;
	}
	/**
	 * @param lbTipo the lbTipo to set
	 */
	public void setLbTipo(JLabel lbTipo) {
		this.lbTipo = lbTipo;
	}
	/**
	 * @return the cbTipo
	 */
	public JComboBox<String> getCbTipo() {
		return cbTipo;
	}
	/**
	 * @param cbTipo the cbTipo to set
	 */
	public void setCbTipo(JComboBox<String> cbTipo) {
		this.cbTipo = cbTipo;
	}
	/**
	 * @return the spNumeroHabitaciones
	 */
	public JSpinner getSpNumeroHabitaciones() {
		return spNumeroHabitaciones;
	}
	/**
	 * @param spNumeroHabitaciones the spNumeroHabitaciones to set
	 */
	public void setSpNumeroHabitaciones(JSpinner spNumeroHabitaciones) {
		this.spNumeroHabitaciones = spNumeroHabitaciones;
	}
	/**
	 * @return the chNinnos
	 */
	public JCheckBox getChNinnos() {
		return chNinnos;
	}
	/**
	 * @param chNinnos the chNinnos to set
	 */
	public void setChNinnos(JCheckBox chNinnos) {
		this.chNinnos = chNinnos;
	}
	/**
	 * @return the tipo
	 */
	public String[] getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the panelNinnos
	 */
	public PanelNinnos getPanelNinnos() {
		return panelNinnos;
	}
	/**
	 * @param panelNinnos the panelNinnos to set
	 */
	public void setPanelNinnos(PanelNinnos panelNinnos) {
		this.panelNinnos = panelNinnos;
	}
	/**
	 * @return the gl
	 */
	public GroupLayout getGl() {
		return gl;
	}
	/**
	 * @param gl the gl to set
	 */
	public void setGl(GroupLayout gl) {
		this.gl = gl;
	}
	/**
	 * @return the txTotalDias
	 */
	public JTextField getTxTotalDias() {
		return txTotalDias;
	}
	/**
	 * @param txTotalDias the txTotalDias to set
	 */
	public void setTxTotalDias(JTextField txTotalDias) {
		this.txTotalDias = txTotalDias;
	}
	/**
	 * @return the lbPrecio
	 */
	public JLabel getLbPrecio() {
		return lbPrecio;
	}
	/**
	 * @param lbPrecio the lbPrecio to set
	 */
	public void setLbPrecio(JLabel lbPrecio) {
		this.lbPrecio = lbPrecio;
	}
	/**
	 * @return the panelImagen
	 */
	public PanelImagenHotel getPanelImagen() {
		return panelImagen;
	}
	/**
	 * @param panelImagen the panelImagen to set
	 */
	public void setPanelImagen(PanelImagenHotel panelImagen) {
		this.panelImagen = panelImagen;
	}
	
	//// metodos para control
	/**
	 * metodo que reinicia todos los valores
	 */
	public void reiniciar() {
		/// reinicio de las fechas
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha1 = sdf.format(date);
		// annadir un dia
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.roll(Calendar.DATE, true);
		// definir fecha
		String fecha2 = sdf.format(cal.getTime());
		// reinicio del texto
		tfEntrada.setText(fecha1);
		tfSalida.setText(fecha2);
		
		/// reinicio del numero de dias
		this.txTotalDias.setText("1");
		// quitar ninnos
		this.chNinnos.setSelected(false);
		// panel ninnos apagado
		panelNinnos.getSpEdad().setValue(new Integer(0));
		panelNinnos.setVisible(false);
		// cambio del valor
		txTotalReserva.setText("");
	}
	/**
	 * metodo que comprueba los campos necesarios para aceptar
	 */
	public boolean aceptar() {
		int numeroDias = Integer.parseInt(this.getTxTotalDias().getText().trim());
		// en el caso las fechas no den un numero de dias superior a 0
		if(numeroDias <= 0) {
			return false;
		}
		// caso que todo sea correcto
		return true;
	}
}
/**
 * panel que contiene una imagen del hotel
 * @author Javier González Rives
 *
 */
class PanelImagenHotel extends JPanel{
	private JLabel imagen;
	/**
	 * cosntructor
	 */
	public PanelImagenHotel() {
		super();
		imagen = new JLabel();
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/images/miniHotel.png")));
		//setPreferredSize(new Dimension(250, 361);
		add(imagen);
	}
	
}












