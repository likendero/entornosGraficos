package toolKit;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado {
	public static void main(String[] args) {
		Marco vent = new Marco("centrado");
		vent.setVisible(true);
	}
}
/**
 * clase que define las caracteristiccas de una ventana que se va a crear de forma centrada
 * @author likendero
 *
 */
class Marco extends JFrame{
	
	public Marco(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		posicionVentnana();
		imagenVentana();
	}
	
	 
	public void posicionVentnana(){
		// sacando el valor de la caja de herramientas
		Toolkit cajita = Toolkit.getDefaultToolkit();
		// saco una variable dimension para guardar los parametros
		Dimension dimensiones = new  Dimension(cajita.getScreenSize());
		/*
		 * para que la ventana aparezca centrada se parte desde el punto central de la 
		 * pantalla que es w/2*h/2, lo siguiente seria ajustar el centro de la ventana a
		 * ese punto central restandole la mitad de las dimensiones de la ventana w/2-venw/2*w/2-venh/2
		 */
		int anchoV,altoV;
		anchoV = (int)dimensiones.getWidth()/2;
		altoV = (int)dimensiones.getHeight()/2;
		this.setBounds((int)dimensiones.getWidth()/2-anchoV/2, (int)dimensiones.getHeight()/2-altoV/2, anchoV, altoV);
	}
	public void imagenVentana() {
		// sacando el valor de la caja de herramientas
		Toolkit cajita = Toolkit.getDefaultToolkit();
		// a trabes de toolkit saco una imagen con su directorio
		Image imagen = cajita.getImage("/home/likendero/Imágenes/Wallpapers/Alberto-Contador-Tinkoff-1.jpg");
		// establezco la imagen
		this.setIconImage(imagen);
	}
}
