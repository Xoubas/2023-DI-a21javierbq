/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Vista;

import org.example.Controller.IController;
import org.example.Model.EmploymentCategory;
import org.example.Model.Person;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

/**
 * @author a21javierbq
 */
public class FormPanel extends JPanel {
    JPanel form;
    JLabel nameLab;
    JLabel occupLab;
    JLabel ageLab;
    JTextField name;
    JTextField occupation;
    JButton ok;
    GridBagConstraints gbc = new GridBagConstraints();

    private AgeCategory list;
    private StringListener sl;
    //JComboBox
    private JLabel empLab;
    private String[] comboList = {"employed", "self-employed", "unemployed"};
    private JComboBox<String> employment;
    //Checkbox
    private JLabel citLab;
    private JCheckBox citizen;
    private JLabel taxLab;
    private JTextField tax;
    //Radio buttons
    private ButtonGroup bg;
    private JLabel gender;
    private JRadioButton rbm;
    private JRadioButton rbf;

    public FormPanel() {
        setLayout(new GridBagLayout());
        nameLab = new JLabel("Name: ");
        occupLab = new JLabel("Occupation: ");
        ageLab = new JLabel(("Age: "));
        name = new JTextField(10);
        occupation = new JTextField(10);
        ok = new JButton("OK");
        list = new AgeCategory();

        //JComboBox
        empLab = new JLabel("Employment: ");
        employment = new JComboBox<String>(comboList);
        employment.setSelectedIndex(0);
        employment.setPreferredSize(new Dimension(name.getPreferredSize().width, name.getPreferredSize().height));

        //Checkbox
        citLab = new JLabel("US citizen: ");
        citizen = new JCheckBox();
        taxLab = new JLabel("Tax ID: ");
        tax = new JTextField(10);

        //Radio buttons
        bg = new ButtonGroup();
        gender = new JLabel("Gender: ");
        rbm = new JRadioButton("male");
        rbf = new JRadioButton("female");
        bg.add(rbm);
        bg.add(rbf);

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weighty = 0;
        add(nameLab, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 0;
        add(occupLab, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weighty = 0;
        list.setPreferredSize(new Dimension(name.getPreferredSize().width, 60));
        gbc.anchor = GridBagConstraints.NORTHEAST;
        add(ageLab, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weighty = 0;
        add(name, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weighty = 0;
        add(occupation, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(empLab, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weighty = 0;
        add(employment, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weighty = 0;
        add(list, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weighty = 0;
        add(citLab, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(citizen, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(taxLab, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weighty = 0;
        add(tax, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weighty = 0;
        add(gender, gbc);

        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(rbm, gbc);

        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(rbf, gbc);

        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(ok, gbc);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton clickedButton = (JButton) actionEvent.getSource();
                FormEvent ev = new FormEvent(clickedButton, name.getText(), occupation.getText(), list.listAge.getSelectedIndex(),
                        comboList[employment.getSelectedIndex()], tax.getText(), citizen.isSelected(), gender.getText());
                controller.addPerson(ev);
            }
        };
        ok.addActionListener(al);
    }

    public void setTextListener(StringListener textListener) {
        sl = textListener;
    }


}
