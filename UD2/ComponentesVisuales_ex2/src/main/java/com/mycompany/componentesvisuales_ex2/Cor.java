/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex2;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author a21javierbq
 */
public class Cor extends JPanel implements Serializable {

    private Color corTexto;
    private Color corFondo;

    public Cor() {
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
