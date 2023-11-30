import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

/*
7. Crea unha aplicación con unha etiqueta e unha caixa de texto para escribir un
código postal. Utiliza un JFormattedTextField configurado para poder introducir só un
número de 5 cifras.*/

public class Ex7 extends JFrame {
	JFormattedTextField ftf1;
	JButton btn;
	MaskFormatter mf = new MaskFormatter("#####");
	public Ex7() {

		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
