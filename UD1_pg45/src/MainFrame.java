import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    JList list;
    JScrollPane sp;
    JButton btnDelete;
    JTextField tfElement;
    JButton btnAd;
    GridBagConstraints gbc = new GridBagConstraints();

    MainFrame() {
        setLayout(new GridBagLayout());
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        modelo.addElement("Ada");
        modelo.addElement("Erea");
        modelo.addElement("Navia");

        list = new JList<String>(modelo);
        sp = new JScrollPane(list);
        btnDelete = new JButton("Delete");
        tfElement = new JTextField(7);
        btnAd = new JButton("Add");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        add(sp, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(btnDelete, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(tfElement, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(btnAd, gbc);

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = list.getSelectedIndex();
                modelo.remove(index);
            }
        });

        btnAd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = tfElement.getText();

                if (!s.equals(null) && !s.equals(""))
                    modelo.addElement(s);
            }
        });

        setTitle("JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }
}
