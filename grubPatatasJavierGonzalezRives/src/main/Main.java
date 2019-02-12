/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Acciones;
import javax.swing.JFrame;
import view.Ventana;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Acciones acciones = new Acciones(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
