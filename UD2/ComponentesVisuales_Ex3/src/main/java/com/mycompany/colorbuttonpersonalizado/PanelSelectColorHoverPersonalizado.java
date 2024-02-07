/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.colorbuttonpersonalizado;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author a21gonzalocm
 */
public class PanelSelectColorHoverPersonalizado extends javax.swing.JPanel {

    private Color corHoverTexto = new Color(0, 0, 0);
    private Color corHoverFondo = new Color(0, 0, 0);

    /**
     * Creates new form PanelSelectColorHoverPersonalizado
     */
    public PanelSelectColorHoverPersonalizado() {
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

        lblHoverTxt = new javax.swing.JLabel();
        lblHoverTexto = new javax.swing.JLabel();
        jtfHovTxt = new javax.swing.JTextField();
        jtfHovFondo = new javax.swing.JTextField();
        btnHovTxt = new javax.swing.JButton();
        btnHovFondo = new javax.swing.JButton();

        lblHoverTxt.setText("Cor Hover Texto:");

        lblHoverTexto.setText("Cor Hover Fondo:");

        jtfHovTxt.setEditable(false);
        jtfHovTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHovTxtActionPerformed(evt);
            }
        });

        jtfHovFondo.setEditable(false);

        btnHovTxt.setText("...");
        btnHovTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHovTxtActionPerformed(evt);
            }
        });

        btnHovFondo.setText("...");
        btnHovFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHovFondoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoverTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfHovFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHovFondo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoverTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfHovTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHovTxt)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoverTxt)
                    .addComponent(jtfHovTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHovTxt))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoverTexto)
                    .addComponent(jtfHovFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHovFondo))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfHovTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHovTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHovTxtActionPerformed

    private void btnHovTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHovTxtActionPerformed
        corHoverTexto = JColorChooser.showDialog(btnHovTxt, "Selecciona unha cor para o hover do texto", corHoverFondo);
        int red = corHoverTexto.getRed();
        int blue = corHoverTexto.getBlue();
        int green = corHoverTexto.getGreen();
        jtfHovTxt.setText("[" + red + "," + green + "," + blue + "]");
    }//GEN-LAST:event_btnHovTxtActionPerformed

    private void btnHovFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHovFondoActionPerformed
        corHoverFondo = JColorChooser.showDialog(btnHovTxt, "Selecciona unha cor para o hover do texto", corHoverFondo);
        int red = corHoverFondo.getRed();
        int blue = corHoverFondo.getBlue();
        int green = corHoverFondo.getGreen();
        jtfHovFondo.setText("[" + red + "," + green + "," + blue + "]");
    }//GEN-LAST:event_btnHovFondoActionPerformed

    public CorHover getSelectedValue() {
        CorHover corHover = new CorHover(corHoverTexto, corHoverFondo);
        return corHover;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHovFondo;
    private javax.swing.JButton btnHovTxt;
    private javax.swing.JTextField jtfHovFondo;
    private javax.swing.JTextField jtfHovTxt;
    private javax.swing.JLabel lblHoverTexto;
    private javax.swing.JLabel lblHoverTxt;
    // End of variables declaration//GEN-END:variables
}
