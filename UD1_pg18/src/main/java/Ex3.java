import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				String password = String.valueOf(pass.getPassword());

				if (password.equals(user.getText()))
					b.setBackground(Color.GREEN);

				else
					b.setBackground(Color.RED);
			}
		});

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}