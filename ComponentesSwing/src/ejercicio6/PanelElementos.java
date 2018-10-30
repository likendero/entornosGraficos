package ejercicio6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PanelElementos extends JPanel
{
	private JTextField txUsuario;
	private JPasswordField psContra;
	private JTextField txTelefono;
	private JFormattedTextField ftxFecha;
	/**
	 * constructor del panel con los elementos
	 */
	public PanelElementos()
	{
		super();
	}
	/**
	 * metodo que inicializa los elementos del panel
	 */
	private void init()
	{
		// instanciacion de los elemetnos
		// JFormatedTextField
		//Date hoy = new Date();
		//DateFormat formato = DateFormat.getDateInstance(DateFormat.SHORT);
		//formato.setLenient(false);
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ftxFecha = new JFormattedTextField(mask);
		ftxFecha.setText(fechaInicial());
		
		// annadir
	}
	/**
	 * metodo que devuelve la feha formateada
	 * @return
	 */
	private String fechaInicial() 
	{
		Date date = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		String fecha = formato.format(date);
		return fecha;
	}
	
}
