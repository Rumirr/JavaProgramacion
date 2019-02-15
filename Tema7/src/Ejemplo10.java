import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejemplo10 extends JFrame {

	public static void main(String[] args) {
		new Ejemplo10();
	}

	public Ejemplo10() {

		setTitle("Volumen de música");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JSlider sldVolumen = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
		sldVolumen.setPreferredSize(new Dimension(500,200));
		sldVolumen.setPaintTicks(true);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setMajorTickSpacing(10);
		sldVolumen.setMinorTickSpacing(10);
		
		add(sldVolumen);

		setVisible(true);
	}
}
