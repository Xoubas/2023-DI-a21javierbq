import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.text.Position;

/*
 * 1. Crea un novo frame que conteña dúas caixas de texto, un botón co texto
 * “Sumar” e unha etiqueta. Programa a funcionalidade da aplicación para que
 * cando se pulse o botón “Sumar” a etiqueta mostre o resultado de sumar os dous
 * números existentes nas caixas de texto.
 */
public class Ex1 extends JFrame {

	private JTextField tf1;
	private JTextField tf2;
	private JLabel res;
	private JButton btn;
	private JPanel pan;

	public Ex1() {
		btn = new JButton("Add");
		res = new JLabel("Result: ");
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		pan = new JPanel();

		add(pan);
		pan.add(tf1);
		pan.add(tf2);
		pan.add(btn);
		pan.add(res);

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.valueOf(tf1.getText());
				int n2 = Integer.valueOf(tf2.getText());
				int result = n1 + n2;
				res.setText(String.valueOf(result));
			}
		});

		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
	}
}