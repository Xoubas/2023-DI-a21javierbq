/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colorbuttonpersonalizado;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author a21gonzalocm
 */
public class CorHover implements Serializable {
    
    private Color corHoverTexto;
    private Color corHoverFondo;

    public CorHover() {
    }

    public CorHover(Color corHoverTexto, Color corHoverFondo) {
        this.corHoverTexto = corHoverTexto;
        this.corHoverFondo = corHoverFondo;
    }

    public Color getCorHoverTexto() {
        return corHoverTexto;
    }

    public void setCorHoverTexto(Color corHoverTexto) {
        this.corHoverTexto = corHoverTexto;
    }

    public Color getCorHoverFondo() {
        return corHoverFondo;
    }

    public void setCorHoverFondo(Color corHoverFondo) {
        this.corHoverFondo = corHoverFondo;
    }
    
    
    
}
