package com.mycompany.componentesvisuales_ex1;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a21javierbq
 */
public class ColorButton extends JButton implements Serializable {

    private Color color;

    public ColorButton() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        setBackground(color);
    }
}
