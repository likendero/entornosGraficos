/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import modelo.BaseProductos;
import modelo.Productos;
import vista.ProductosDialog;

/**
 *  
 * @author Javier Gonzalez Rives
 */
public class ControlProductos implements ActionListener, KeyListener {
    private BaseProductos base;
    private ProductosDialog dia;

    public ControlProductos(BaseProductos base, ProductosDialog dia) {
        this.base = base;
        this.dia = dia;
        try{
            // annadir listener
            dia.getBtActualizar().addActionListener(this);
            dia.getBtBuscar().addActionListener(this);
            dia.getBtInsertar().addActionListener(this);
            dia.getBtLimpiar().addActionListener(this);
            dia.getTbBorrar().addActionListener(this);
            // annadir listener teclado
            dia.getTxDescripcion().addKeyListener(this);
            dia.getTxDescuento().addKeyListener(this);
            dia.getTxNombre().addKeyListener(this);
            dia.getTxPrecio().addKeyListener(this);
            dia.getTxReferencia().addKeyListener(this);
        }catch(NullPointerException nu){
            System.out.println(nu.getMessage());
        }
    }
    // metodos de recuperacion /////////////////////////////////////////
    /**
     * metodo crea un producto a partir de los datos introducidos
     * @return el Producto creado
     */
    private Productos crearProducto(){
        String referencia = dia.getTxReferencia().getText().trim();
        String nombre = dia.getTxNombre().getText().trim();
        String descripcion = dia.getTxDescripcion().getText().trim();
        double precio = 0;
        double descuento = 0;
        // en el caso que la referencia sea vacia se pasa a nulo
        // control de la referencia
        if(referencia.isEmpty()){
            referencia = null;
        }
        // paso a numero de precio y porcentaje
        try{
            precio = Double.parseDouble(dia.getTxPrecio().getText().trim());
        }catch(NumberFormatException num){
            precio = -1;
        }
        try{
            descuento = Double.parseDouble(dia.getTxPrecio().getText().trim());
        }catch(NumberFormatException num){
            precio = -1;
        }
        // creacion del producto
        Productos pro = new Productos(referencia, nombre, descripcion, precio, descuento);
        return pro;
    }
    /**
     * metodo que comprueba todos los campos introducidos
     * @return false si ha ocurrido un fallo true en caso contrario
     */
    private boolean controlarCampos(Productos pro){
        String errores = "";
        // comprobacion de la referencia
        if(pro.getReferencia() == null){
            errores += "- Es obligatorio poner una referencia\n";
        }
        // comprobacion del precio
        if(pro.getPrecio() < 0){
            errores += "- Es obligatorio introducir un precio mayor que o igual a 0\n";
        }
        if(pro.getDescuento() < 0){
            errores += "- Es obligatorio introducir un descuento mayor que o igual a 0\n";
        }
        // en el caso que exista mensaje de errore se lanza y se devuelve false
        if(errores.isEmpty()){
            return true;
        }
        return false;
    }
    /**
     * metodo que actualiza los campos de la vista segun la busqueda 
     * realizada
     */
    private void busqueda(Productos pro){
        if(pro == null) return;
        // cambio del nombre
        if(pro.getNombre() != null){
            dia.getTxNombre().setText(pro.getNombre());
        }else{
            dia.getTxNombre().setText("");
        }
        // caso de la descripciom    
         if(pro.getDescripcion()!= null){
            dia.getTxDescripcion().setText(pro.getDescripcion());
        }else{
            dia.getTxDescripcion().setText("");
        }
        // precio y porcentaje
        dia.getTxPrecio().setText(""+pro.getPrecio());
        dia.getTxDescuento().setText(""+pro.getDescuento());
        
    }
    // ACCIONES ///////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        Productos productos = crearProducto();
        // control del producto
        if(productos != null){
            // caso de insertar un registro
            if(e.getSource() == dia.getBtInsertar()){
                if(controlarCampos(productos)){
                    // se controla si la inserccion es realizada
                    if(base.insertarProductoss(productos)){
                        JOptionPane.showMessageDialog(dia, "inserccion realizada correctamente", "inserccion",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha realizado la inserccion", "inserccion",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de actualizacion
            if(e.getSource() == dia.getBtActualizar()){
                if(controlarCampos(productos)){
                    // se controla si la inserccion es realizada
                    if(base.actualizarProductos(productos)){
                        JOptionPane.showMessageDialog(dia, "actualizacion realizada correctamente", "actualizacion",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha podido realizar la actualizacion", "actualizacion",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de borrado
            if(e.getSource() == dia.getTbBorrar()){
                if(!productos.getDescripcion().isEmpty()){
                    // se controla si la inserccion es realizada
                    if(base.BorrarProductos(productos)){
                        JOptionPane.showMessageDialog(dia, "Borrado correcto", "Borrado",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha realizado ningun borrado", "borrado",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de busqueda
            if(e.getSource() == dia.getBtBuscar()){
                if(!productos.getReferencia().isEmpty()){
                    // se controla si la inserccion es realizada
                    if((productos = base.buscarProductos(productos)) != null){
                        busqueda(productos);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha realizado ningun borrado", "borrado",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        
    }
    // control de la introduccion en los campos de texto
    @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        // caso de referencia
        if(e.getSource() == dia.getTxReferencia()){
            if(dia.getTxReferencia().getText().length() >= 6 && caracter != '\b'){
                e.consume();
            }
        }
        // caso del nombre
        if(e.getSource() == dia.getTxNombre()){
            if(dia.getTxNombre().getText().length() >= 20 && caracter != '\b'){
                e.consume();
            }
        }
        // caso de la descripcion
        if(e.getSource() == dia.getTxDescripcion()){
            if(dia.getTxDescripcion().getText().length() >= 1000 && caracter != '\b'){
                e.consume();
            }
        }
        // caso de la introduccion numerica
        if(e.getSource() == dia.getTxPrecio() || e.getSource() == dia.getTxDescuento()){
            if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/) &&
          (caracter != '.'))
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
