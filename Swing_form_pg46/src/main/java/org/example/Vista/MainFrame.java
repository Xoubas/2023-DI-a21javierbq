/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Vista;

import org.example.Controller.Controller;
import org.example.Controller.IController;
import org.example.Model.Person;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author a21gonzalocm
 */
public class MainFrame extends JFrame {
    Controller controller = new Controller();
    Person
    private JButton aceptarButton;
    private JLabel labelNome;
    private JTable table;
    private Toolbar toolbar;
    private FormPanel form;

    public MainFrame() {
        super("Ola Mundo!");
        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        form = new FormPanel();
        table = new JTable();
        toolbar = new Toolbar();

        //Change text fields to JTables in the three methods below
        toolbar.setTextListener(new StringListener() {
            @Override
            public void textEmitted(FormEvent se) {

//                table.appendText(se.getText());
            }
        });
        aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                textPanel.appendText("holaMundo\n");
            }
        });

        form.setTextListener(new StringListener() {
            @Override
            public void textEmitted(FormEvent se) {
//                textPanel.appendText(se.getText());
            }
        });

        //Confirmation dialog
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                closeConfirmation();
            }

            public void closeConfirmation() {
                int r = JOptionPane.showConfirmDialog(MainFrame.this, "Do you really want to exit?", "EXIT", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION)
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                else
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        });

        add(toolbar, BorderLayout.PAGE_START);
//        add(textPanel, BorderLayout.CENTER);
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
        JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("A radio button menu item");
        JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("Another one");
        bg.add(rb1);
        bg.add(rb2);

        //Checkboxes
        JCheckBoxMenuItem cb1 = new JCheckBoxMenuItem("A checkbox menu item");
        JCheckBoxMenuItem cb2 = new JCheckBoxMenuItem("Another one");


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
    public void setController(IController controller) {
        this.controller = controller;
    }
}
