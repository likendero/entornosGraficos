package hotel.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import hotel.interfaz.PanelImpresion;
import hotel.interfaz.PanelPersonal;
import hotel.interfaz.PanelReserva;
/**
 * Clase que controla los eventos para el cuadro con la impresion de
 * la informacion
 * @author Javier Gonzalez Rives
 *
 */
public class ControlImpresion implements ActionListener {
	private JTextArea txPersonal;
	private JTextArea txReserva;
	private PanelReserva pan;
	private PanelPersonal per;
	/**
	 * 
	 */
	public ControlImpresion(PanelReserva pan,PanelPersonal per,PanelImpresion imp) {
		super();
		// captura cajas de texto
		txPersonal = imp.getTxPersonales();
		txReserva = imp.getTxReserva();
		// captura del panel Reserva
		this.pan = pan;
		this.per = per;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String personales = "";
		String reserva = "";
		// coger datos personales
		personales += "nombre: " + per.getTxNombre().getText().trim() + '\n';
		personales += "apellido: " + per.getTxApellidos().getText().trim() + '\n';
		personales += "dreccion: " + per.getTxDireccion().getText().trim() + '\n';
		personales += "telefono: " + per.getTxTelefono().getText().trim();
		// coger datos de la reserva
		reserva += "fecha entrada: " + pan.getTfEntrada().getText() + '\n';
		reserva += "fecha salida: " + pan.getTfSalida().getText() + '\n';
		reserva += "total de dias: " + pan.getTxTotalDias().getText() + '\n';
		reserva += "cama supletoria o cuna: " + (pan.getChNinnos().isSelected()?"si":"no") + '\n';
		reserva += "precio total: " + pan.getTxTotal().getText();
		
		// paso de los valores
		txPersonal.setText(personales);
		txReserva.setText(reserva);
	}
}
