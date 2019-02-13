/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Patata {
    // atributos
    private int id;
    private String nombre;
    private int claibre;
    private double peso;

    // constructores
    /**
     * constructor parametrizado
     * @param id
     * @param nombre
     * @param claibre
     * @param peso 
     */
    public Patata(int id, String nombre, int claibre, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.claibre = claibre;
        this.peso = peso;
    }
    
    /**
     * constructor de patatas por defecto
     */
    public Patata() {
    }
    // contstructor por defecto //////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClaibre() {
        return claibre;
    }

    public void setClaibre(int claibre) {
        this.claibre = claibre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Patata{" + "id=" + id + ", nombre=" + nombre + ", claibre=" + claibre + ", peso=" + peso + '}';
    }
    
     
}
