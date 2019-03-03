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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.BaseCoches;
import modelo.Productos;
import modelo.Vehiculo;
import vista.VehiculosDialog;

/**
 *  metodo que controla las acciones para la ventana vehiculos
 * @author Javier Gonzalez Rives
 */
public class ControlVehiculo implements ActionListener, KeyListener  {
    private VehiculosDialog dia;
    private BaseCoches base;

    public ControlVehiculo(VehiculosDialog dia, BaseCoches base) {
        this.dia = dia;
        this.base = base;
        
        // annadir acciones
        dia.getBtActualizar().addActionListener(this);
            dia.getBtBuscar().addActionListener(this);
            dia.getBtInsertar().addActionListener(this);
            dia.getBtLimipar().addActionListener(this);
            dia.getBtBorrar().addActionListener(this);
        // annadir teclado
        dia.getTxMatricula().addKeyListener(this);
        dia.getTxMarca().addKeyListener(this);
        dia.getTxModelo().addActionListener(this);
        dia.getTxKilometros().addKeyListener(this);
    }
    
    // metodos de recuperacion /////////////////////////////////////////
    /**
     * metodo crea un producto a partir de los datos introducidos
     * @return el Producto creado
     */
    private Vehiculo crearProducto(){
        String matricula = dia.getTxMatricula().getText().trim();
        String marca = dia.getTxMarca().getText().trim();
        String modelo = dia.getTxModelo().getText().trim();
        int kilometros = 0;
        Date fecha = null;
        // en el caso que la matricula sea vacia se pasa a nulo
        // control de la matricula
        if(matricula.isEmpty()){
            matricula = null;
        }
        // paso a numero de kilometros y porcentaje
        try{
            kilometros = Integer.parseInt(dia.getTxKilometros().getText().trim());
        }catch(NumberFormatException num){
            kilometros = -1;
        }
        try{
            fecha = (Date)dia.getSpFecha().getValue();
        }catch(NumberFormatException num){
            fecha = new Date();
        }
        
        // creacion del Vehiculo
        Vehiculo ve = new Vehiculo( matricula,marca, modelo, kilometros, fecha);
        return ve;
    }
    /**
     * metodo que transforma la fecha desde la vista
     * @param fecha
     * @return 
     */
    private Date fechaFormat(String fecha){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm");
        Date aux = null;
        try{
            aux = format.parse(fecha);
        }catch(ParseException ex){
            System.out.println("error " + ex.getMessage()) ;
        }
        return aux;
    }
    /**
     * metodo que pasa la fecha al formato del sp
     * @return 
     */
    private String fechaToString(Date fecha){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm");
        String aux = "";
        try{
            aux = format.format(fecha);
        }catch(Exception ex){
            System.out.println("error " + ex.getMessage()) ;
        }
        return aux;
    }
    /**
     * metodo que comprueba todos los campos introducidos
     * @return false si ha ocurrido un fallo true en caso contrario
     */
    private boolean controlarCampos(Vehiculo ve){
        String errores = "";
        // comprobacion de la matricula
        if(ve.getMatricula()== null){
            errores += "- Es obligatorio poner una matricula\n";
        }
        // comprobacion del kilometros
        if(ve.getKilometros()< 0){
            errores += "- Es obligatorio introducir numero kilometros mayor que o igual a 0\n";
        }
        
        // en el caso que exista mensaje de errore se lanza y se devuelve false
        if(errores.isEmpty()){
            return true;
            
        }
        JOptionPane.showMessageDialog(dia, errores,"ha sucedido un problema",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    /**
     * metodo que limpia todos los campos
     */
    private void limpiar(){
        dia.getTxKilometros().setText("");
        dia.getTxMarca().setText("");
        dia.getTxMatricula().setText("");
        dia.getSpFecha().setValue(new Date());
        dia.getTxModelo().setText("");
    }
    /**
     * metodo que actualiza los campos de la vista segun la busqueda 
     * realizada
     */
    private void busqueda(Vehiculo pro){
        if(pro == null) return;
        // cambio del nombre
        if(pro.getMarca()!= null){
            dia.getTxMarca().setText(pro.getMarca());
        }else{
            dia.getTxMarca().setText("");
        }
        // caso de la descripciom    
         if(pro.getModelo()!= null){
            dia.getTxModelo().setText(pro.getModelo());
        }else{
            dia.getTxModelo().setText("");
        }
        // kilometros y porcentaje
        dia.getTxKilometros().setText(""+pro.getKilometros());
        dia.getSpFecha().setValue((Date)pro.getFechaRevision());
        
    }
    // ACCIONES ///////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        Vehiculo vehiculo = crearProducto();
        // control del producto
        if(vehiculo != null){
            // caso de insertar un registro
            if(e.getSource() == dia.getBtInsertar()){
                if(controlarCampos(vehiculo)){
                    // se controla si la inserccion es realizada
                    if(base.insertarCoche(vehiculo)){
                        JOptionPane.showMessageDialog(dia, "inserccion realizada correctamente", "inserccion",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha realizado la inserccion", "inserccion",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de actualizacion
            if(e.getSource() == dia.getBtActualizar()){
                if(controlarCampos(vehiculo)){
                    // se controla si la inserccion es realizada
                    if(base.actualizarCoche(vehiculo)){
                        JOptionPane.showMessageDialog(dia, "actualizacion realizada correctamente", "actualizacion",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha podido realizar la actualizacion", "actualizacion",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de borrado
            if(e.getSource() == dia.getBtBorrar()){
                if(!vehiculo.getMatricula().isEmpty()){
                    // se controla si la inserccion es realizada
                    if(base.BorrarCoche(vehiculo)){
                        JOptionPane.showMessageDialog(dia, "Borrado correcto", "Borrado",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha realizado ningun borrado", "borrado",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            // caso de busqueda
            if(e.getSource() == dia.getBtBuscar()){
                if(!vehiculo.getMatricula().isEmpty()){
                    // se controla si la inserccion es realizada
                    if((vehiculo = base.buscarCoche(vehiculo)) != null){
                        busqueda(vehiculo);
                    }else{
                        JOptionPane.showMessageDialog(dia, "no se ha encontrado", "busqueda",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
             // caso de boton limpiar
            if(e.getSource() == dia.getBtLimipar()){
                limpiar();
            }
        }
        
        
    }
    // control de la introduccion en los campos de texto
    @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        // caso de matricula
        if(e.getSource() == dia.getTxMatricula()){
            if(dia.getTxMatricula().getText().length() >= 7 && caracter != '\b'){
                e.consume();
            }
        }
        // caso del nombre
        if(e.getSource() == dia.getTxMarca()){
            if(dia.getTxMarca().getText().length() >= 20 && caracter != '\b'){
                e.consume();
            }
        }
        // caso de la modelo
        if(e.getSource() == dia.getTxModelo()){
            if(dia.getTxModelo().getText().length() >= 20 && caracter != '\b'){
                e.consume();
            }
        }
        // caso de la introduccion numerica
        if( e.getSource() == dia.getTxKilometros()){
            if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/) 
                    || (dia.getTxKilometros().getText().length() >= 8))
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
