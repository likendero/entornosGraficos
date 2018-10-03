package jOptionPanel;

import javax.swing.JOptionPane;


/**
 * clase para probar mensajes emergentes
 * 
 * @author likendero
 *
 */
public class ShowMensage {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "que tal andamios juejue", "hola bue", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "que tal andamios juejue", "hola bue", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "jajajajajaj", "ajajajajajajajja", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "aijdoiishdg", "lalalala land", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "aijdoiishdg", "lalalala land", JOptionPane.PLAIN_MESSAGE);
		
		ShowIcon icon = new ShowIcon();
		JOptionPane.showMessageDialog(null, "PATATA", "MANZANA", JOptionPane.DEFAULT_OPTION,icon);
	}
}
