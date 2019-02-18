/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Productos {
    
    private String referencia;
    private String nombre;
    private String descripcion;
    private double precio;
    private double descuento;
    // COSNTRUCTORES /////////////////////
    public Productos() {
    }

    public Productos(String referencia, String nombre, String descripcion, double precio, double descuento) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
    }
    // GETTERS SETTERS ////////////////////////

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Productos{" + "referencia=" + referencia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", descuento=" + descuento + '}';
    }
    
    
    
}
