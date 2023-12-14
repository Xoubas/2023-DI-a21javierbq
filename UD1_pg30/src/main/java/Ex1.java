import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex1 extends JFrame {
	/*
	 * 1. Crea unha interface utilizando o BorderLayout que teña 5 botóns na zona
	 * esquerda e outros 5 na zona dereita. Os botóns deben estar colocados en
	 * vertical e ter todos o mesmo ancho, independentemente do texto que conteñan.
	 * Engade á interface un título co contido que queiras na zona de arriba
	 * (norte), un pé abaixo centrado (sur) que inclúa o teu nome e un jTextArea no
	 * espacio central (centro).
	 */
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JTextArea ta;
	JPanel panr;
	JPanel panl;

	public Ex1() {

		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		b5 = new JButton("B5");
		b6 = new JButton("B6");
		b7 = new JButton("B7");
		b8 = new JButton("B8");
		b9 = new JButton("B9");
		b10 = new JButton("B10");
		ta = new JTextArea();
		ta.setWrapStyleWord(true);
		ta.setLineWrap(true);
		panl = new JPanel(new GridLayout(5,1));
		panr = new JPanel(new GridLayout(5,1));

		panr.add(b1);
		panr.add(b2);
		panr.add(b3);
		panr.add(b4);
		panr.add(b5);
		panl.add(b6);
		panl.add(b7);
		panl.add(b8);
		panl.add(b9);
		panl.add(b10);

		add(panl, BorderLayout.LINE_START);
		add(panr, BorderLayout.LINE_END);
		add(ta,BorderLayout.CENTER);
		setVisible(true);
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
