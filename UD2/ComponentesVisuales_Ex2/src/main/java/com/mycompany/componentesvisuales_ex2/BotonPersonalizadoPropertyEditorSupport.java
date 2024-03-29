/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex2;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author a21javierbq
 */
public class BotonPersonalizadoPropertyEditorSupport extends PropertyEditorSupport {

    CorPropertyPanel corPanel = new CorPropertyPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return corPanel;
    }

    @Override
    public Object getValue() {
        return corPanel.getSelectedValue();
    }

    /*
    Terminar de hacer las rutas
     */
    @Override
    public String getJavaInitializationString() {
        CorAttribute cor = corPanel.getSelectedValue();
        return "new com.mycompany.componentesvisuales_ex2.CorAttribute(" + "new java.awt.Color("
                + cor.getCorTexto().getRGB() + "), " + "new java.awt.Color(" + cor.getCorFondo().getRGB() + ") "
                + ")";
    }

}
