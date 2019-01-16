/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaz.VentanaJuego;
import javax.swing.SwingUtilities;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Main {
    /**
     * metodo que crea la ventana
     */
    public static void mostrar(){
        VentanaJuego ventana = new VentanaJuego();
        ventana.setVisible(true);
    }
    /**
     * inicio del juego
     * @param args 
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> mostrar());
    }
}
