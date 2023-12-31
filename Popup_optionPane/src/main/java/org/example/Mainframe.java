package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    public Mainframe() {
        setLayout(new FlowLayout());
        b1 = new JButton("messageDialog");
        b2 = new JButton("confirmDialog");
        b3 = new JButton("inputDialog");
        b4 = new JButton("optionDialog");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JOptionPane.showMessageDialog(null, "Me duele la cabeza", "messageDialog", JOptionPane.WARNING_MESSAGE);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JOptionPane.showConfirmDialog(null, "Do you want to exit?", "confirmDialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ssl.png"));
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JOptionPane.showInputDialog(null, "Write your name", "inputDialog", JOptionPane.ERROR_MESSAGE, null, null, "Cositas");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JOptionPane.showOptionDialog(null, "Choose an option", "optionDialog", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Option1", "Option2", "Option3", "Option4"}, "Option 1");
            }
        });

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setVisible(true);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
