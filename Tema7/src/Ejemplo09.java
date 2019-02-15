import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo09 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo09();
	}

	public Ejemplo09() {

		setTitle("Pruebas con paneles de diálogo");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setPreferredSize(new Dimension(100,100));
		btnMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo", "Error de entrada y salida", JOptionPane.ERROR_MESSAGE);
				
				//JOptionPane.showConfirmDialog(null, "¿Deseas ingresar dinero?", "Cajero automático", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			
//				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas apagar el motor?", "Motor", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//				
//				
//				if (respuesta == JOptionPane.YES_OPTION) {
//					System.out.println("Has elegido apagar el motor.");
//				} else {
//					System.out.println("Has eligido no apagar el motor.");
//				}
				
				//String respuesta = JOptionPane.showInputDialog(null, "Email:", "Datos personales", JOptionPane.QUESTION_MESSAGE);
				
//				String respuesta = JOptionPane.showInputDialog(null, "Peso del producto:", "Información del producto", JOptionPane.QUESTION_MESSAGE);
//				
//				JOptionPane.showMessageDialog(null, "El peso del producto es: " + respuesta, "Peso del producto", JOptionPane.INFORMATION_MESSAGE);
			
			
//				String opciones[]= {"Mp4", "Ogg", "DivX", "Mkv", "Avi"};
//				
//				int formato = JOptionPane.showOptionDialog(null, "Elija el formato de salida:", "Exportar video",0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
//				
//				JOptionPane.showMessageDialog(null, "Se ha eligido el formato: " + opciones[formato], "Formato de exportación", JOptionPane.INFORMATION_MESSAGE);
			
			
			}
		});
		
		add(btnMostrar);
		
		
		setVisible(true);
	}

}
