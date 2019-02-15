import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo01b extends JFrame {

	public static void main(String[] args) {

		Ejemplo01b miVentana = new Ejemplo01b();

	}

	public Ejemplo01b() {

		// Indicamos el tamaño de la ventana.
		setSize(400, 300);

		// Título de la ventana.
		setTitle("Reproductor");

		// Indicamos que cuando el usuario pulse el botón de cerrar, el programa termine.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// El layout de flowLayout hará que los componentes que añadamos a la ventana se
		// coloquen en filas de izquierda a derecha.		
		// Asignamos el layout al JFrame.
		setLayout(new FlowLayout());

		
		// Creamos tres botones.
		JButton btnPlay = new JButton("Play");
		JButton btnPause = new JButton("Pause");
		JButton btnStop = new JButton("Stop");

		// Añadimos los botones a la ventana
		add(btnPlay);
		add(btnPause);
		add(btnStop);

		// Hacemos visible el JFrame.
		setVisible(true);

	}

}
