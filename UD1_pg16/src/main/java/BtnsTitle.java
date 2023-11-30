import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnsTitle extends JFrame {
//	2. Crea un novo frame con FlowLayout que teña tres botóns. Ao pulsar cada botón
//	debe cambiarse o título do frame informando do botón pulsado. Debes utilizar un
//	único Listener.

	JButton btn1;
	JButton btn2;
	JButton btn3;

	public BtnsTitle() {
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

		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
