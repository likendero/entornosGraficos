/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Conexion {
    private final String USUARIO = "patata";
    private final String PASS = "patata";
    private final String CONEXION = "jdbc:mysql://localhost/base_patatas?" ;
    /**
     * metod constructor, junto a este se realiza la conexion
     */
    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    /**
     * metodo que devuelve una conexion con la base de datos
     */
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(CONEXION,USUARIO,PASS);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
