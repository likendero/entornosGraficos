package hotel.logica;

import hotel.interfaz.Ventana;

public class ControlCentral {
	private ControlReservas controlReservas;
	private ControlImpresion controlImpresion;
	/**
	 * metodo constructor
	 * @param ventana
	 */
	public ControlCentral(Ventana ventana){
		super();
		// control para las reservas
		controlReservas = new ControlReservas(ventana.getAltasDi().getPanelReserva());
		// control para la impresion
		controlImpresion = new ControlImpresion(
				ventana.getAltasDi().getPanelReserva(),
				ventana.getAltasDi().getPanelPersonal(), 
				ventana.getAltasDi().getPanelImpresion()
				);
		ventana.getAltasDi().getBtImprimir().addActionListener(controlImpresion);
		
		//control para aceptar y cancelar
		ControlAceptarCancelar controlAceptarCancelar = new ControlAceptarCancelar(ventana.getAltasDi()) ;
		ventana.getAltasDi().getBtAceptar().addActionListener(controlAceptarCancelar);
		ventana.getAltasDi().getBtSalir().addActionListener(controlAceptarCancelar);
	}
}
