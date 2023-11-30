import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ex4 extends JFrame {
    JPanel form;
    JLabel nameLab;
    JLabel occupLab;
    JTextField name;
    JTextField occupation;
    JButton ok;
    GridBagConstraints gbc = new GridBagConstraints();

    public Ex4() {
        form = new JPanel(new GridBagLayout());
        nameLab = new JLabel("Name: ");
        occupLab = new JLabel("Occupation: ");
        name = new JTextField(10);
        occupation = new JTextField(10);
        ok = new JButton("OK");

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        form.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        add(form);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weighty = 0;
        form.add(nameLab, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 0;
        form.add(occupLab, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weighty = 0;
        form.add(name, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weighty = 0;
        form.add(occupation, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        form.add(ok, gbc);

        setVisible(true);
        setSize(250, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
