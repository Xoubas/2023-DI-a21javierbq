/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author a21gonzalocm
 */
public class Toolbar extends JPanel {

    private JButton helloBtn;
    private JButton goodbyeBtn;
    private StringListener textListener;
    private TextPanel textPanel;
    private StringListener stringListener;

    public Toolbar() {

        helloBtn = new JButton("Hello");
        goodbyeBtn = new JButton("Goodbye");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                if (clickedButton == helloBtn) {
                    if (stringListener != null) {
                        StringEvent se = new StringEvent(this, "Hello\n");
                        stringListener.textEmitted(se);
                    }
                } else if (clickedButton == goodbyeBtn) {
                    StringEvent se = new StringEvent(this, "Goodbye\n");
                    stringListener.textEmitted(se);
                }
            }
        };

        helloBtn.addActionListener(al);
        goodbyeBtn.addActionListener(al);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloBtn);
        add(goodbyeBtn);

    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    public void setStringListener(StringListener listener) {
        this.stringListener = listener;
    }

}
