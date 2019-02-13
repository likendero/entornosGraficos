/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;


/**
 *
 * @author Javier Gonzalez Rives
 */
public class BasePatata extends Conexion {
    
    public BasePatata()throws SQLException {
        super();
        
    }
    
    /**
     * metodo que realiza las actualizaciones
     */
    public boolean actualizar(Patata patata){
        
        int id = patata.getId();
        String nombre = patata.getNombre();
        int calibre = patata.getClaibre();
        double peso = patata.getPeso();
        try{
            Connection con = this.getConnection();
            PreparedStatement stat = con.prepareStatement("update patatas set "
                    + " nombre_variedad = ?, calibre = ?, kg = ? where id = ?");
            stat.setString(1, nombre);
            stat.setInt(2, calibre);
            stat.setDouble(3, peso);
            stat.setInt(4, id);
            stat.execute();
            con.close();
            return true;
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la actualzacion");
        }
        return false;
    }
    /**
     * metodo que realiza las inserciones
     */
    public boolean insertar(Patata patata){
        
        int id = patata.getId();
        String nombre = patata.getNombre();
        int calibre = patata.getClaibre();
        double peso = patata.getPeso();
        try{
            Connection con = this.getConnection();
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
            return true;
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la inserccion");
        }
        return false;
    }
    /**
     * metodo que realiza los borrados
     * @param id
     * @param nombre
     * @param calibre
     * @param peso 
     */
    public void borrar(Patata patata){
        
        int id = patata.getId();
        
        try{
            Connection con = this.getConnection();
            PreparedStatement stat = con.prepareStatement("delete from patatas where id = ?");
            stat.setInt(1, id);
            stat.execute();
            
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "no se ha podido realizar la inserccion");
        }
    }
    /**
     * metodo que realzia las consultas sobre la base de datos
     */
    public Patata buscar(Patata patata){
        
        int id = patata.getId();
        
        try{
            Connection con = this.getConnection();
            PreparedStatement stat = con.prepareStatement("select from patatas where id = ?");
            stat.setInt(1, id);
            ResultSet resultado = stat.executeQuery();
            // en el caso que halla algun resultado
            if(resultado.next()){
                //valores
                String variedad = resultado.getString(2);
                int calibre = resultado.getInt(3);
                double kg = resultado.getDouble(4);
                // paso a la patata 
                Patata patata2 = new Patata(id,variedad,calibre,kg);
            }
            con.close();
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "ha sucedido un error durante la consulta");
        }
        return patata;
    }
}
