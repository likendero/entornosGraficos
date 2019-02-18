/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author Javier Gonzalez Rives
 */
public class Vehiculo {
    // variables
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    private Date fechaRevision;
    // contructores //////////////
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo, int kilometros, Date fechaRevision) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.fechaRevision = fechaRevision;
    }
    
    // getters y setters /////////////

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }
    
    
}
