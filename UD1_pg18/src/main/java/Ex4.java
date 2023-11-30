import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*4. Crea unha aplicación que conteña un área de texto con 5 filas e 20 columnas.
Executa a aplicación e comproba que pasa cando escribes máis liñas das que se
ven en pantalla.
Modifica a aplicación para que a área de texto estea dentro dun scrollPane, de forma
que aparezan as barras de scroll cando o contido do texto supere a área visible.
Comproba tamén que pasa cando a liña que escribes é máis grande que as
columnas visibles en pantalla.
Busca como facer para que cando o texto dunha liña sexa máis grande que o
número de columnas, o texto pase automáticamente á liña de abaixo. Configúraa
para que as palabras non se rompan.*/

public class Ex4 extends JFrame {
	private JTextArea ta;
	private JScrollPane pan;

	public Ex4() {
		ta = new JTextArea(5, 15);
		pan = new JScrollPane(ta);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		add(pan);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
