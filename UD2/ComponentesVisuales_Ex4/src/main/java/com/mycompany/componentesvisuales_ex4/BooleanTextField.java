/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex4;

import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author a21javierbq
 */
public class BooleanTextField extends JTextField implements Serializable {

private boolean onlyNumbers;

    public BooleanTextField() {
        super();
        this.onlyNumbers = false; // Por defecto, permitimos cualquier texto
    }

    // Getter y setter para la propiedad onlyNumbers
    public boolean isOnlyNumbers() {
        return onlyNumbers;
    }

    public void setOnlyNumbers(boolean onlyNumbers) {
        this.onlyNumbers = onlyNumbers;
    }

    @Override
    protected void processKeyEvent(KeyEvent e) {
        if (onlyNumbers) {
            char c = e.getKeyChar();
            // Permitir solo dígitos, backspace y delete
            if (Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                super.processKeyEvent(e); // Permitir el evento
            } else {
                e.consume(); // Ignorar el evento si no es un número
            }
        } else {
            super.processKeyEvent(e); // Si onlyNumbers es falso, comportamiento normal
        }
    }
}
