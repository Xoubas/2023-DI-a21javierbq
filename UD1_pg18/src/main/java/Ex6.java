import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*6. Crea unha aplicación que conteña dous JFormattedTextField coas súas
correspondentes etiquetas e un botón. Configura unha das caixas de texto para que
teña números e a outra para que almacene unha data. Inicializa ambas caixas de
texto a un valor apropiado. A aplicación permitirá modificar os valores das caixas de
texto e cando se pulse o botón, imprimiranse por consola os seus valores.*/

public class Ex6 extends JFrame {
	JFormattedTextField ftf1;
	JFormattedTextField ftf2;
	JButton btn;

	// Get instance of the class because it's abstract <getInstance()>
	NumberFormat numF = NumberFormat.getInstance(Locale.US);
	DateFormat datF = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);

	public Ex6() {
		setLayout(new FlowLayout());
		ftf1 = new JFormattedTextField(numF);
		ftf1.setColumns(10);
		ftf2 = new JFormattedTextField(datF);
		ftf2.setColumns(10);
		btn = new JButton("Format");

		add(ftf1);
		add(ftf2);
		add(btn);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
