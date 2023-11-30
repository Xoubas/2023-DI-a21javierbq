package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class AgeCategory extends JPanel {
    JList<String> listAge;
    JScrollPane sp;

    AgeCategory() {
        setLayout(new BorderLayout());
        //listAge definition and model
        DefaultListModel<String> model = new DefaultListModel<String>();
        model.addElement("Under 18");
        model.addElement("18 to 65");
        model.addElement("65 or over");
        listAge = new JList<String>();
        listAge.setModel(model);
        listAge.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listAge.setSelectedIndex(0);

        //Panels

        sp = new JScrollPane(listAge);
        add(sp);
    }
}

