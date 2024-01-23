/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.componentesvisuales_ex3;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author a21javierbq
 */
public class CorHoverPropertyPanel extends javax.swing.JPanel {

    private Color textoCor;
    private Color backgroundCor;

    /**
     * Creates new form CorTexPanel
     */
    public CorHoverPropertyPanel() {
        initComponents();
    }

    public CorHoverAttribute getSelectedValue() {
        return new CorHoverAttribute(textoCor, backgroundCor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        textoBtn = new javax.swing.JButton();
        backgroundBtn = new javax.swing.JButton();
        corField = new javax.swing.JTextField();
        textoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        textoBtn.setText("...");
        textoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBtnActionPerformed(evt);
            }
        });

        backgroundBtn.setText("...");
        backgroundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Cor texto:");

        jLabel2.setText("Cor fondo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(corField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundBtn)
                    .addComponent(textoBtn))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBtn)
                    .addComponent(corField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backgroundBtn)
                    .addComponent(textoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundBtnActionPerformed
        Color color = JColorChooser.showDialog(backgroundBtn, "Seleciona a cor de fondo", Color.BLACK);
        textoCor = color;
        corField.setText("[" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "]");
    }//GEN-LAST:event_backgroundBtnActionPerformed

    private void textoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBtnActionPerformed
        Color color = JColorChooser.showDialog(textoBtn, "Seleciona a cor de fondo", Color.BLACK);
        backgroundCor = color;
        textoField.setText("[" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "]");
    }//GEN-LAST:event_textoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backgroundBtn;
    private javax.swing.JTextField corField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton textoBtn;
    private javax.swing.JTextField textoField;
    // End of variables declaration//GEN-END:variables
}
