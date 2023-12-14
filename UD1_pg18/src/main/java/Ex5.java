import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex5 extends JFrame {
	private JTextArea ta;
	private JTextField tf;
	private JScrollPane sPan;

	public Ex5() {
		setLayout(new BorderLayout());
		ta = new JTextArea(5, 15);
		tf = new JTextField(5);
		sPan = new JScrollPane(ta);
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		add(tf, BorderLayout.PAGE_START);
		add(ta, BorderLayout.CENTER);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField textF = (JTextField) e.getSource();
				ta.append(" "+textF.getText());
				tf.selectAll();
			}
		};

		tf.addActionListener(al);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
