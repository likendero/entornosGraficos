/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examennetbeansjaviergonzalezrives;

/**
 *
 * @author likendero
 */
public class PanelCoches extends javax.swing.JPanel {

    /**
     * Creates new form PanelCoches
     */
    public PanelCoches() {
        initComponents();
        panelCambioMarchas1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txModelo = new javax.swing.JTextField();
        rdDiesel = new javax.swing.JRadioButton();
        rdHibrido = new javax.swing.JRadioButton();
        rdElectrico = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        rdGasolina = new javax.swing.JRadioButton();
        panelCambioMarchas1 = new examennetbeansjaviergonzalezrives.PanelCambioMarchas();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(examennetbeansjaviergonzalezrives.EXAMENnetbeansJavierGonzalezRivesApp.class).getContext().getResourceMap(PanelCoches.class);
        setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("Form.border.title"))); // NOI18N
        setToolTipText(resourceMap.getString("Form.toolTipText")); // NOI18N
        setName("Form"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        txModelo.setColumns(10);
        txModelo.setName("txModelo"); // NOI18N
        txModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txModeloActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdDiesel);
        rdDiesel.setText(resourceMap.getString("rdDiesel.text")); // NOI18N
        rdDiesel.setName("rdDiesel"); // NOI18N
        rdDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDieselActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdHibrido);
        rdHibrido.setText(resourceMap.getString("rdHibrido.text")); // NOI18N
        rdHibrido.setName("rdHibrido"); // NOI18N
        rdHibrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHibridoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdElectrico);
        rdElectrico.setText(resourceMap.getString("rdElectrico.text")); // NOI18N
        rdElectrico.setName("rdElectrico"); // NOI18N
        rdElectrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdElectricoActionPerformed(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Turismo", "Monovolumen", "SUV", "Todoterreno" }));
        cbTipo.setName("cbTipo"); // NOI18N
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txCodigo.setColumns(10);
        txCodigo.setName("txCodigo"); // NOI18N
        txCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdGasolina);
        rdGasolina.setText(resourceMap.getString("rdGasolina.text")); // NOI18N
        rdGasolina.setName("rdGasolina"); // NOI18N
        rdGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdGasolinaActionPerformed(evt);
            }
        });

        panelCambioMarchas1.setToolTipText(resourceMap.getString("panelCambioMarchas1.toolTipText")); // NOI18N
        panelCambioMarchas1.setName("panelCambioMarchas1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdDiesel)
                            .addComponent(rdGasolina)
                            .addComponent(rdHibrido)
                            .addComponent(rdElectrico))
                        .addGap(24, 24, 24)
                        .addComponent(panelCambioMarchas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCambioMarchas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdDiesel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdGasolina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdHibrido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdElectrico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txModeloActionPerformed

    private void txCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoActionPerformed

    private void rdDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDieselActionPerformed
        comprobacionCambio();
    }//GEN-LAST:event_rdDieselActionPerformed

    private void rdGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGasolinaActionPerformed
         comprobacionCambio();
    }//GEN-LAST:event_rdGasolinaActionPerformed

    private void rdHibridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHibridoActionPerformed
       comprobacionCambio();
    }//GEN-LAST:event_rdHibridoActionPerformed

    private void rdElectricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdElectricoActionPerformed
        comprobacionCambio();
    }//GEN-LAST:event_rdElectricoActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
       comprobacionCambio();
    }//GEN-LAST:event_cbTipoActionPerformed
    /**
     * metodo que comprueba el estado de la seleccion
     */
    public void comprobacionCambio(){
        String seleccionado = (String)cbTipo.getSelectedItem();
        if(
                rdDiesel.isSelected() && seleccionado.equals("Monovolumen")
                ||
                rdGasolina.isSelected() && seleccionado.equals("Turismo")
                 ){
            panelCambioMarchas1.setVisible(true);
        }
        else{
            panelCambioMarchas1.setVisible(false);
        }
    }
    public boolean Comprobar(){
        // comprobacion del estado de los recuadros
        if(txCodigo.getText().isEmpty() || txModelo.getText().isEmpty()){
            // en el caso que falten por rellenar
            return false;
        }
        else {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private examennetbeansjaviergonzalezrives.PanelCambioMarchas panelCambioMarchas1;
    private javax.swing.JRadioButton rdDiesel;
    private javax.swing.JRadioButton rdElectrico;
    private javax.swing.JRadioButton rdGasolina;
    private javax.swing.JRadioButton rdHibrido;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txModelo;
    // End of variables declaration//GEN-END:variables
}
