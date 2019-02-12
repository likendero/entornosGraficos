/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentesejercicio2textarea;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class ComponenteDNI2 extends JTextField implements Serializable, ActionListener {
    private Map<Integer,Character> relacion;
    private char letra;
   
    public ComponenteDNI2() {
        this.addActionListener(this);
        crearMap();
        this.letra = 'A';
    }
    // METODOS DE ACCION ///////////////////////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        // transformacion
        try{
            if(getText().length() == 8){
                int numero = Integer.parseInt(this.getText());
                letra = relacion.get(numero%23);
            }else{
                JOptionPane.showMessageDialog(this,"escribe 8 cifras","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"solo se valen numeros","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    // METODOS ////////////////////////////////////////////////////////////////
    /**
     * metodo que introduce los valores dentro de un map
     */
    public void crearMap(){
        this.relacion = new HashMap<>();
        relacion.put(0,'T');
        relacion.put(1,'R');
        relacion.put(2,'W');
        relacion.put(3,'A');
        relacion.put(4,'G');
        relacion.put(5,'M');
        relacion.put(6,'Y');
        relacion.put(7,'F');
        relacion.put(8,'P');
        relacion.put(9,'D');
        relacion.put(10,'X');
        relacion.put(11,'B');
        relacion.put(12,'N');
        relacion.put(13,'J');
        relacion.put(14,'Z');
        relacion.put(15,'S');
        relacion.put(16,'Q');
        relacion.put(17,'V');
        relacion.put(18,'H');
        relacion.put(19,'L');
        relacion.put(20,'C');
        relacion.put(21,'K');
        relacion.put(22,'E');
    }
    // GETTERS SETTERS //////////////////////////////////////////////

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
