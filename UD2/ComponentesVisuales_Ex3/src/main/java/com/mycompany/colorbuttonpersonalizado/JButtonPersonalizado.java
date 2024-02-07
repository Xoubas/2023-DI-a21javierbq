/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colorbuttonpersonalizado;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a21gonzalocm
 */
public class JButtonPersonalizado extends JButton implements Serializable {

    private Cor cores;
    private CorHover coresHover;

    public JButtonPersonalizado() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(cores.getBackgroundColor());
                setForeground(cores.getTextColor());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(coresHover.getCorHoverFondo());
                setForeground(coresHover.getCorHoverTexto());
            }

        });
    }

    public JButtonPersonalizado(Cor cores, CorHover coresHover) {
        this.cores = cores;
        this.coresHover = coresHover;

    }

    public Cor getCores() {
        return cores;
    }

    public void setCores(Cor cores) {
        this.cores = cores;
        setBackground(cores.getBackgroundColor());
        setForeground(cores.getTextColor());
    }

    public CorHover getCoresHover() {
        return coresHover;
    }

    public void setCoresHover(CorHover coresHover) {
        this.coresHover = coresHover;
    }

}
