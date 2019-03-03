/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.AboutDialiog;
import vista.ProductosDialog;
import vista.VehiculosDialog;
import vista.VentanaPrincipal;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class ControlPrincipal implements ActionListener {
    private VentanaPrincipal ven;
    private VehiculosDialog veiDia;
    private ProductosDialog proDia;
    private AboutDialiog abDia;
    /**
     * contructor principal
     * 
     */
    public ControlPrincipal(VentanaPrincipal ven, VehiculosDialog veiDi, ProductosDialog dia, AboutDialiog abDia) {
        this.ven = ven;
        this.veiDia = veiDi;
        this.proDia = dia;
        this.abDia = abDia;
        // acciones
        ven.getMiProductos().addActionListener(this);
        ven.getMiVehiculos().addActionListener(this);
        ven.getMiAcerca().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // caso de productos
        if(e.getSource() == ven.getMiProductos()){
            proDia.setVisible(true);
        }
        // caso de vehiculos
        if(e.getSource() == ven.getMiVehiculos()){
            veiDia.setVisible(true);
        }
        if(e.getSource() == ven.getMiAcerca()){
            abDia.setVisible(true);
        }
    }
    
    
}
