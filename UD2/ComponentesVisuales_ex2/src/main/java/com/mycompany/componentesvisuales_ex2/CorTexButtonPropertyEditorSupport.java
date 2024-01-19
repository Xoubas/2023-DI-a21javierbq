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
public class CorTexButtonPropertyEditorSupport extends PropertyEditorSupport {

    CorPanel corPanel = new CorPanel();

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
        Cor cor = corPanel.getSelectedValue();
        return "new com.mycompany.componentesvisuales_ex2.CorTexButton(" + "new java.awt.Color(\""
                + cor.getCorTexto() + "\"), " + cor.getCorFondo()
                + "f)";
    }

}
