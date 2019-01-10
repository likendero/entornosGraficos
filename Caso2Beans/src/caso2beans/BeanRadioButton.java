/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2beans;

import java.awt.Color;
import java.beans.*;
import java.io.Serializable;
import javax.swing.JRadioButton;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class BeanRadioButton extends JRadioButton implements Serializable {
    private String texto;
    private Color color;
    private boolean habilitado;
    private boolean invisible;
    private boolean seleccionado;
    
    
    
    public BeanRadioButton() {
        texto = "item1";
        color = Color.BLUE;
        habilitado = true;
        invisible = false;
        seleccionado = false;
        // uso de getters muy cuestionable
        setTexto(texto);
        setColor(color);
        setHabilitado(habilitado);
        setInvisible(invisible);
        setSeleccionado(seleccionado);
    }
    // GETTERS SETTERS ////////////////////////////////////////////////////////
    public String getTexto() {
        return "el texto de la etiqueta es: " + texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.setText(texto);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.setForeground(color);
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
        this.setEnabled(habilitado);
        // mostrar por pantalla el estado
        if(habilitado){
            System.out.println("esta habilitado");
        }else{
            System.out.println("esta desabilitado");
        }
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
        this.setVisible(!invisible);
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
        this.setSelected(seleccionado);
    }
    
    
}
