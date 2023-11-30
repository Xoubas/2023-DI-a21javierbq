/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

/**
 *
 * @author a21gonzalocm
 */
public class FormPanel extends JPanel {

    private JPanel pane;
    private Border innerBorder;
    private Border outerBorder;
    private JLabel jlName;
    private JLabel jlOcc;
    private JTextField jtfName;
    private JTextField jtfOcc;
    private JButton okBtn;
    private FormListener fl;
    private JLabel jlEdad;
    private JList listaEdades;
    private DefaultListModel modeloEdad;
    private JScrollPane scrollPane;
    private JLabel jlEmpleo;
    private JComboBox jcbEmpleo;
    private JLabel jlUSctz;
    private JCheckBox jcheckB;
    private JLabel jltaxID;
    private JTextField jtfTaxID;
    private JLabel jlGender;
    private ButtonGroup btnGroup;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;

    public FormPanel() {

        setLayout(new BorderLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        pane = new JPanel(new GridBagLayout());
        jlName = new JLabel("Name:");
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.weighty = 0;
        pane.add(jlName, gbc);
        jlOcc = new JLabel("Occupation:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        pane.add(jlOcc, gbc);
        jtfName = new JTextField();
        jtfName.setColumns(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        pane.add(jtfName, gbc);
        jtfOcc = new JTextField();
        jtfOcc.setColumns(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 0;
        pane.add(jtfOcc, gbc);

        jlEdad = new JLabel("Age:");
        modeloEdad = new DefaultListModel();
        modeloEdad.addElement(new AgeCategory(0, "Under 18"));
        modeloEdad.addElement(new AgeCategory(1, "18 to 65"));
        modeloEdad.addElement(new AgeCategory(2, "65 or over"));
        listaEdades = new JList(modeloEdad);
        listaEdades.setPreferredSize(new Dimension(152, 80));
        scrollPane = new JScrollPane(listaEdades);
        listaEdades.setVisibleRowCount(3);
        listaEdades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        pane.add(jlEdad, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        pane.add(scrollPane, gbc);

        jlEmpleo = new JLabel("Employment :");
        jcbEmpleo = new JComboBox<>();

        jcbEmpleo.addItem("employed");
        jcbEmpleo.addItem("self-employed");
        jcbEmpleo.addItem("unemployed");
        jcbEmpleo.setEditable(true);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 0;

        pane.add(jlEmpleo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weighty = 0;

        pane.add(jcbEmpleo, gbc);

        jlUSctz = new JLabel("US Citizen:");
        jcheckB = new JCheckBox();

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        pane.add(jlUSctz, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        pane.add(jcheckB, gbc);

        jltaxID = new JLabel("Tax ID:");
        jtfTaxID = new JTextField();
        jtfTaxID.setColumns(15);
        jtfTaxID.setEnabled(false);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        pane.add(jltaxID, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        pane.add(jtfTaxID, gbc);

        jlGender = new JLabel("Gender:");
        btnGroup = new ButtonGroup();
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        btnGroup.add(rbMale);
        btnGroup.add(rbFemale);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        pane.add(jlGender, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        pane.add(rbMale, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        pane.add(rbFemale, gbc);

        okBtn = new JButton("OK");
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

        pane.add(okBtn, gbc);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton clickedButton = (JButton) e.getSource();
                String tNome = jtfName.getText();
                String tOccupation = jtfOcc.getText();
                AgeCategory ac = (AgeCategory) listaEdades.getSelectedValue();
                String tEmployment = jcbEmpleo.getSelectedItem().toString();
                String tTaxID = jtfTaxID.getText();
                String genero = "";
                if (rbMale.isSelected()) {
                    genero = rbMale.getText();
                } else {
                    genero = rbFemale.getText();
                }
                Boolean checkUS = jcheckB.isSelected();

                if (clickedButton == okBtn) {
                    FormEvent formEvent = new FormEvent(this, tNome, tOccupation, ac.getId(), tEmployment, checkUS, tTaxID, genero);
                    fl.dataFormEmitted(formEvent);
                }
            }
        };

        jcheckB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jtfTaxID.setEnabled(true);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    jtfTaxID.setEnabled(false);
                }
            }
        });

        okBtn.addActionListener(al);
        innerBorder = BorderFactory.createTitledBorder("Add Person");
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        pane.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        add(pane, BorderLayout.CENTER);
    }

    public void setFormListener(FormListener textListener) {
        fl = textListener;
    }
}
