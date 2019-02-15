import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06 extends JFrame{

	public static void main(String[] args) {
		Ejemplo06 ejemplo06 = new Ejemplo06();
	}
	
	
	public Ejemplo06() {
		
		setTitle("Directores de cine");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblListaDirectores = new JLabel();
		
		JComboBox<String> cmbListaDirectores = new JComboBox<String>();
		cmbListaDirectores.addItem("John Badham");
		cmbListaDirectores.addItem("Steven Lisberger");
		cmbListaDirectores.addItem("Peter Jackson");
		cmbListaDirectores.addItem("Woody Allen");
		
		add(lblListaDirectores);
		add(cmbListaDirectores);
		
		setVisible(true);
	}
}
