import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    JList<String> list;
    JScrollPane sp;
    JButton btnDelete;
    JTextField tfName;
    JButton btnAd;
    JPanel pTop;
    JPanel pBot;

    MainFrame() {
        setLayout(new BorderLayout());
        //List definition and model
        DefaultListModel<String> model = new DefaultListModel<String>();
        model.addElement("Ada");
        model.addElement("Erea");
        model.addElement("Navia");
        list = new JList<String>();
        list.setModel(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);

        //Panels
        pTop = new JPanel();
        pBot = new JPanel();
        pBot.setLayout(new GridLayout(1, 3, 5, 1));
        add(pTop, BorderLayout.PAGE_START);
        add(pBot, BorderLayout.CENTER);

        sp = new JScrollPane(list);
        sp.setPreferredSize(new Dimension(400, 200));
        pTop.add(sp);

        btnDelete = new JButton("Delete");
        tfName = new JTextField(7);
        btnAd = new JButton("Add");
        btnAd.setEnabled(false);
        pBot.add(btnDelete);
        pBot.add(tfName);
        pBot.add(btnAd);
        pBot.setBorder(new EmptyBorder(10, 10, 10, 10));

        //ActionListeners
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
                    int index = list.getSelectedIndex();
                    model.remove(index);
                    list.setSelectedIndex(Math.min(index, model.getSize() - 1));
                }

                if (model.getSize() <= 0)
                    btnDelete.setEnabled(false);
            }
        });

        tfName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButton();
            }

            public void updateButton() {
                btnAd.setEnabled(!tfName.getText().isEmpty());
            }
        });

        btnAd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                int position = list.getSelectedIndex() + 1;
                model.add(position, name);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
