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
public class ButtonColorHoverPropertyEditorSupport  extends PropertyEditorSupport{
    
    private PanelSelectColorHoverPersonalizado panelHover= new PanelSelectColorHoverPersonalizado();
    
        @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return panelHover;
    }
    
        @Override
    public String getJavaInitializationString() {
        CorHover corHover = panelHover.getSelectedValue();

        return "new com.mycompany.colorbuttonpersonalizado.CorHover(" + "new java.awt.Color("
                + corHover.getCorHoverTexto().getRGB() + "), " + "new java.awt.Color(" + corHover.getCorHoverFondo().getRGB() + ") "
                + ")";

    }

    @Override
    public Object getValue() {

        return panelHover.getSelectedValue();
    }
    
}
