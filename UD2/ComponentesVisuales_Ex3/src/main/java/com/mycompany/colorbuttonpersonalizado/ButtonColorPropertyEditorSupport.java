/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colorbuttonpersonalizado;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author a21gonzalocm
 */
public class ButtonColorPropertyEditorSupport extends PropertyEditorSupport {

    private PanelSelectColorPersonalizado buttonPanel = new PanelSelectColorPersonalizado();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return buttonPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Cor cor = buttonPanel.getSelectedValue();

        return "new com.mycompany.colorbuttonpersonalizado.Cor(" + "new java.awt.Color("
                + cor.getTextColor().getRGB() + "), " + "new java.awt.Color(" + cor.getBackgroundColor().getRGB() + ") "
                + ")";

    }

    @Override
    public Object getValue() {

        return buttonPanel.getSelectedValue();
    }

}
