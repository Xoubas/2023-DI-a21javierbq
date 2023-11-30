package org.example;

import javax.swing.*;
import java.awt.*;

public class AgeCategory extends JPanel {
    JList<String> list;
    JScrollPane sp;

    AgeCategory() {
        setLayout(new BorderLayout());
        //List definition and model
        DefaultListModel<String> model = new DefaultListModel<String>();
        model.addElement("Under 18");
        model.addElement("18 to 65");
        model.addElement("65 or over");
        list = new JList<String>();
        list.setModel(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);

        //Panels

        sp = new JScrollPane(list);
        add(sp);
    }
}

