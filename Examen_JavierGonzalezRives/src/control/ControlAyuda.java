/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import vista.AboutDialiog;
import vista.VehiculosDialog;
import vista.VentanaPrincipal;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class ControlAyuda {
    private VentanaPrincipal prin;
    private VehiculosDialog vh;
    private AboutDialiog ad;

    public ControlAyuda(VentanaPrincipal prin, VehiculosDialog vh, AboutDialiog ad) {
        this.prin = prin;
        this.vh = vh;
        this.ad = ad;
    }
    /**
     * metodo que annade la ayuda a las ventana
     */
    private void annadirAyuda()throws HelpSetException, MalformedURLException{
        // Carga el fichero de ayuda
        File fichero = new File("../help/help_set.hs");
        URL hsURL = fichero.toURI().toURL();
        
        // Crea el HelpSet
        HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
        HelpBroker hb = helpset.createHelpBroker();
        // Ayuda al hacer click en el JMenuItem itemAyuda.
        hb.enableHelpOnButton(prin.getMiAyuda(), "ventanap", helpset);
        
        // Ayuda al pulsar F1 sobre la ventana principal
        
        hb.enableHelpKey(prin.getContentPane(), "ventanap", helpset);
        

        
    }
    
}
