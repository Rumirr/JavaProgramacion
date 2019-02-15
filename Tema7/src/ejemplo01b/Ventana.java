package ejemplo01b;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	public static void main(String[] args) {
		
		Ventana miVentana = new Ventana();
	}
	
	public Ventana() {
		
		setTitle("Hola, Mundo!");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
}
