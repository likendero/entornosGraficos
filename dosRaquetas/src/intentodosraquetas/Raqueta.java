/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentodosraquetas;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author jabi el wapo
 */
public class Raqueta implements KeyListener {
    private int x,y,vy;
    private int ancho,alto;
    private Color color;
    private Juego juego;
    
    private int arriba ;
    private int abajo ;
    public Raqueta(int x, int y,int ancho,int alto,Juego juego, Color color){
        super();
        this.x = x;
        this.y = y;
        this.vy = 0;
        this.ancho = ancho;
        this.alto = alto;
        this.juego = juego;
        this.color = color;
    }
    // METODOS //////////////////////////////////////////////////////////////
    /**
     * metodo que dibuja en pantalla una raqueta
     * para jugar
     * @param g2d 
     */
    public void dibujar(Graphics2D g2d){
        g2d.setColor(color);
        
        g2d.fillRect(x, y, ancho, alto);
    }
    /**
     * metodo que genera un rectangulo con las dimensiones 
     * de la raqueta
     * @return 
     */
    public Rectangle rectangulo (){
        return new Rectangle(x, y, ancho, alto);
    }
    /**
     *  metodo que realiza las acciones de moviiento de la 
     * raqueta
     */
    public void movimiento(){
        // condicion para que la raqueta no salga de pantalla
        if((y + vy) < juego.getHeight2() - alto || (y + vy) > 0){
            y += vy;
        }
    }
    
    // EVENTOS ///////////////////////////////////////////////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // accion hacia arriba
        if(e.getKeyCode() == arriba){
            vy = -1;
        }
        // accion hacia abajo
        if(e.getKeyCode() == abajo){
            vy = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        vy = 0;
    }
    // GETTERS SETTERS /////////////////////////////////////////////////////////

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getArriba() {
        return arriba;
    }

    public void setArriba(int arriba) {
        this.arriba = arriba;
    }

    public int getAbajo() {
        return abajo;
    }

    public void setAbajo(int abajo) {
        this.abajo = abajo;
    }
    
}
