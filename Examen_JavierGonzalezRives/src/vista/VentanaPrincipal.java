/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JMenuItem;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miVehiculos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miInformes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miAyuda = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("file");

        miVehiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        miVehiculos.setText("vehiculos");
        jMenu1.add(miVehiculos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("reports");

        miInformes.setText("informes");
        miInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInformesActionPerformed(evt);
            }
        });
        jMenu2.add(miInformes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("about");

        miAcerca.setText("acerca de");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        jMenu3.add(miAcerca);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("ayuda");

        miAyuda.setText("ayuda");
        miAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAyudaActionPerformed(evt);
            }
        });
        jMenu4.add(miAyuda);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAcercaActionPerformed

    private void miAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAyudaActionPerformed

    private void miInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miInformesActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miAyuda;
    private javax.swing.JMenuItem miInformes;
    private javax.swing.JMenuItem miVehiculos;
    // End of variables declaration//GEN-END:variables

    

    public JMenuItem getMiVehiculos() {
        return miVehiculos;
    }
    
    public JMenuItem getMiInformes() {
        return miInformes;
    }

    public void setMiInformes(JMenuItem miInformes) {
        this.miInformes = miInformes;
    }

    public JMenuItem getMiAcerca() {
        return miAcerca;
    }

    public void setMiAcerca(JMenuItem miAcerca) {
        this.miAcerca = miAcerca;
    }

    
    public JMenuItem getMiAyuda() {
        return miAyuda;
    }

    public void setMiAyuda(JMenuItem miAyuda) {
        this.miAyuda = miAyuda;
    }
    
}
