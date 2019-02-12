/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import model.Conexion;
import view.Ventana;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class AccionesBaseDatos {
    private static Conexion conexion = new Conexion();
    /**
     * metodo que realiza las actualizaciones
     */
    public static void actualizar(int id,String nombre,int calibre,double peso){
        Connection con = conexion.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("update patatas set "
                    + " nombre_variedad = ?, calibre = ?, kg = ? where id = ?");
            stat.setString(1, nombre);
            stat.setInt(2, calibre);
            stat.setDouble(3, peso);
            stat.setInt(4, id);
            stat.execute();
            con.close();
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la actualzacion");
        }
        
    }
    /**
     * metodo que realiza las inserciones
     */
    public static void insertar(int id,String nombre,int calibre,double peso){
        Connection con = conexion.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("insert into patatas values(?,?,?,?)");
            stat.setString(2, nombre);
            stat.setInt(3, calibre);
            stat.setDouble(4, peso);
            // en el caso que no se introduzca ningun elemnto se annade como auto incrementable
            // para ello en esa posicion se situa un null
            if(id != 0)
                stat.setInt(1, id);
            else
                stat.setNull(1, Types.NULL);
            stat.execute();
            con.close();
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la inserccion");
        }
    }
    /**
     * metodo que realiza los borrados
     * @param id
     * @param nombre
     * @param calibre
     * @param peso 
     */
    public static void borrar(int id){
        Connection con = conexion.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("delete from patatas where id = ?");
            stat.setInt(1, id);
            stat.execute();
            con.close();
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la inserccion");
        }
    }
    /**
     * metodo que realzia las consultas sobre la base de datos
     */
    public static void buscar(Ventana ven,int id){
        Connection con = conexion.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("select from patatas where id = ?");
            stat.setInt(1, id);
            ResultSet resultado = stat.executeQuery();
            // en el caso que halla algun resultado
            if(resultado.next()){
                //valores
                String variedad = resultado.getString(2);
                int calibre = resultado.getInt(3);
                double kg = resultado.getDouble(4);
                // paso a la interfaz
                ven.getTxVariedad().setText(variedad);
                ven.getTxCalibre().setText("" + calibre);
                ven.getTxPeso().setText("" + kg);
            }
            con.close();
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "ha sucedido un error durante la consulta");
        }
    }
}
