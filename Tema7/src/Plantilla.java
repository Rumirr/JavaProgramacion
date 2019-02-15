import java.awt.*;
import javax.swing.*;

public class Plantilla extends JFrame{

	public static void main(String[] args) {
		new Plantilla();		
	}
	
	public Plantilla() {
		
		setTitle("Título de la ventana");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
	
		
		setVisible(true);
	}
	
}
