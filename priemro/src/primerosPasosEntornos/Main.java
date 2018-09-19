package primerosPasosEntornos;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		MiMarco marquito = new MiMarco();
		marquito.setVisible(true);
		marquito.setSize(new Dimension(200,200));
		marquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
