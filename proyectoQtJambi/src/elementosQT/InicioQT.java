package elementosQT;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 * metodo por donde empieza el programa 
 * @author Javier Gonzalez Rives
 */
public class InicioQT {
    /**
     * metodo por donde empieza el programa
     * @param args 
     */
    public static void main(String[] args) {
        // captura de los argumentos al inicio
        QApplication.initialize(args);
        // creacion de un Qmain
        QMainWindow mainWindow = new QMainWindow();
        // creacion del objeto ventana
        HotelRives hotelRives = new HotelRives();
        // vinculacion con la ventana principal
        hotelRives.setupUi(mainWindow);
        mainWindow.show();
        QApplication.execStatic();
    }
}
