package componentes;

import javax.swing.SwingUtilities;

public class principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaPrincipal ven = new VentanaPrincipal();
				ven.setVisible(true);
			}
		});
		

	}

}
