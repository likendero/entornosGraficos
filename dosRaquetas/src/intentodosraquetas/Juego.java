/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentodosraquetas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Juego extends Canvas implements Runnable {
    private Semaforo semaforo;
    private Raqueta raqueta1, raqueta2;
    private PelotaDosRaquetas pelota;
    private Image imagen;
    private Graphics graf;
    private boolean vic;
    private int jugador1, jugador2;
    private int width2 = 800,height2 = 500;
    private Thread hilo;
    public Juego(){
        super();
        this.setPreferredSize(new Dimension(800,500));
        this.setFocusable(true);
        this.addKeyListener(raqueta1);
        this.addKeyListener(raqueta2);
        // figuras
        pelota = new PelotaDosRaquetas(60, 60, this.getWidth2()/2, this.getHeight2()/2, 1, 1,
                new Color(242, 16, 16), this);
        raqueta1 = new Raqueta(20, this.getHeight2()/2, 20, 70, this, new Color(242, 198, 16));
        raqueta2 = new Raqueta(this.getWidth2()-40, this.getHeight2()/2, 20, 70, this, new Color(242, 198, 16));
        // controles
        raqueta1.setArriba(KeyEvent.VK_UP);
        raqueta1.setAbajo(KeyEvent.VK_DOWN);
        raqueta2.setArriba(KeyEvent.VK_W);
        raqueta2.setAbajo(KeyEvent.VK_S);
        // vinculacion
        pelota.setRaqueta1(raqueta1);
        pelota.setRaqueta2(raqueta2);
        // otras variables 
        semaforo = new Semaforo();
        jugador1 = 0;
        jugador2 = 0;
        vic = false;
    }
    
    @Override
    public void paint(Graphics g) {
        update(g); 
    }

    @Override
    public void update(Graphics g) {
        if(imagen == null && graf == null){
            imagen = createImage(getWidth2(),getHeight2());
            graf =  imagen.getGraphics();
        }
        super.paint(graf);
        Graphics2D g2d = (Graphics2D) graf;
        g2d.setBackground(Color.PINK);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial",Font.BOLD,20));
        if(vic){
            if(jugador1 > jugador2){
                g2d.drawString("Gana Jugador1" , 100, 100);
            }else{
                g2d.drawString("Gana Jugador2" , 100, 100);
            }
        }
        g2d.drawString("" + jugador1,this.getWidth2()/2-50, 60);
        g2d.drawString("" + jugador2,this.getWidth2()/2+50, 60);
        pelota.pintar(g2d);
        raqueta1.dibujar(g2d);
        raqueta2.dibujar(g2d);
        
        g.drawImage(imagen, 0, 0, this);
    }
    // Metodos logicos ////////////////////////////////////////////////////////
    /**
     * metodo que da movimiento a los elementos en pantalla
     */
    private void movimiento(){
        pelota.movimiento();
        raqueta1.movimiento();
        raqueta2.movimiento();
    }
    /**
     * metodo que lleva la cuenta de la puntuacion
     */
    private void puntuacion(){
        // control del estatus de la pelota
        if(!pelota.isEstatus()){
            // aumento de la puntuacion segun la posicion de la bola
            if(pelota.isIzquierdo()){
                jugador2++;
            }else{
                jugador1++;
            }
            pelota.setEstatus(true);
        }
    }
    /**
     * metodo que controla si uno de los dos jugadores ha ganado 
     * para el fin de juego
     */
    private void victoria(){
        if(jugador1 > 9 || jugador2 > 9){
            semaforo.setControl(false);
            jugador1 = 0;
            jugador2 = 0;
            vic = true;
        }
    }
    // Metodos flujo //////////////////////////////////////////////////////////
    /**
     * metodo que inicializa el juego
     */
    public void inicioJuego(){
        semaforo.setControl(true);
        hilo = new Thread(this);
        hilo.start();
        vic = false;
        
    }
    /**
     * metodo que realiza las acciones ciclicas del juego
     * 
     */
    private void bucle(){
       repaint();
       movimiento();
       victoria();
       puntuacion();
    }
    @Override
    public void run() {
        // bucle control del juego
       while(semaforo.isControl()){
           bucle();
           // espera
           try{
               Thread.sleep(5);
           }catch(InterruptedException in){}
       }
    }
    // GETTERS SETTERS //////////////////////////////////////////////////////

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
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

    public int getWidth2() {
        return width2;
    }

    public void setWidth2(int width2) {
        this.width2 = width2;
    }

    public int getHeight2() {
        return height2;
    }

    public void setHeight2(int height2) {
        this.height2 = height2;
    }

    public Thread getHilo() {
        return hilo;
    }

    public void setHilo(Thread hilo) {
        this.hilo = hilo;
    }
    
}
