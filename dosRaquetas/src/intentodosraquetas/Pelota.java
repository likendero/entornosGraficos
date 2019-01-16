package intentodosraquetas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author jabi el wapo
 */
public abstract class Pelota {
    private int alto;
    private int ancho;
    // v hace referencia a la velocidad
    private int vx,vy,x,y;
    private Color color;
    private Juego juego;
    
    /**
     * metodo constructor de la pelota
     * @param ancho
     * @param alto
     * @param x
     * @param y
     * @param vx
     * @param vy
     * @param juego
     */
    public Pelota(int ancho,int alto,int x,int y,int vx,int vy,Color color,Juego juego){
        super();
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.color = color;
        this.juego = juego;
    }
    
    /**
     * metodo que realiza el movimiento de la bola
     */
    public void movimiento(){
        rebote();
        this.x += this.vx;
        this.y += this.vy;
    }
    /**
     * metodo que realiza las comprobaciones para el rebote de la bola
     */
    abstract void rebote();
    /**
     * metodo que comprueba si el rectangulo que forma el circulo
     * colisiona con otro rectangulo
     * @param rectangulo
     * @return 
     */
    public boolean colision(Rectangle rectangulo){
        Rectangle bolaRect = new Rectangle(x, y, ancho, alto);
        return bolaRect.intersects(rectangulo);
    }
    /**
     * metodo que pinta la pelota segun sus parametros en un 
     * espacio (juego)
     * @param g2d 
     */
    public void pintar(Graphics2D g2d){
        g2d.setColor(new Color(0,255,255));
        g2d.fillOval(x, y, alto, ancho);
        
    }
    // GETTERS SETTERS ////////////////////////////////////////////////////////
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

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
    
}
