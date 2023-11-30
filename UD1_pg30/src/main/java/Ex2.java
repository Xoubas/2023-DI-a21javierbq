import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex2 extends JFrame {
	/*
	 * 2. Como ampliación e modificación do exercicio anterior, substitúe a área de
	 * texto da parte central por un panel con un CarLayout de 3 cartas (3 paneis de
	 * diferentes cores, as que ti queiras). Engade aos botóns laterais a
	 * funcionalidade que permita moverse polas diferentes cartas. Así, os botóns
	 * deben permitir moverse á carta anterior, primeira, segunda, terceira e
	 * seguinte. Adecúa o texto do botón á súa funcionalidade.
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
	JButton next;
	JButton previous;
	JPanel panR;
	JPanel panL;

	JPanel panC;
	JPanel card1 = new JPanel();
	JPanel card2 = new JPanel();
	JPanel card3 = new JPanel();

	public Ex2() {
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
		next = new JButton("Next");
		previous = new JButton("Previous");
		panL = new JPanel(new GridLayout(7, 1));
		panR = new JPanel(new GridLayout(5, 1));

		// CardLayout and colors
		panC = new JPanel(new CardLayout());

		card1.setBackground(Color.RED);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(Color.BLUE);

		panC.add(card1, "red");
		panC.add(card2, "yellow");
		panC.add(card3, "blue");

		// Add buttons
		panL.add(next);
		panL.add(b1);
		panL.add(b2);
		panL.add(b3);
		panL.add(b4);
		panL.add(b5);
		panL.add(previous);
		panR.add(b6);
		panR.add(b7);
		panR.add(b8);
		panR.add(b9);
		panR.add(b10);

		ActionListener al = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				CardLayout cl = (CardLayout) panC.getLayout();

				if (b == (b1))
					cl.show(panC, "red");

				if (b == (b2))
					cl.show(panC, "yellow");

				if (b == (b3))
					cl.show(panC, "blue");

				if (b == previous)
					cl.previous(panC);

				if (b == next)
					cl.next(panC);
			}
		};

		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		next.addActionListener(al);
		previous.addActionListener(al);

		add(panL, BorderLayout.LINE_START);
		add(panR, BorderLayout.LINE_END);
		add(panC, BorderLayout.CENTER);
		setVisible(true);
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
