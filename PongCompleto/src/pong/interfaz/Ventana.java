
package pong.interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pong.juego.Juego;

/**
 * ventana que contiene el panel de juego
 * @author Javier Gonzalez Rives
 */
public class Ventana extends JFrame implements ActionListener {
    private Juego juego;
    private JButton btStart;
    public Ventana(){
        super();
        // caracteristicas de la ventana 
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // incializacion de componentes
        init();
        // enpaquetado de la ventana
        pack();
    }
    /**
     * metodo que inicia el juego
     */
    private void init(){
        // inicializacion del panel de juego
        juego = new Juego();
        // botones
        btStart = new JButton("Start");
        // annadir acciones
        btStart.addActionListener(this);
        // annadir acciones teclado
        this.addKeyListener(juego);
        // panel contenedor con el juego
        JPanel panelCentral = new JPanel();
        JPanel panelDerecho = new JPanel();
        // annadir al panel central
        panelCentral.add(juego);
        panelCentral.setBorder(BorderFactory.createBevelBorder(2));
        panelDerecho.add(btStart);
        // annadir el panel a la ventana
        add(panelCentral,BorderLayout.CENTER);
        add(panelDerecho,BorderLayout.LINE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // caso de inicio de juego
        if(btStart == e.getSource()){
            // se apaga el boton
            btStart.setEnabled(false);
            // se crea el hilo
            Thread hiloJuego = new Thread(this.juego);
            // se inicia
            hiloJuego.start();
        }
    }
}
