
package pong.juego;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Juego extends Canvas implements Runnable, KeyListener {
    private final int WIDTH2 = 300,HEIGHT2 = 500;
    private Pelota pelota;
    private Raqueta raqueta;
    private boolean control;
    private Image img;
    private Graphics gAux;
    /**
     * metodo constructor del lienzo de juego
     */
    public Juego(){
        super();
        this.pelota = new Pelota(this);
        this.raqueta = new Raqueta(this);
        this.control = true;
        this.setPreferredSize(new Dimension(WIDTH2,HEIGHT2));
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }
    
    @Override
    public void update(Graphics g) {
        // configuracion de la precarga 
        if(img == null && gAux == null ){
            // imagen que contiene la salida
            img = createImage(WIDTH2, HEIGHT2);
            // Graficos auxiliares
            gAux = (Graphics2D) img.getGraphics();
        }
        // prepara cion de pintado en imagen
        super.paint(gAux); 
        // captura de la variable
        Graphics2D g2d = (Graphics2D) gAux;
        // pintado de la bola
        pelota.dibujarPelota(g2d);
        // dibujar la raqueta
        raqueta.dibujarRaqueta(g2d);
        // pintado de la imagen guarda con el resultado final
        g.drawImage(img, 0, 0, this);
    }
    
    // getter setter

    public int getWIDTH2() {
        return WIDTH2;
    }

    public int getHEIGHT2() {
        return HEIGHT2;
    }
    // otros metodos
    @Override
    public void run() {
        // bucle del juego
        while(control){
            pelota.movimiento();
            raqueta.movimientoRaqueta();
            //System.out.println("hola");
            repaint();
            
            try{
                Thread.sleep(10);
            }catch(InterruptedException in){
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // caso de pulsar la tecla derecha
        if(e.getKeyCode()== KeyEvent.VK_L){
            // desplazamiento a la derecha de la paleta
            raqueta.moverDerecha();
            System.out.println("derecha");
        }
        // caso de pulsar la flecha izquierda
        if(e.getKeyCode() == KeyEvent.VK_K){
            // desplazamiento a la izquierda
            raqueta.moverIzquierda();
            System.out.println("izquierda");
        }
        System.out.println("teclas");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        raqueta.noMover();
    }
    
}
