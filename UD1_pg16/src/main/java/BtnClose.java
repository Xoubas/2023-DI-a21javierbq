import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BtnClose extends JFrame {

	/*
	 * 1. Crea un novo frame que conteña un botón, de tal forma que cando se pulse
	 * se saia da aplicación.
	 */

	JButton btn;

	public BtnClose() {
		setLayout(new FlowLayout());

		btn = new JButton("CLOSE");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		add(btn, FlowLayout.CENTER);
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}