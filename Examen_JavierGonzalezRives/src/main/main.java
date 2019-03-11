/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



import control.ControlInformes;
import control.ControlPrincipal;
import control.ControlVehiculo;
import javax.swing.JFrame;
import modelo.BaseCoches;
import modelo.Conexion;
import vista.AboutDialiog;
import vista.InformesDialog;
import vista.VehiculosDialog;
import vista.VentanaPrincipal;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            VehiculosDialog veiDi = new VehiculosDialog();
            VentanaPrincipal ven = new VentanaPrincipal();
            AboutDialiog abDia = new AboutDialiog(ven, true);
            InformesDialog inf = new InformesDialog(ven, true);
            // opciones de la ventana
            ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ven.setVisible(true);
            BaseCoches cochBas = new BaseCoches();
            
            Conexion con = new Conexion();
            ControlPrincipal cp = new ControlPrincipal(ven, veiDi,inf, abDia);
            ControlVehiculo cpv = new ControlVehiculo(veiDi, cochBas);
            ControlInformes ci = new ControlInformes(inf, con);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("error " + ex.getMessage());
        }
    }
}
