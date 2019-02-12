/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiqueta;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JLabel;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class EtiquetaCambiante5 extends JLabel implements Serializable, MouseListener {
    
        private Color color;

    @Override
    public void mouseClicked(MouseEvent e) {
        // creacion de un color aleatorio
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        this.setColor(new Color(r,g,b));
        // en el caso que exista un clikeo listener
        if(cli != null){
            cli.capturarClikeo(new ClikeoEvent(this));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
        /**
         * clase para el evento
         */
        public class ClikeoEvent extends java.util.EventObject{
            
            public ClikeoEvent(Object source) {
                super(source);
            }
        }
        // interfaz
        public interface ClikeoListener extends MouseListener{
            void capturarClikeo(ClikeoEvent evt);
        }
    public static final String PROP_COLOR = "color";
    private ClikeoListener cli;
    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        Color oldColor = this.color;
        this.color = color;
        super.setForeground(color);
        
    }

   

    
    public EtiquetaCambiante5() {
        this.setColor(Color.BLACK);
        this.addMouseListener(this);
    }

    public ClikeoListener getCli() {
        return cli;
    }

    public void setCli(ClikeoListener cli) {
        this.cli = cli;
    }
    
   public void addClikeoListener(ClikeoListener receptor)
    {
        this.cli = receptor;
    }

    public void removeClikeoListener(ClikeoListener cli)
    {
        this.cli=null;
    }
}
