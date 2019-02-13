/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.BasePatata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Patata;

import view.Ventana;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Acciones implements ActionListener,WindowListener, KeyListener {
    private Ventana ven;
    private BasePatata base;
    /**
     * metodo constructor
     */
    public Acciones(Ventana ven,BasePatata bp){
        this.ven = ven;
        this.base = bp;
        
        // annadir oyentes
        // ventana
        this.ven.addWindowListener(this);
        // botones
        ven.getBtActulizar().addActionListener(this);
        ven.getBtBorrar().addActionListener(this);
        ven.getBtBuscar().addActionListener(this);
        ven.getBtInsertar().addActionListener(this);
        ven.getBtLimpiar().addActionListener(this);
        // cuadros de texto
        ven.getTxId().addKeyListener(this);
        ven.getTxPeso().addKeyListener(this);
        ven.getTxCalibre().addKeyListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Patata patata = capturarCampos();
            
            // caso de insertar datos
            if(e.getSource() == ven.getBtInsertar()){
                // se comprueba que esten todos los campos correctos
                if(comprobarCampos(patata)){
                    // se cumpruba que la insserccion termina
                    if(base.insertar(patata)){
                        JOptionPane.showMessageDialog(ven, "inserccion realizada");
                    }
                    
                }
            }
            // caso de actualizar
            if(e.getSource() == ven.getBtInsertar()){
                // se comprueba que esten todos los campos correctos
                if(comprobarCampos(patata)){
                    if(base.actualizar(patata)){
                        JOptionPane.showMessageDialog(ven, "inserccion realizada");
                    }
                    
                }
            }
            // caso de borrar
            if(e.getSource() == ven.getBtBorrar()){
                // comprobacion del id, debe ser mayor a 0
                if(patata.getId() > 0){
                    base.borrar(patata);
                }else{
                     JOptionPane.showMessageDialog(ven, "para borrados el id tiene que ser mayor que 0","ha sucedido un error",JOptionPane.ERROR_MESSAGE);
                }
            }
            // caso de buscar
            if(e.getSource() == ven.getBtBuscar()){
                // comprobacion del id, debe ser mayor a 0
                if(patata.getId() > 0){
                    base.buscar(patata);
                }else{
                     JOptionPane.showMessageDialog(ven, "para busquedas el id tiene que ser mayor que 0","ha sucedido un error",JOptionPane.ERROR_MESSAGE);
                }
            }
            if(e.getSource() == ven.getBtLimpiar()){
                limpiarCampos();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /**
     * metodo que limpia los campos
     */
    private void limpiarCampos(){
        ven.getTxCalibre().setText("");
        ven.getTxId().setText("");
        ven.getTxVariedad().setText("");
        ven.getTxPeso().setText("");
        
    }
    /**
     * metodo que analiza los campos y en el caso que estos sean correctos
     * devuelve una patata sino devuelve un nulo y lanza un mensaje de error
     */
    private Patata capturarCampos(){
        String variedadAux = ven.getTxVariedad().getText().trim();
        String calibreAux = ven.getTxCalibre().getText().trim();
        String pesoAux = ven.getTxPeso().getText().trim();
        int id;
        try{
            id = Integer.parseInt(ven.getTxId().getText().trim());
        }catch(NumberFormatException num){
            id = 0;
        }
        String variedad = null;
        int calibre = 0;
        double peso = 0;
        if(!variedadAux.isEmpty()){
            variedad = variedadAux;
        }
        if(!calibreAux.isEmpty()){
            try{
                calibre = Integer.parseInt(calibreAux);
            }catch(NumberFormatException num){
                calibre = -1;
            }
        if(!pesoAux.isEmpty()){
            try{
                peso = Double.parseDouble(pesoAux);
            }catch(NumberFormatException num){
                peso = -1;
            }
        }
        }
        Patata patata = new Patata(id, variedad, calibre, peso);
        return patata;
    }
    /**
     * metodo que comprueba los campos en el caso que se deban utilizar todos
     * @return true si ha sido exitoso falso caso contrario
     */
    private boolean comprobarCampos(Patata patata){
        String errores = "";
        // control del id
        if(patata.getId() < 0){
            errores += "-El id tiene que ser un numero mayor a 0\n";
        }
        // control variedad
        if(patata.getNombre() == null){
            errores += "-Es necesario annadir una variedad\n";
        }
        // control del calibre
        if(patata.getClaibre() <= 0){
            errores += "-El calibre tiene que ser un numero mayor a 0\n";
        }
        // control del peso
        if(patata.getPeso() <= 0){
            errores += "-El peso tiene que ser un numero decimal mayor a 0\n";
        }
        // caso que no halla habido errores
        if(errores.isEmpty()){
            return true;
        }
        JOptionPane.showMessageDialog(ven, errores,"ha habido un problema",JOptionPane.ERROR_MESSAGE);
        System.out.println(patata.toString());
        return false;
    }
    // vnetnana/////////////////////////////////////////////////////
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        try{
            base.getConnection().close();
        }catch(SQLException sql){}
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    // teclado ///////////////////////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        // cuadro introduccion de tecla
        if(e.getSource() == ven.getTxId() || e.getSource() == ven.getTxCalibre()){
            if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != '\b' ))
               {
                  e.consume();  // ignorar el evento de teclado
               }
        }
        // cso de peso
        if(e.getSource() == ven.getTxPeso()){
            if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != '\b'&&
                (caracter != '.') ))
               {
                  e.consume();  // ignorar el evento de teclado
               }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
