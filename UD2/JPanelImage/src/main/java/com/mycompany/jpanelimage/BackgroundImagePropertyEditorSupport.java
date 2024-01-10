package com.mycompany.jpanelimage;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a21javierbq
 */
public class BackgroundImagePropertyEditorSupport extends PropertyEditorSupport {

    private BackgroundPanel backgroundPanel = new BackgroundPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return backgroundPanel;
    }

    @Override
    public Object getValue() {
        return backgroundPanel.getSelectedValue();
    }

    @Override
    public String getJavaInitializationString() {
        BackgroundImage imaxeFondo = backgroundPanel.getSelectedValue();
        return "new com.mycompany.jpanelimage.BackgroundImage(" + "new java.io.File(\""
                + imaxeFondo.getFicheroImagen().getAbsolutePath() + "\"), " + imaxeFondo.getOpacidad()
                + "f)";
    }
}
