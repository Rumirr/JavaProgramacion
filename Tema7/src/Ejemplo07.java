import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Ejemplo07 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo07();
	}

	public Ejemplo07() {

		setTitle("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblOpnion = new JLabel("Escribe tu opnión:");

		JTextArea txtOpinion = new JTextArea(10, 30);
		txtOpinion.setLineWrap(true); // para que salte de linea (automaticamente) cuando llegue al limite del textArea
		txtOpinion.setWrapStyleWord(true); // para que la palabra no se corte cuando llegue al limite del textArea

		JScrollPane scrOpnion = new JScrollPane(txtOpinion);
		scrOpnion.setPreferredSize(new Dimension(380, 220));

		add(lblOpnion);
		add(scrOpnion);

		setVisible(true);
	}

}
