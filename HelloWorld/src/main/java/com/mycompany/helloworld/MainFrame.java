/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.WindowConstants;

/**
 *
 * @author a21javierbq
 */
public class MainFrame extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton aceptarButton;
    private JLabel jf;

    public MainFrame() {
        super("Ola Mundo!");
// Establecer o Layout
        setLayout(new BorderLayout());
// Inicializar os compoñentes
        textArea = new JTextArea();
        aceptarButton = new JButton("Aceptar");
        jf = new JLabel("Javier Bayón Quintas", SwingConstants.CENTER);

// engadir os compoñentes
        add(jf, BorderLayout.PAGE_START);
        jf.setFont(new Font("Arial", 2, 24));

//Event listeners
//Lambda
//        aceptarButton.addActionListener((ae) -> {
//            System.out.println("Lambda");
//        });
//        aceptarButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.out.println("Botton pulsado");
//            }
//        });
//Reutilizable
//        ActionListener al = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.out.println("Botón pulsado");
//            }
//        };
//
//        aceptarButton.addActionListener(this);
        add(textArea, BorderLayout.CENTER);
        add(aceptarButton, BorderLayout.PAGE_END);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    // Implementing ActionListener
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Cositas");
    }
}
