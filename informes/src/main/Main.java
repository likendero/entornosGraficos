  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Controlador.CtrlInformes;
import java.io.Console;
import java.util.logging.ConsoleHandler;
import javax.swing.JDialog;

/**
 *
 * @author windiurno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vista.Informes inf = new vista.Informes(null, true);
        Controlador.CtrlInformes ctrlInformes = new CtrlInformes(inf);
        inf.setVisible(true);
    }
    
}
