/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.juego;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *  clase que define los parametros de la bola dentro 
 * del juego y aporta los parametros de accion y dibujado
 * @author Javier Gonzalez Rives
 */
public class Pelota {
    private Juego juego;
    private int x,y,dx,dy;
    private final int CUADRADO = 60;
    /**
     * metodo contructor de la pelota
     * @param juego en el que basa sus parametros
     * @param x posicion inicial de la pelota en x
     * @param y posicion inicial de la pelota en y
     */
    public Pelota(Juego juego,int x, int y){
        super();
        this.juego = juego;
        // definicion de la posicion
        this.x = x;
        this.y = y;
        // direccion de movimiento
        direccionAletatoria();
    }
    /**
     * metodo constructor de la pelota sin posicionamineto
     * @param juego objeto en que basa sus paramentros
     */
    public Pelota(Juego juego){
        super();
        this.juego = juego;
        // posicionamiento
        this.x = 0;
        this.y = 0;
        // direccion de movimiento
        direccionAletatoria();
    }
    /**
     * metodo que define de forma aleatora la direccion
     * a la que se mueve la bola
     */
    private void direccionAletatoria(){
        this.dy = (int)(Math.random()*(-1-1)+1);
        this.dx = (int)(Math.random()*(-1-1)+1);
    }
    /**
     * metodo que cambia la posicion de la vola y controla su posicion
     */
    public void movimiento(){
        // caso velocidad en el ejex
        if(x + dx < 0 || x + dx > juego.getWIDTH2()-60){
            // cambio de sentido horizontal
            dx = -dx;
        }
        // caso velocidad en el ejey
        if(y + dy < 0 || y + dy > juego.getHEIGHT2()-60){
            // cambio de sentido vertical
            dy = -dy;
        }
        // 
    }
    public void dibujarPelota(Graphics2D g2d){
        // color azul
        g2d.setColor(new Color(229, 2, 212));
        g2d.fillOval(x, y, CUADRADO, CUADRADO);
    }
}
