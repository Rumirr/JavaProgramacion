import java.awt.*;
import javax.swing.*;

public class Ejemplo11 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo11();
	}

	public Ejemplo11() {

		setTitle("Barra de Herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		ImageIcon imgGuardarTodo = new ImageIcon("iconos/86.png");
		ImageIcon imgImprimir = new ImageIcon("iconos/87.png");

		JButton btnNuevo = new JButton(imgNuevo);
		JButton btnGuardar = new JButton(imgGuardar);
		JButton btnAbrir = new JButton(imgAbrir);
		JButton btnGuardarTodo = new JButton(imgGuardarTodo);
		JButton btnImprimir = new JButton(imgImprimir);

		JToolBar barra = new JToolBar();
		barra.add(btnNuevo);
		barra.add(btnGuardar);
		barra.add(btnAbrir);
		barra.add(btnGuardarTodo);
		barra.addSeparator();
		barra.add(btnImprimir);
		
		JTextArea txtArea = new JTextArea(10,30);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		
		JScrollPane scrTextArea = new JScrollPane(txtArea);
		
		add(barra, BorderLayout.NORTH);
		add(scrTextArea, BorderLayout.CENTER);

		setVisible(true);
	}

}
