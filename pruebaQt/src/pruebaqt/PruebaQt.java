/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaqt;

import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;
import javax.swing.SwingUtilities;

/**
 *
 * @author likendero
 */
public class PruebaQt {
    /**
     * metodo que prepara la ventana para la visualizacion
     */
    private static void mostrar(){
        Ventana ven = new Ventana();
        
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                

                QApplication.initialize(args);
                QMainWindow mw = new QMainWindow();
                Ventana principal = new Ventana();
                principal.setupUi( mw );
                mw.show();
                QApplication.execStatic();


            }
        });
    }
    
}
