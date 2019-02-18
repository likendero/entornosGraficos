/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class BaseCoches {
    private final String INSERT = "insert into Vehiculos values(?,?,?,?,?) ";
    private final String UPDATE = "update  Vehiculos set marca = ?, modelo = ?, nKilometros = ? , fRevision = ?  where matricula = ? ";
    private final String DELETE = "delete from Vehiculos where matricula = ?";
    private final String SELECT = "select * from Vehiculos where matricula = ?";
    private final Conexion conexion;
    /**
     * cosntructor que crea objeto conexion para realizar las conexiones
     */
    public BaseCoches() {
        this.conexion = new Conexion();
    }
    /**
     * metodo que realzia la inserccion de un vehiculo
     * @return true si la operacion transcurre de forma normal false caso contrario
     * @param vehiculo vehiculo a insertar
     */
    public boolean insertarCoche(Vehiculo vehiculo){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(INSERT);
            // introduccion de los valores en el statement
            pre.setString(1, vehiculo.getMatricula().toUpperCase());
            pre.setString(2, vehiculo.getMarca().toUpperCase());
            pre.setString(3, vehiculo.getModelo().toUpperCase());
            pre.setInt(4, vehiculo.getKilometros());
            java.sql.Date date = new Date(vehiculo.getFechaRevision().getTime());
            pre.setDate(5, date);
            // comprovacion de la ejecucion :D
            if(pre.executeUpdate() > 0){
                return true;
            }
            
            con.close();
        }catch(SQLException sql){
            System.out.println("error: " + sql.getMessage());
        }
        return false;
    }
    /**
     * metodo que realzia la inserccion de un vehiculo
     * @return true si la operacion transcurre de forma normal false caso contrario
     * @param vehiculo vehiculo a insertar
     */
    public boolean actualizarCoche(Vehiculo vehiculo){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(UPDATE);
            // introduccion de los valores en el statement
            pre.setString(5, vehiculo.getMatricula().toUpperCase());
            pre.setString(1, vehiculo.getMarca().toUpperCase());
            pre.setString(2, vehiculo.getModelo().toUpperCase());
            pre.setInt(3,vehiculo.getKilometros());
            java.sql.Date date = new Date(vehiculo.getFechaRevision().getTime());
            pre.setDate(4, date);
            // comprovacion de la ejecucion :D
            if(pre.executeUpdate() > 0){
                return true;
            }
            
            con.close();
        }catch(SQLException sql){
            System.out.println("error: " + sql.getMessage());
        }
        return false;
    }
    /**
     * metodo que borra los vehiculos segun su matricula
     * @param vehiculo
     * @return true si es correcto false en caso contrario
     */
    public boolean BorrarCoche(Vehiculo vehiculo){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(DELETE);
            // introduccion de los valores en el statement
            pre.setString(1, vehiculo.getMatricula().toUpperCase());
            // comprovacion de la ejecucion :D
            if(pre.executeUpdate() > 0){
                return true;
            }
            
            con.close();
        }catch(SQLException sql){
            System.out.println("error: " + sql.getMessage());
        }
        return false;
    }
    public Vehiculo buscarCoche(Vehiculo vehiculo){
        Vehiculo aux = null;
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(SELECT);
            // introduccion de los valores en el statement
            pre.setString(1, vehiculo.getMatricula().toUpperCase());
            ResultSet res = pre.executeQuery();
            
            // comprovacion de la ejecucion :D
            if(res.next()){
                String marca = res.getString("marca");
                String modelo = res.getString("modelo");
                int kilometros = res.getInt("nKilometros");
                java.util.Date revision = res.getDate("fRevision");
                aux = new Vehiculo(vehiculo.getMatricula(), marca, modelo, kilometros, revision);
            }
            
            con.close();
        }catch(SQLException sql){
            System.out.println("error: " + sql.getMessage());
        }
        return aux;
    }
    
}
