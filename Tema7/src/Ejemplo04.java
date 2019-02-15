import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ejemplo04 extends JFrame{

	public static void main(String[] args) {
		
		Ejemplo04 ejemplo04 = new Ejemplo04();
		
	}
	
	
	public Ejemplo04() {
		
		setTitle("Películas preferidas");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JRadioButton rdJuegosDeGuerra = new JRadioButton("Juegos de guerra");
		rdJuegosDeGuerra.setSelected(true);
		
		JRadioButton rdTron = new JRadioButton("Tron");
		JRadioButton rdElSenyorDelAnillos = new JRadioButton("El señor de los anillos");
		JRadioButton rdWarHorse = new JRadioButton("Caballo de guerra");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdWarHorse);
		grupo.add(rdElSenyorDelAnillos);
		grupo.add(rdTron);
		grupo.add(rdJuegosDeGuerra);
		
		
		add(rdJuegosDeGuerra);
		add(rdTron);
		add(rdElSenyorDelAnillos);
		add(rdWarHorse);
		
		setVisible(true);
	}
	
	
}
