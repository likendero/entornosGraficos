package marcos2;

import javax.swing.JFrame;

public class Marcazo extends JFrame {
	public Marcazo() {
		super("te la creite weiii");
		this.setBounds(100, 100, 1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
	}
}
