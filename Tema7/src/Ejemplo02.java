import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo02 extends JFrame{

	public static void main(String[] args) {
		
		Ejemplo02 ejemplo = new Ejemplo02();
		
	}
	
	public Ejemplo02() {
		
		setTitle("Campo de texto");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblPaginaWeb = new JLabel("Dirección página web:");
		JTextField txtPaginaWeb = new JTextField(30);
		JButton btnAceptar = new JButton("Aceptar");
		
		add(lblPaginaWeb);
		add(txtPaginaWeb);
		add(btnAceptar);
		
		
		setVisible(true);
	}
	
	
}
