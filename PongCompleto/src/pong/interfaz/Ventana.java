
package pong.interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pong.juego.Juego;
import pong.juego.Sonido;

/**
 * ventana que contiene el panel de juego
 * @author Javier Gonzalez Rives
 */
public class Ventana extends JFrame implements ActionListener, Runnable {
    private Juego juego;
    private JButton btStart;
    private JLabel lbDificultad;
    private JLabel lbToques;
    public Ventana(){
        super();
        // caracteristicas de la ventana 
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        // incializacion de componentes
        init();
        // enpaquetado de la ventana
        pack();
        (new Thread(this)).start();
    }
    /**
     * metodo que inicia el juego
     */
    private void init(){
        // inicializacion del panel de juego
        juego = new Juego();
        // botones
        btStart = new JButton("Start");
        // crear etiquetas
        lbDificultad = new JLabel("dificultad: ");
        lbToques = new JLabel("toques: ");
        // annadir acciones
        btStart.addActionListener(this);
        // annadir acciones teclado
        this.setFocusable(true);
        this.addKeyListener(juego);
        // panel contenedor con el juego
        JPanel panelCentral = new JPanel();
        JPanel panelDerecho = new JPanel();
        // annadir al panel central
        panelCentral.add(juego);
        panelCentral.setBorder(BorderFactory.createBevelBorder(2));
        //panelCentral.setFocusable(true);
        //panelCentral.addKeyListener(juego);
        panelDerecho.add(btStart);
        panelDerecho.add(lbDificultad);
        panelDerecho.add(lbToques);
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
            // seteo estados
            juego.setControl(true);
            juego.setDerrota(false);
            // se crea el hilo
            Thread hiloJuego = new Thread(this.juego);
            // se inicia
            hiloJuego.start();
        }
    }

    @Override
    public void run() {
        while(true){
            
            lbDificultad.setText("dificultad: " + juego.getDificultad());
            lbToques.setText("toques: " + juego.getPelota().getToques());
            if(juego.isDerrota()){
                juego.getPelota().setX(0);
                juego.getPelota().setY(0);
                juego.getPelota().setToques(0);
                juego.setDificultad(0);
                Sonido.SOUNDGAMEOVER.play();
                JOptionPane.showMessageDialog(this, "fin del juego","derrota",JOptionPane.INFORMATION_MESSAGE);
                btStart.setEnabled(true);
                juego.setDerrota(false);
            }
        }
    }
}
