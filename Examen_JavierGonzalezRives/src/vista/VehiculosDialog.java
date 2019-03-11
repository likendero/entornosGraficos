/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Javier Gonzalez Rives
 */
public class VehiculosDialog extends javax.swing.JFrame {

    /**
     * Creates new form vehiculosDialog
     */
    public VehiculosDialog() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txMatricula = new javax.swing.JTextField();
        txMarca = new javax.swing.JTextField();
        txModelo = new javax.swing.JTextField();
        txKilometros = new javax.swing.JTextField();
        spFecha = new javax.swing.JSpinner();
        btInsertar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btLimipar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        jLabel1.setText("Matricula:");

        jLabel2.setText("marca:");

        jLabel3.setText("modelo:");

        jLabel4.setText("numero Kilometros:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setText("Vehiculos");

        jLabel6.setText("fecha revision:");

        txMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMatriculaActionPerformed(evt);
            }
        });

        txMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMarcaActionPerformed(evt);
            }
        });

        txModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txModeloActionPerformed(evt);
            }
        });

        spFecha.setModel(new javax.swing.SpinnerDateModel());

        btInsertar.setText("insertar");

        btActualizar.setText("actualizar");

        btBorrar.setText("borrar");

        btLimipar.setText("limpiar");

        btBuscar.setText("buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txMatricula)
                            .addComponent(txMarca)
                            .addComponent(txModelo)
                            .addComponent(txKilometros)
                            .addComponent(spFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimipar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsertar)
                    .addComponent(btActualizar)
                    .addComponent(btBorrar)
                    .addComponent(btLimipar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMatriculaActionPerformed

    private void txMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMarcaActionPerformed

    private void txModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txModeloActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btInsertar;
    private javax.swing.JButton btLimipar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spFecha;
    private javax.swing.JTextField txKilometros;
    private javax.swing.JTextField txMarca;
    private javax.swing.JTextField txMatricula;
    private javax.swing.JTextField txModelo;
    // End of variables declaration//GEN-END:variables
    // GETTERS SETTERS ////////////////////////////////////////////////////////
    public JButton getBtActualizar() {
        return btActualizar;
    }

    public void setBtActualizar(JButton btActualizar) {
        this.btActualizar = btActualizar;
    }

    public JButton getBtBorrar() {
        return btBorrar;
    }

    public void setBtBorrar(JButton btBorrar) {
        this.btBorrar = btBorrar;
    }

    public JButton getBtBuscar() {
        return btBuscar;
    }

    public void setBtBuscar(JButton btBuscar) {
        this.btBuscar = btBuscar;
    }

    public JButton getBtInsertar() {
        return btInsertar;
    }

    public void setBtInsertar(JButton btInsertar) {
        this.btInsertar = btInsertar;
    }

    public JButton getBtLimipar() {
        return btLimipar;
    }

    public void setBtLimipar(JButton btLimipar) {
        this.btLimipar = btLimipar;
    }

    public JSpinner getSpFecha() {
        return spFecha;
    }

    public void setSpFecha(JSpinner spFecha) {
        this.spFecha = spFecha;
    }

    public JTextField getTxKilometros() {
        return txKilometros;
    }

    public void setTxKilometros(JTextField txKilometros) {
        this.txKilometros = txKilometros;
    }

    public JTextField getTxMarca() {
        return txMarca;
    }

    public void setTxMarca(JTextField txMarca) {
        this.txMarca = txMarca;
    }

    public JTextField getTxMatricula() {
        return txMatricula;
    }

    public void setTxMatricula(JTextField txMatricula) {
        this.txMatricula = txMatricula;
    }

    public JTextField getTxModelo() {
        return txModelo;
    }

    public void setTxModelo(JTextField txModelo) {
        this.txModelo = txModelo;
    }


}
