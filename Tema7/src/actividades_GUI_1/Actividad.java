package actividades_GUI_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Actividad extends JFrame {

	public static void main(String[] args) {
		new Actividad();
	}

	public Actividad() {

		setTitle("Actividad GIU 1");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Ejercicio 1
				// JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?",
				// "Confirmación de formateo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

				// Ejercicio 2
				// JOptionPane.showInputDialog(null, "Escribe tu DNI:", "Confirmación de identidad", JOptionPane.QUESTION_MESSAGE);

				// Ejercicio 3
				// JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desd la IP 192.168.1.51", "Alerta de seguridad", JOptionPane.WARNING_MESSAGE);

				// Ejercicio 4
				//String[] series = { "Futurama", "Los Simpson", "Héroes" };

				//JOptionPane.showOptionDialog(null, "Has clic en tu serie favorita", "Elección de serie", 0,	JOptionPane.INFORMATION_MESSAGE, null, series, series[2]);
				
				// Ejercicio 5
				String[] servidoresWeb = {"Apache", "IIS", "Nginx", "Node.JS"};
				
				JOptionPane.showOptionDialog(null, "¿Qué servidor web desea para su hosting?", "Eleccioón de servidor web", 0, JOptionPane.INFORMATION_MESSAGE, null, servidoresWeb, servidoresWeb[1]);
				
			}
		});

		add(btnMostrar);

		setVisible(true);
	}

}
