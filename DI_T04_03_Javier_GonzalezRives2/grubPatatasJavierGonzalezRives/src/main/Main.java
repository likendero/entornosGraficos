/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Acciones;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.BasePatata;
import view.Ventana;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Ventana ventana = new Ventana();
            BasePatata base = new BasePatata();
            Acciones acciones = new Acciones(ventana,base);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "ha ocurrido un error en la conexion con la base de datos\nasegurese tener la base de datos creada"
            , "error",JOptionPane.ERROR_MESSAGE);
            sql.printStackTrace();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ha ocurrido un error en la conexion con la base de datos\nasegurese tener la base de datos creada"
            , "error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
