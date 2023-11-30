
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex3 extends JFrame {

	JTextField data;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton dec;
	JButton eq;
	JButton add;
	JButton sub;
	JButton mult;
	JButton div;
	JPanel buttons;

	public Ex3() {
		setLayout(new BorderLayout());
		data = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		dec = new JButton(".");
		eq = new JButton("=");
		add = new JButton("+");
		sub = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		buttons = new JPanel();

		buttons.setLayout(new GridLayout(4, 4));
		add(data, BorderLayout.NORTH);
		add(buttons, BorderLayout.CENTER);
		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);
		buttons.add(div);
		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);
		buttons.add(mult);
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(sub);
		buttons.add(b0);
		buttons.add(dec);
		buttons.add(eq);
		buttons.add(add);

		setVisible(true);
		setSize(250, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
