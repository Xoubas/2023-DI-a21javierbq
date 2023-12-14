import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/*3. Crea unha aplicación que teña unha etiqueta, un campo de contrasinal e un botón.
Debe comprobarse se o contrasinal escrito coincide co un que ti escollas. Esta
comprobación farase ao pulsar o botón e tamén ao pulsar a tecla ENTER cando o
campo contrasinal ten o foco. Se os contrasinais coinciden o fondo do panel de
contido cambiará a cor verde e se non coinciden porase de cor vermella. Debe
usarse un único Listener.*/
public class Ex3 extends JFrame {

    private JPasswordField pass;
    private JTextField user;
    private JButton btn;
    private JPanel pan;

    public Ex3() {
        setLayout(new FlowLayout());
        pass = new JPasswordField(15);
        user = new JTextField(15);
        btn = new JButton("OK");
        pan = new JPanel(new FlowLayout(FlowLayout.CENTER));

        add(pan);
        pan.add(user);
        pan.add(pass);
        pan.add(btn);

        pass.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
                    checkPassword();
                }
            }        private void checkPassword(){
            if (String.valueOf(pass.getPassword()).equals(user.getText()))
                btn.setBackground(Color.GREEN);

            else
                btn.setBackground(Color.RED);
        }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                checkPassword();
            }
        });


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void checkPassword() {
        if (String.valueOf(pass.getPassword()).equals(user.getText()))
            btn.setBackground(Color.GREEN);

        else
            btn.setBackground(Color.RED);
    }
}