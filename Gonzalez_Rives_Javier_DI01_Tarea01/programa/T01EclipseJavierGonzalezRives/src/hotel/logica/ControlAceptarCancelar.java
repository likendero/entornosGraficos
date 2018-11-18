package hotel.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import hotel.interfaz.DialogAltaReservas;
import hotel.interfaz.PanelImpresion;
import hotel.interfaz.PanelPersonal;
import hotel.interfaz.PanelReserva;

/**
 * clase que controla las acciones de los botones para 
 * aceptar y cancelar, en aceptar comprueba los campos y en cancelar no 
 * @author Javier Gonzalez Rives
 *
 */
public class ControlAceptarCancelar implements ActionListener {
	private PanelPersonal panelPersonal;
	private PanelReserva panelReserva;
	private PanelImpresion panelImpresion;
	private DialogAltaReservas altas;
	private JButton btAceptar,btCancelar;
	/**
	 * metodo constructor del control
	 */
	public ControlAceptarCancelar(DialogAltaReservas altas) {
		super();
		this.altas = altas;
		// captura de los paneles
		panelPersonal = altas.getPanelPersonal();
		panelReserva = altas.getPanelReserva();
		panelImpresion = altas.getPanelImpresion();
		// aptura botones
		btAceptar = altas.getBtAceptar();
		btCancelar = altas.getBtSalir();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// caso se pulse el boton cancelar
		if(e.getSource() == btCancelar) {
			cancelar();
		}
		// caso que se pulse el boton aceptar
		if(e.getSource() == btAceptar) {
			aceptar();
		}
	}
	
	// metodos acciones
	/**
	 * metodo que realiza la accion para salir
	 */
	private void cancelar() {
		altas.setVisible(false);
		panelImpresion.reinicio();
		panelPersonal.reinciar();
		panelReserva.reiniciar();
	}
	private void aceptar() {
		if(
				panelReserva.aceptar() &&
				panelPersonal.aceptar()
				) {
			// todo esta correcto se muestra un mensaje indicandolo
			JOptionPane.showMessageDialog(null, "se han guardado los datos", "alta finalizada", JOptionPane.INFORMATION_MESSAGE);
			// borrado de los datos
			cancelar();
		}
		JOptionPane.showMessageDialog(null, "el cuestionario no esta devidamente relleno", "error en alta", JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	
	
	
	
}
