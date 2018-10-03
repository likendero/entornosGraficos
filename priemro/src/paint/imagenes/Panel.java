package paint.imagenes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * metodo que devuelve una imagen a partir de un directorio
	 * @param dir
	 * @return
	 */
	private Image imagen(File dir)throws IOException{
		Image imagen;
		// comprobacion que el directorio existe
		if(dir.exists()) {
		// copiado de la imagen
		imagen = ImageIO.read(dir);
		}else {
			// se lanza la excepcion en el caso que no exista la imagen
			throw new IOException("no existe la imagen");
		}
		
		return imagen;
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Graphics2D g2d = (Graphics2D)g;
		try {
			
			Image img = imagen(new File("/home/likendero/Imágenes/1273190243dff032e97a2f375b8f76ca.jpg"));
			g.drawImage(img, 100, 100, null);
		}catch(IOException io) {
			JOptionPane.showMessageDialog(this, "ha habido un error, la imagen no se encuentra");
		}
	}
}
