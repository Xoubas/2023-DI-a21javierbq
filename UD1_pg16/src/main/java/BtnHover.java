import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnHover extends JFrame {
	/*
	 * Modifica o frame anterior para que cando o rato pase por riba dun botón este
	 * cambie a cor de fondo. E cando o rato deixa de estar sobre o botón, este
	 * volve a ter a cor de fondo por defecto.
	 */
	JButton btn1;
	JButton btn2;
	JButton btn3;

	public BtnHover() {
		setLayout(new FlowLayout());

		btn1 = new JButton("BTN1");
		btn2 = new JButton("BTN2");
		btn3 = new JButton("BTN3");

		add(btn1);
		add(btn2);
		add(btn3);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				setTitle(command);
			}
		};

		MouseListener me = new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				if (b == btn1) {
					btn1.setBackground(null);
				} else if (b == btn2) {
					btn2.setBackground(null);
				} else {
					btn3.setBackground(null);
				}
			}

			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				if (b == btn1) {
					btn1.setBackground(Color.BLUE);
				} else if (b == btn2) {
					btn2.setBackground(Color.RED);
				} else {
					btn3.setBackground(Color.GREEN);
				}

			}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		};

		btn1.addMouseListener(me);
		btn2.addMouseListener(me);
		btn3.addMouseListener(me);

		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
