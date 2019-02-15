import java.awt.*;
import javax.swing.*;

public class Ejemplo14 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo14();
	}

	public Ejemplo14() {

		setTitle("Título de la ventana");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] peliculasFav = { "El padrino", "La lista de Schindler", "Cadena perpetua", "El caballero oscuro",
				"Coco", "Forrest Gump", "Pulp Fiction", "Intocable", "El Rey León", "Bohemian Rhapsody" };

		JList<String> lstPeliculasFav = new JList<>(peliculasFav);
		
		JScrollPane scrPeliculasFav = new JScrollPane(lstPeliculasFav);
		
		
		add(scrPeliculasFav);
		
		setVisible(true);
	}

}
