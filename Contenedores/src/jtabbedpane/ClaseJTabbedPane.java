package jtabbedpane;
import java.awt.Color;

import javax.swing.*;

import aplicacion.VentanaPrincipal;

public class ClaseJTabbedPane extends JDialog
{
	private JPanel miPanel,panel1,panel2;//paneles de ejemplo
	JLabel labelTitulo, tituloPanel1,tituloPanel2;/*declaramos el objeto Label*/
	private JButton miBotonPanel2;
	JTextArea areaDeTexto;
	String texto;
	public ClaseJTabbedPane (VentanaPrincipal miVentanaPrincipal, boolean modal )
	{
		super(miVentanaPrincipal, modal);
	    JTabbedPane   pestaas;
	    
	    pestaas   = new JTabbedPane   ( );
	    
	    /*propiedades Panel1*/
	    componentesPanel1();
	   	/*propiedades Panel2*/
		componentesPanel2();
		/*propiedades Panel3*/
		componentesPanel3();
	    
	    pestaas.addTab ( "Pesta�a 1", miPanel );
	    pestaas.addTab ( "Pesta�a 2", panel1   );
	    pestaas.addTab ( "Pesta�a 3", panel2   );

	    getContentPane ( ).add ( pestaas );

		setTitle     ( "CoDejaVu : JTabbedPane" ); 
		setSize      ( 420, 250   );
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		
	}
	private void componentesPanel1() {
		miPanel = new JPanel();
		miPanel.setLayout(null);
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENEDOR JTABBEDPANE");
		labelTitulo.setBounds(120, 20, 180, 23);
		
		texto="Este conetenedor presenta una ventana con pesta�as en su\n barra " +
				"de tareas, cada pesta�a presenta un panel diferente \ndonde se " +
				"pueden almacenar otros componentes\n Java Swing ";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(20, 50, 350, 100);
		
		/*Agregamos los componentes al Contenedor*/
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		add(miPanel);
		
	}
	
	private void componentesPanel2() {
		panel1 = new JPanel();
		panel1.setBounds(50, 50, 200, 150);
		panel1.setBackground(Color.red);
		
		tituloPanel1= new JLabel();
		tituloPanel1.setText("Titulo Panel1");
		tituloPanel1.setBounds(40, 20, 90, 23);
		
		panel1.add(tituloPanel1);
	}
	
	private void componentesPanel3() {
		panel2 = new JPanel();
		panel2.setLayout(null);//con esto defino que voy a asignar posiciones de forma manual, sin layout
		panel2.setBounds(280, 50, 200, 150);
		panel2.setBackground(Color.green);
		
		tituloPanel2= new JLabel();
		tituloPanel2.setText("Titulo Panel2");
		tituloPanel2.setBounds(60, 20, 90, 23);
		
		miBotonPanel2 = new JButton();
		miBotonPanel2.setText("Boton");
		miBotonPanel2.setBounds(50, 80, 90, 23);
		
		panel2.add(tituloPanel2);
		panel2.add(miBotonPanel2);
	}
}

