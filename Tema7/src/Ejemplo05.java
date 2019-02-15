import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo05 extends JFrame{

	public static void main(String[] args) {
		Ejemplo05 ejemplo05 = new Ejemplo05();
	}
	
	public Ejemplo05() {
		
		setTitle("Lista de películas");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblSelecciona = new JLabel("Elige una película:");
		
		JComboBox<String> cmbListaPeliculas = new JComboBox<>();
		cmbListaPeliculas.setPreferredSize(new Dimension(260,40));
		
		cmbListaPeliculas.addItem("Juegos de guerra");
		cmbListaPeliculas.addItem("Tron");
		cmbListaPeliculas.addItem("El Señor de los anillos");
		cmbListaPeliculas.addItem("War horse");
		
		
		add(lblSelecciona);
		add(cmbListaPeliculas);
		
		setVisible(true);
	}
	
}
