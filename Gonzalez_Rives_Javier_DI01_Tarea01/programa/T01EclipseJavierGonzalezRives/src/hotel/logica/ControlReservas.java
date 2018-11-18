package hotel.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import hotel.interfaz.PanelNinnos;
//import hotel.interfaz.PanelImagenHotel;
//import hotel.interfaz.PanelNinnos;
import hotel.interfaz.PanelReserva;
//import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 * clase que controla las acciones del panel reservas
 * @author javier Gonzalez Rives
 *
 */
public class ControlReservas implements
FocusListener, ActionListener, ItemListener {
	
	private JFormattedTextField tfEntrada,tfSalida;
	private JTextField txTotalDias, txTotalReserva;
	private JComboBox<String> cbTipo;
	private JSpinner spNumeroHabitaciones;
	private JCheckBox chNinnos;
	private static final String tipo[] = {"individual","doble","suite"};
	// utiles
	private double total;
	private int numeroDias;
	private PanelNinnos panelNinnos; 
	//private PanelImagenHotel panelImagen;
	/**
	 * metodo constructor
	 */
	public ControlReservas(PanelReserva reserva) {
		super();
		// captura de los componentes
		tfEntrada = reserva.getTfEntrada();
		tfSalida = reserva.getTfSalida();
		txTotalDias = reserva.getTxTotalDias();
		txTotalReserva = reserva.getTxTotal();
		cbTipo = reserva.getCbTipo();
		spNumeroHabitaciones = reserva.getSpNumeroHabitaciones();
		chNinnos = reserva.getChNinnos();
		panelNinnos = reserva.getPanelNinnos();
		// num dias
		numeroDias = 1;
		// total 
		total = 0;
		// annadir focos
		annadirFocos();
		//acciones
		annadirAcciones();
		
	}
	/**
	 * metodo que le annade los focos a los elementos
	 * para que esten atentos a la leccion
	 */
	private void annadirFocos() {
		// FOCOS
		tfEntrada.addFocusListener(this);
		tfSalida.addFocusListener(this);
		txTotalDias.addFocusListener(this);
		txTotalReserva.addFocusListener(this);
	}
	/**
	 * annadir acciones
	 */
	private void annadirAcciones() {
		//combo box 
		cbTipo.addItemListener(this);
		// check button
		chNinnos.addActionListener(this);
		// 
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// actualizacion de los cambios
		proceso();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(chNinnos.isSelected()) {
			panelNinnos.setVisible(true);
		}else {
			panelNinnos.setVisible(false);
		}
		proceso();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		proceso();
	}
	// METODOS CALCULO//////////////////////
	private void calculoFecha() {
		try {
			// captura de la introduccion
			String fechaIncio = tfEntrada.getText();
			String fechaSalida = tfSalida.getText();
			// date format
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			// parseo de las fechas
			Date fecha1 = formato.parse(fechaIncio);
			Date fecha2 = formato.parse(fechaSalida);
			// comprobaciones
			switch(fecha1.compareTo(fecha2)) {
			// si es 0 o 1 es son iguales o mayor
			case 1:
				JOptionPane.showMessageDialog(null, "la primera fecha debe ser menor que la primera", "error en las fechas", JOptionPane.ERROR_MESSAGE);
				numeroDias = 0;
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "las fechas no pueden ser iguales", "error en las fechas", JOptionPane.ERROR_MESSAGE);
				numeroDias = 0;
				break;
			case -1:
				// calculo del numero de dias
				numeroDias =(int) ((fecha2.getTime()-fecha1.getTime())/86400000);
				break;
			}
			txTotalDias.setText(numeroDias+"");
		}catch(IllegalArgumentException il) {
			JOptionPane.showMessageDialog(null, "uno de los campos de fecha no es correcto", "error en las fechas", JOptionPane.ERROR_MESSAGE);
		}catch(ParseException px) {
			JOptionPane.showMessageDialog(null, "uno de los campos de fecha no es correcto", "error en las fechas", JOptionPane.ERROR_MESSAGE);
		}catch(DateTimeException dt) {
			JOptionPane.showMessageDialog(null, "Fecha no valida ", "error en las fechas", JOptionPane.ERROR_MESSAGE);
			dt.printStackTrace();
		}
	}
	/**
	 * metoto que acutaliza el precio ante un cambio
	 */
	private void actualizarPrecio() {
		int multiplicador = 0;
		// se annade la supletoria si esta seleccionada
		if(chNinnos.isSelected()) {
			multiplicador += 20;
		}
		// dependiendo de la habitacion se annade un multiplicador de precio
		switch ((String)cbTipo.getSelectedItem()) {
		case "individual":
				multiplicador += 50;
			break;
		case "doble":
			multiplicador += 75;
			break;
		case "suite":
			multiplicador += 125;
			break;
		}
		Integer numHab = (Integer)spNumeroHabitaciones.getValue();
		
		// actualizacion del valor final
		total = multiplicador * numeroDias * numHab.intValue();
	}
	/**
	 * metodo que realiza todas las operaciones ante las 
	 * actualizaciones
	 */
	private void proceso() {
		// actualizacion de la fecha
		calculoFecha();
		// actualizacion del precio
		actualizarPrecio();
		// se muestran los resultados
		txTotalDias.setText(numeroDias + "");
		txTotalReserva.setText(total + "€");
	}
}
























