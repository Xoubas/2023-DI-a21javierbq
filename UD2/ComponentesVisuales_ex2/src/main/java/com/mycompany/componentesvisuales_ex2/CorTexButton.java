/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex2;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a21javierbq
 */
public class CorTexButton extends JButton implements Serializable {

    Cor cor;

    public CorTexButton() {

    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void changeBackground() {
        setBackground(cor.getCorFondo());
    }

    public void changeText() {
        setForeground(cor.getCorTexto());
    }
}
