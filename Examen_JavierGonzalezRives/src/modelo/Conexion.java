/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Conexion {
    
    private final String NOMBRE = "usuario";
    private final String PASS = "usuario";
    private final String URL = "jdbc:mysql://localhost/empresa?useSSL=false";
    /**
     * metodo constructor con el que se crea la conexion
     */
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(URL,NOMBRE,PASS);
            // en el caso que no sea posible realzar las conexiones
        }catch(ClassNotFoundException | SQLException con){
            JOptionPane.showMessageDialog(null, "ha sucedido un problema con la conexion, cierre inebitable","error",JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        
    }

    public Connection getConexion()throws SQLException {
        return DriverManager.getConnection(URL,NOMBRE,PASS) ;
    }

    
    
}
