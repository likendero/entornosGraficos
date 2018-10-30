package ejercicio1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
/**
 * calse principal
 * @author likendero
 *
 */
public class Ej1Principal implements ActionListener {
	private static JCheckBox cbNegrita, cbItalica;
	private static JLabel lbTexto;
	/**
	 * metodo que construye la ventana
	 */
	public static void make() {
		// instanciacion de la ventana
		Ej1Ventana ven = new Ej1Ventana();
		// instanciacion de los paneles
		Ej1PanelSuperior panelSuperior = new Ej1PanelSuperior();
		PanelInferior panelInferior = new PanelInferior();
		// crear control 
		
		// captura de los elementos
		cbNegrita = panelInferior.getCbNegrita();
		cbItalica = panelInferior.getCbItalica();
		lbTexto = panelSuperior.getLbTexto();
		// creacion de principal
		Ej1Principal prin = new Ej1Principal();
		// add acciones
		cbNegrita.addActionListener(prin);
		cbItalica.addActionListener(prin);
		
		// annadir actionListener
		ven.add(panelSuperior,BorderLayout.PAGE_START);
		ven.add(panelInferior,BorderLayout.PAGE_END);
		// hacer visible
		ven.setVisible(true);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				make();
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// check box negrita
		if(cbNegrita.isSelected() && cbItalica.isSelected() ) {
			lbTexto.setText("<html><i><b>En un lugarde la mancha de cuyo nombre...</b></i></html>");
		}
		else {
			if(cbNegrita.isSelected()) {
				lbTexto.setText("<html><i><b>En un lugarde la mancha de cuyo nombre...</b></i></html>");
			}else {
				lbTexto.setText("<html>En un lugarde la mancha de cuyo nombre...</html>");
			}
			if(cbItalica.isSelected()) {
				lbTexto.setText("<html><i>En un lugarde la mancha de cuyo nombre...</i></html>");
			}else if(!cbNegrita.isSelected()) {
				lbTexto.setText("<html>En un lugarde la mancha de cuyo nombre...</html>");
			}
		}
		
	}
}

