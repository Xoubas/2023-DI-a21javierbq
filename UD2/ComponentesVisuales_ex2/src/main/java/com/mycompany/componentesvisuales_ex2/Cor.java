/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex2;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author a21javierbq
 */
public class Cor implements Serializable {

    private Color corTexto;
    private Color corFondo;

    public Cor() {
    }

    public Cor(Color corTexto, Color corFondo) {
        this.corTexto = corTexto;
        this.corFondo = corFondo;
    }

    public Color getCorTexto() {
        return corTexto;
    }

    public void setCorTexto(Color corTexto) {
        this.corTexto = corTexto;
    }

    public Color getCorFondo() {
        return corFondo;
    }

    public void setCorFondo(Color corFondo) {
        this.corFondo = corFondo;
    }

}
