/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JButton;
import javax.swing.JSpinner;
import sun.awt.WindowClosingListener;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class Informes extends javax.swing.JDialog implements WindowListener{

    /**
     * Creates new form Informes
     */
    public Informes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.addWindowListener(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btInforme2 = new javax.swing.JButton();
        btinforme3 = new javax.swing.JButton();
        btInforme4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("informe1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btImprimir.setText("imprimir");

        btInforme2.setText("informe2");
        btInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInforme2ActionPerformed(evt);
            }
        });

        btinforme3.setText("informe3");
        btinforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinforme3ActionPerformed(evt);
            }
        });

        btInforme4.setText("informe4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btinforme3))
                    .addComponent(btImprimir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInforme2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btInforme4)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btinforme3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInforme2)
                    .addComponent(btInforme4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btImprimir)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInforme2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInforme2ActionPerformed

    private void btinforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinforme3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btinforme3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btInforme2;
    private javax.swing.JButton btInforme4;
    private javax.swing.JButton btinforme3;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtInforme2() {
        return btInforme2;
    }

    public void setBtInforme2(JButton btInforme2) {
        this.btInforme2 = btInforme2;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getBtImprimir() {
        return btImprimir;
    }

    public void setBtImprimir(JButton btImprimir) {
        this.btImprimir = btImprimir;
    }

   

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public JButton getBtinforme3() {
        return btinforme3;
    }

    public void setBtinforme3(JButton btinforme3) {
        this.btinforme3 = btinforme3;
    }

    public JButton getBtInforme4() {
        return btInforme4;
    }

    public void setBtInforme4(JButton btInforme4) {
        this.btInforme4 = btInforme4;
    }

    
    
    
}
