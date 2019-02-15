import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo08 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo08();
	}

	public Ejemplo08() {

		setTitle("Comentarios");
		setSize(400, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JLabel lblEmail = new JLabel("Email:");
		JTextField txtEmail = new JTextField(20);

		JCheckBox chkSuscribirse = new JCheckBox("Quiero suscribirme");

		JLabel lblOpinionGeneral = new JLabel("Opinión general");

		JComboBox<String> cmbOpnion = new JComboBox<String>();
		cmbOpnion.addItem("Bien");
		cmbOpnion.addItem("Regular");
		cmbOpnion.addItem("Mal");

		JLabel lblOpnion = new JLabel("Escribe tu opnión:");

		JTextArea txtOpinion = new JTextArea(10, 30);

		JScrollPane scrOpinion = new JScrollPane(txtOpinion);
		scrOpinion.setPreferredSize(new Dimension(380, 220));

		JButton btnAceptar = new JButton("Aceptar");

		add(lblEmail);
		add(txtEmail);
		add(chkSuscribirse);
		add(lblOpinionGeneral);
		add(cmbOpnion);
		add(lblOpnion);
		add(scrOpinion);
		add(btnAceptar);

		setVisible(true);
	}

}
