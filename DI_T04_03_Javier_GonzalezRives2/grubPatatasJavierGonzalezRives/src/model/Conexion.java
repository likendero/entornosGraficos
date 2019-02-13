/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Conexion {
    private final String USUARIO = "patata";
    private final String PASS = "patata";
    private final String CONEXION = "jdbc:mysql://localhost:3306/base_patatas?useSSL=true";
    private Connection connection ;
    /**
     * metod constructor, junto a este se realiza la conexion
     * @throws SQLException caso de error en la base dedatos
     */
    public void conexion()throws SQLException{
        
        connection = null;
        
        
    }
    /**
     * metodo que devuelve una conexion con la base de datos
     * @return conexion con la base de datos
     */
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(CONEXION,USUARIO,PASS);
    }
}
