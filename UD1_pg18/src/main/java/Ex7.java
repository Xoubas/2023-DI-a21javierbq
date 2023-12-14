import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

/*
7. Crea unha aplicación con unha etiqueta e unha caixa de texto para escribir un
código postal. Utiliza un JFormattedTextField configurado para poder introducir só un
número de 5 cifras.*/

public class Ex7 extends JFrame {
    JFormattedTextField postalCode;
    JLabel label;
    MaskFormatter mf;

    public Ex7() {
        setLayout(new FlowLayout());
        label = new JLabel("Postal code");
        try {
            mf = new MaskFormatter("#####");
            postalCode = new JFormattedTextField(mf);
            postalCode.setColumns(6);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        add(label);
        add(postalCode);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
