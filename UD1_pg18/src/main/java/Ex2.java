import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*2. Crea unha aplicación que conteña unha caixa de texto non editable e un botón. A
caixa de texto mostrará inicialmente o valor 0. Cada vez que se pulse o botón debe
actualizarse o campo de texto sumando un ao valor existente, de tal forma que
mostre información do número de veces que se pulsou o botón. Ademais, engade
outro botón á aplicación para reinicializar o contador da caixa de texto a 0.*/
public class Ex2 extends JFrame {

	private JButton btnInc;
	private JButton btnRes;
	private JTextField txtF;

	public Ex2() {
		setLayout(new FlowLayout());
		btnInc = new JButton("+");
		btnRes = new JButton("RESTART");
		txtF = new JTextField("0", 15);
		txtF.setEditable(false);

		add(txtF);
		add(btnRes);
		add(btnInc);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton origen = (JButton) e.getSource();
				int valorTxt = Integer.valueOf(txtF.getText());
				if (origen == btnInc) {
					valorTxt++;
					txtF.setText(String.valueOf(valorTxt));
				} else if (origen == btnRes) {
					txtF.setText("0");
				}
			}
		};

		btnRes.addActionListener(al);
		btnInc.addActionListener(al);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}