package primerosPasosEntornos;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		MiMarco marquito = new MiMarco();
		marquito.setVisible(true);
		//marquito.setSize(new Dimension(200,200));
		marquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//marquito.setLocation(400, 400);
		marquito.setBounds(200,200, 200, 200);
		marquito.setTitle("clasesita weiiiiii");
		marquito.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		marquito.setResizable(false);
	}
}
