/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentodosraquetas;

import java.awt.Color;



/**
 *
 * @author Javier Gonzalez Rives
 */
public class PelotaDosRaquetas extends Pelota {
    private boolean estatus; // el status controla si se pierde
    private boolean izquierdo;
    private Raqueta raqueta1, raqueta2;
    
    /**
     * metodo constructor de la pelota con dos raquetas
     * @param ancho
     * @param alto
     * @param x
     * @param y
     * @param vx
     * @param vy
     * @param color
     * @param juego 
     */
    public PelotaDosRaquetas(int ancho, int alto, int x, int y, int vx, int vy, Color color, Juego juego) {
        super(ancho, alto, x, y, vx, vy, color, juego);
        estatus = true;
        izquierdo = true;
    }
    //// METODOS //////////////////////////////////
    
    @Override
    public void rebote() {
        // variables para el rebote
        int y = this.getY();
        int x = this.getX();
        int ancho = this.getJuego().getWidth2();
        int alto = this.getJuego().getHeight2();
        int vx = this.getVx();
        int vy = this.getVy();
        // comprobaciones del rebote
        // choques verticales
        if((y + vy) > alto - this.getAlto() || (y + vy) < 0 ){
            setVy(-vy);
        }
        // caso de las raquetas
        if(
                this.colision(raqueta1.rectangulo()) ||
                this.colision(raqueta2.rectangulo())
                ){
            setVx(-vx);
        }
        // caso que se salga por los lados
        if((x + vx) > ancho - this.getAncho() || (x + vx) < 0){
            estatus = false;
            izquierdo = ancho/2 < this.getX();
            this.setX(ancho/2);
            this.setY(alto/2);
            this.setVx(-vx);
        }
    }
    // GETTERS SETTERS ////////////////////////////////////////////////////////

    public boolean isEstatus() {
        return estatus;
    }
    
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Raqueta getRaqueta1() {
        return raqueta1;
    }

    public void setRaqueta1(Raqueta raqueta1) {
        this.raqueta1 = raqueta1;
    }

    public Raqueta getRaqueta2() {
        return raqueta2;
    }

    public void setRaqueta2(Raqueta raqueta2) {
        this.raqueta2 = raqueta2;
    }

    public boolean isIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(boolean izquierdo) {
        this.izquierdo = izquierdo;
    }
    
}
