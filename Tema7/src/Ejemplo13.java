import java.awt.*;
import javax.swing.*;

public class Ejemplo13 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo13();
	}

	public Ejemplo13() {

		setTitle("Radios en Mallorca");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Array con las opciones que se mostrarán en el JLIst.
		String[] opciones = { "RNE", "Radio Clásica", "Radio 3", "Radio 5", "COPE", "Onda Cero", "SER", "M80", "Kiss FM", "Rock FM", "Hit FM" };

		JList<String> lstRadios = new JList<String>(opciones);

		JScrollPane scrRadios = new JScrollPane(lstRadios);

		add(scrRadios);

		setVisible(true);
	}

}
