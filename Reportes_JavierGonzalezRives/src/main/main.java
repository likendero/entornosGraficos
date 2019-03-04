/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



import control.ControlInformes;
import control.ControlPrincipal;
import control.ControlProductos;
import control.ControlVehiculo;
import javax.swing.JFrame;
import modelo.BaseCoches;
import modelo.BaseProductos;
import modelo.Conexion;
import vista.AboutDialiog;
import vista.ProductosDialog;
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
            ProductosDialog proDi = new ProductosDialog();
            VehiculosDialog veiDi = new VehiculosDialog();
            VentanaPrincipal ven = new VentanaPrincipal();
            AboutDialiog abDia = new AboutDialiog(ven, true);
            // opciones de la ventana
            ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ven.setVisible(true);
            BaseCoches cochBas = new BaseCoches();
            BaseProductos proBas = new BaseProductos();
            Conexion con = new Conexion();
            ControlPrincipal cp = new ControlPrincipal(ven, veiDi, proDi,abDia);
            ControlProductos cpr= new ControlProductos(proBas,proDi);
            ControlVehiculo cpv = new ControlVehiculo(veiDi, cochBas);
            ControlInformes ci = new ControlInformes(ven, con);
        }catch(Exception ex){
            System.out.println("error " + ex.getMessage());
        }
    }
}
