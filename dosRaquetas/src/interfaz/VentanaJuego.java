/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import intentodosraquetas.Juego;
/**
 *
 * @author Javier Gonzalez Rives
 */
public class VentanaJuego extends javax.swing.JFrame {
    private Juego juego;
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        juego = new Juego();
        
        initComponents();
        panelPrincipal.add(juego);
        pack();
        setResizable(false);
        this.addKeyListener(juego.getRaqueta1());
        this.addKeyListener(juego.getRaqueta2());
        this.setFocusable(true);
        this.setFocusableWindowState(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        btJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBotones.setLayout(new javax.swing.BoxLayout(PanelBotones, javax.swing.BoxLayout.LINE_AXIS));

        btJugar.setText("jugar");
        btJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJugarActionPerformed(evt);
            }
        });
        PanelBotones.add(btJugar);

        panelPrincipal.add(PanelBotones);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJugarActionPerformed
        juego.inicioJuego();
        this.requestFocus();
        /*this.setEnabled(false);
        Runnable fin = new Runnable() {

            @Override
            public void run() {
                while(juego.getHilo().isAlive()){
                }
                btJugar.setEnabled(true);
           }
        };
        Thread hilo = new Thread(fin);
        hilo.start();*/
    }//GEN-LAST:event_btJugarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JButton btJugar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
