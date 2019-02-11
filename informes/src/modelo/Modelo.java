/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author windiurno
 */
public class Modelo {
    Connection connection;
    public Modelo (){
        crearConexion();
    }
    /**
     * metodo que sirve para crear una conexion con la base de datos
     */
    public void crearConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/jasper_bdd?user=root&password=admin&useSSL=false");
        }catch(Exception ex){
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
}
