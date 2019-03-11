/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.AboutDialiog;
import vista.InformesDialog;
import vista.VehiculosDialog;
import vista.VentanaPrincipal;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class ControlPrincipal implements ActionListener {
    private VentanaPrincipal ven;
    private VehiculosDialog veiDia;
    private InformesDialog inf;
    private AboutDialiog abDia;
    /**
     * contructor principal
     * 
     */
    public ControlPrincipal(VentanaPrincipal ven, VehiculosDialog veiDi,InformesDialog inf, AboutDialiog abDia) {
        this.ven = ven;
        this.veiDia = veiDi;
        this.inf = inf;
        this.abDia = abDia;
        // acciones
        
        ven.getMiVehiculos().addActionListener(this);
        ven.getMiAcerca().addActionListener(this);
        ven.getMiInformes().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        // caso de 
        if(e.getSource() == ven.getMiVehiculos()){
            veiDia.setVisible(true);
        }
        if(e.getSource() == ven.getMiAcerca()){
            abDia.setVisible(true);
        }
        if(e.getSource() == ven.getMiInformes()){
            inf.setVisible(true);
        }
    }
    
    
}
