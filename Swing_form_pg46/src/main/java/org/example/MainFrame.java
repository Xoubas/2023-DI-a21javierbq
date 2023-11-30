/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.*;

/**
 * @author a21gonzalocm
 */
public class MainFrame extends JFrame {

    private JButton aceptarButton;
    private JLabel labelNome;
    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel form;

    public MainFrame() {
        super("Ola Mundo!");
        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        form = new FormPanel();
        textPanel = new TextPanel();
        toolbar = new Toolbar();
        toolbar.setTextListener(new StringListener() {
            @Override
            public void textEmitted(StringEvent se) {

                textPanel.appendText(se.getText());
            }
        });
        aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textPanel.appendText("holaMundo\n");
            }
        });

        form.setTextListener(new StringListener() {
            @Override
            public void textEmitted(StringEvent se) {

                textPanel.appendText(se.getText());
            }
        });

        add(toolbar, BorderLayout.PAGE_START);
        add(textPanel, BorderLayout.CENTER);
        add(aceptarButton, BorderLayout.PAGE_END);
        add(form, BorderLayout.WEST);
        setSize(600, 500);
        setMinimumSize(new Dimension(400, 250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("A menu");
        JMenu menu2 = new JMenu("Another menu");

        //Items and icons
        JMenuItem menuItem1 = new JMenuItem("A text-only menu item");
        menuItem1.setMnemonic('1');
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("A text-only menu item");
            }
        });
        ImageIcon imageIcon = new ImageIcon("protesta.png");
        JMenuItem menuItem2 = new JMenuItem("Both text and icon", imageIcon);
        JMenuItem menuItem3 = new JMenuItem();
        menuItem3.setIcon(imageIcon);

        //Radio buttons
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("A radio button menu item");
        JRadioButton rb2 = new JRadioButton("Another one");
        bg.add(rb1);
        bg.add(rb2);

        //Checkboxes
        JCheckBox cb1 = new JCheckBox("A checkbox menu item");
        JCheckBox cb2 = new JCheckBox("Another one");


        menu1.setIcon(imageIcon);
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(new JSeparator());
        menu1.add(rb1);
        menu1.add(rb2);
        menu1.add(new JSeparator());
        menu1.add(cb1);
        menu1.add(cb2);


        menuBar.add(menu1);
        menuBar.add(menu2);
        return menuBar;
    }
}
