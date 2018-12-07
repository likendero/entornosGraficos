/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.juego;

import com.sun.prism.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Raqueta {
    private int x,y,dx;
    private final int ANCHO = 60, ALTO = 20;
    private Juego juego;
    /**
     * Raqueta
     */
    public Raqueta(Juego juego){
        super();
        this.juego = juego;
        // definicion de desplazamiento
        this.dx = 1;
        // definicion de la posicion (inicial)
        this.x = (juego.getWIDTH2()/2)-(ANCHO/2);
        // definicion de la altura
        y = juego.getHEIGHT2()-30;
    }
    /**
     * metodo que dibuja la raqueta
     */
    public void dibujarRaqueta(Graphics2D g2d){
        // cambio de color
        g2d.setColor(new Color(255,196,85));
        // dibujar rectangulo
        g2d.drawRect(x, y, ANCHO, ALTO);
    }
    /**
     * metodo que mueve hacia la derecha la raqueta
     */
    public void moverDerecha(){
        // control de la posicion
        if(x + dx <= juego.getWIDTH2()-ANCHO){
            x += dx;
        }
    }
    /**
     * metodo que mueve hacia la izquierda la raqueta
     */
    public void moverIzquierda(){
        // control de la posicion
        if(x - dx <= 0 + ANCHO){
            x += dx;
        }
        
    }
}
