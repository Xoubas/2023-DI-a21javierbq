/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author a21gonzalocm
 */
public class Toolbar extends JPanel {

    private JButton helloBtn;
    private JButton goodbyeBtn;
    private StringListener textListener;

    public Toolbar() {
        helloBtn = new JButton("Hello");
        goodbyeBtn = new JButton("Goodbye");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloBtn);
        add(goodbyeBtn);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                if (clickedButton == helloBtn) {
                    if (textListener != null) {
                        StringEvent se = new StringEvent(this, "Hello\n");
                        textListener.textEmitted(se);
                    }
                } else if (clickedButton == goodbyeBtn) {
                    if (textListener != null) {
                        StringEvent se = new StringEvent(this, "Goodbye\n");
                        textListener.textEmitted(se);
                    }
                }
            }
        };
        helloBtn.addActionListener(al);
        goodbyeBtn.addActionListener(al);
    }

    public void setTextListener(StringListener textListener) {
        this.textListener = textListener;
    }
}
