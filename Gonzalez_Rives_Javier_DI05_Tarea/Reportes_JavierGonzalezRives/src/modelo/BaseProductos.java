/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class BaseProductos {
    private final String INSERT = "insert into Productos values(?,?,?,?,?) ";
    private final String UPDATE = "update  Productos set nombre = ?, descripcion = ?, precio = ? , descuento = ?  where referencia = ? ";
    private final String DELETE = "delete from Productos where referencia = ?";
    private final String SELECT = "select * from Productos where referencia = ?";
    private final Conexion conexion;
    /**
     * cosntructor que crea objeto conexion para realizar las conexiones
     */
    public BaseProductos() {
        this.conexion = new Conexion();
    }
    /**
     * metodo que realzia la inserccion de un producto
     * @return true si la operacion transcurre de forma normal false caso contrario
     * @param producto producto a insertar
     */
    public boolean insertarProductoss(Productos producto){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(INSERT);
            // introduccion de los valores en el statement
            pre.setString(1, producto.getReferencia().toUpperCase());
            pre.setString(2, producto.getNombre().toUpperCase());
            pre.setString(3, producto.getDescripcion());
            pre.setDouble(4, producto.getPrecio());
            
            pre.setDouble(5, producto.getDescuento());
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
     * metodo que realzia la inserccion de un producto
     * @return true si la operacion transcurre de forma normal false caso contrario
     * @param producto producto a insertar
     */
    public boolean actualizarProductos(Productos producto){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(UPDATE);
            // introduccion de los valores en el statement
            pre.setString(5, producto.getReferencia().toUpperCase());
            pre.setString(1, producto.getNombre().toUpperCase());
            pre.setString(2, producto.getDescripcion());
            pre.setDouble(3, producto.getPrecio());
            
            pre.setDouble(4, producto.getDescuento());
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
     * metodo que borra los productos segun su referencia
     * @param producto
     * @return true si es correcto false en caso contrario
     */
    public boolean BorrarProductos(Productos producto){
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(DELETE);
            // introduccion de los valores en el statement
            pre.setString(1, producto.getReferencia().toUpperCase());
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
    public Productos buscarProductos(Productos producto){
        Productos aux = null;
        try{
            Connection con = conexion.getConexion();
            PreparedStatement pre = con.prepareStatement(SELECT);
            // introduccion de los valores en el statement
            pre.setString(1, producto.getReferencia().toUpperCase());
            ResultSet res = pre.executeQuery();
            
            // comprovacion de la ejecucion :D
            if(res != null && res.next()){
                String nombre = res.getString("nombre");
                String descripcion = res.getString("descripcion");
                double precio = res.getDouble("precio");
                double descuento = res.getDouble("descuento");
                aux = new Productos(producto.getReferencia(), nombre, descripcion, precio, descuento);
            }
            System.out.println(aux.toString());
            con.close();
        }catch(SQLException sql){
            System.out.println("error: " + sql.getMessage());
        }
        return aux;
    }
}
