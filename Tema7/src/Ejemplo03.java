import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ejemplo03 extends JFrame {

	public static void main(String[] args) {

		Ejemplo03 ejemplo03 = new Ejemplo03();

	}

	public Ejemplo03() {

		setTitle("Películas preferidas");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JCheckBox chkJuegosDeGuera = new JCheckBox("Juegos de guerra");
		JCheckBox chkTron = new JCheckBox("Tron");
		JCheckBox chkElSenyorDeLosAnillos = new JCheckBox("El Señor de los anillos");
		JCheckBox chkWarHorse = new JCheckBox("Caballo de guerra");

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(chkJuegosDeGuera);
		grupo.add(chkTron);
		grupo.add(chkElSenyorDeLosAnillos);
		grupo.add(chkWarHorse);

		add(chkJuegosDeGuera);
		add(chkTron);
		add(chkElSenyorDeLosAnillos);
		add(chkWarHorse);

		setVisible(true);
	}

}
