
package pongcompleto;
import javax.swing.SwingUtilities;
import pong.interfaz.Ventana;
/**
 *
 * @author Javier Gonzalez Rives
 */
public class PongCompleto {
    private static void mostrarVentana(){
        Ventana ven = new Ventana();
        ven.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrarVentana();
            }
        });
    }
    
}
