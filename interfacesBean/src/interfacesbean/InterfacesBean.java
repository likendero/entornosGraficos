/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesbean;

import javax.swing.SwingUtilities;

/**
 *
 * @author linuxdiurno
 */
public class InterfacesBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal ven = new VentanaPrincipal();
                ven.setVisible(true);
            }
        });
    }
    
}
