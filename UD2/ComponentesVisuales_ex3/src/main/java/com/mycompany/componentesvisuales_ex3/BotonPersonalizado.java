/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex3;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a21javierbq
 */
public class BotonPersonalizado extends JButton implements Serializable {

    CorAttribute cor;
    CorHoverAttribute corHover;

    public BotonPersonalizado() {
    }

    public CorAttribute getCor() {
        return cor;
    }

    public CorHoverAttribute getCorHover() {
        return corHover;
    }

    public void setCorHover(CorHoverAttribute corHover) {
        this.corHover = corHover;
    }

    public void setCor(CorAttribute cor) {
        this.cor = cor;
        setBackground(cor.getCorFondo());
        setForeground(cor.getCorTexto());
    }

    public void changeBackground() {
        setBackground(cor.getCorFondo());
    }

    public void changeText() {
        setForeground(cor.getCorTexto());
    }
}
