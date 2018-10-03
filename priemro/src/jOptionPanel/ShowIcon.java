package jOptionPanel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class ShowIcon implements Icon {
	

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		try {
			Image imagen = ImageIO.read(new File("/home/likendero/Imágenes","1487804099_363696_1487804800_sumario_normal.jpg"));
			g.drawImage(imagen,x,y,c);
		}catch(IOException io) {
			JOptionPane.showMessageDialog(c, "mesajico", "titulico", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}

	@Override
	public int getIconWidth() {
		
		return 50;
	}

	@Override
	public int getIconHeight() {
		
		return 50;
	}
}
