package jOptionPanel;

import javax.swing.JOptionPane;

public class ShowInput {
	public static void main(String[] args) {
		String papapa = new String();
		papapa = JOptionPane.showInputDialog("juas juas");
		JOptionPane.showMessageDialog(null, "me gusta tu " + papapa, "allalala", JOptionPane.INFORMATION_MESSAGE);
		String[] lala = {"hola","adios","banana"};
		papapa = (String)JOptionPane.showInputDialog( 
				null, 
				"mensaje",
				"hola",
				JOptionPane.DEFAULT_OPTION,
				null,
				lala,
				lala[1]
				);
		int respuesta = JOptionPane.showConfirmDialog(null,"estas ceguro wey","mandinga",JOptionPane.YES_NO_CANCEL_OPTION);
		
	}
}
