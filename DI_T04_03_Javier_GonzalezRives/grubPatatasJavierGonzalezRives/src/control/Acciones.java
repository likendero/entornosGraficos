/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.Ventana;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Acciones implements ActionListener {
    private Ventana ven;
    
    /**
     * metodo constructor
     */
    public Acciones(Ventana ven){
        this.ven = ven;
        // annadir oyentes
        ven.getBtActulizar().addActionListener(this);
        ven.getBtBorrar().addActionListener(this);
        ven.getBtBuscar().addActionListener(this);
        ven.getBtInsertar().addActionListener(this);
        ven.getBtLimpiar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int id = -1;
            if(ven.getTxId().getText().isEmpty())
                id = 0;
            else
                id = Integer.parseInt(ven.getTxId().getText());
            String variedad = ven.getTxVariedad().getText();
            int calibre = 0;
            double peso = 0;
            if(!ven.getTxCalibre().getText().isEmpty() && !ven.getTxPeso().getText().isEmpty()){    
                calibre = Integer.parseInt(ven.getTxCalibre().getText());
                peso = Double.parseDouble(ven.getTxPeso().getText());
            }
            // caso insertar un valor
            if(e.getSource() ==  ven.getBtInsertar()){
                if(calibre > 1 && peso > 1 && !variedad.isEmpty())
                    AccionesBaseDatos.insertar(id, variedad, calibre, peso);
                else
                    JOptionPane.showMessageDialog(ven, "para realizar una inserccion completa todos los campos");

                    
            }
            if(e.getSource() == ven.getBtActulizar()){
                // control que halla id
                if(id < 1){
                    JOptionPane.showMessageDialog(ven, "esta accion requere de especificar un id");

                }else{
                    AccionesBaseDatos.actualizar(id, variedad, calibre, peso);
                }
                
            }
            if(e.getSource() == ven.getBtBorrar()){
                // control que halla id
                if(id < 1){
                    JOptionPane.showMessageDialog(ven, "esta accion requere de especificar un id");
                }else{
                    AccionesBaseDatos.borrar(id);
                    limpiarCampos();
                }
            }
            if(e.getSource() == ven.getBtBuscar()){
                // control que halla id
                if(id < 1){
                    JOptionPane.showMessageDialog(ven, "esta accion requere de especificar un id");
                }else{
                    AccionesBaseDatos.buscar(ven, id);
                }
            }
            
        }catch(NumberFormatException num){
            JOptionPane.showMessageDialog(ven, "el id, calibre y peso solo aceptan numeros");
        }
        if(e.getSource() == ven.getBtLimpiar())
            limpiarCampos();
    }
    private void limpiarCampos(){
        ven.getTxCalibre().setText("");
        ven.getTxId().setText("");
        ven.getTxVariedad().setText("");
        ven.getTxPeso().setText("");
        
    }
    
}
