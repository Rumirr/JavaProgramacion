import java.awt.*;
import javax.swing.*;

public class Ejemplo12 extends JFrame{

	public static void main(String[] args) {
		new Ejemplo12();		
	}
	
	public Ejemplo12() {
		
		setTitle("Actividad");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
	
		ImageIcon imgPlay = new ImageIcon("assets/black/mdpi/ic_action_playback_play.png");
		ImageIcon imgPause = new ImageIcon("assets/black/mdpi/ic_action_playback_pause.png");
		ImageIcon imgNext = new ImageIcon("assets/black/mdpi/ic_action_playback_next.png");
		ImageIcon imgPrev = new ImageIcon("assets/black/mdpi/ic_action_playback_prev.png");
		ImageIcon imgStop = new ImageIcon("assets/black/mdpi/ic_action_playback_stop.png");
		ImageIcon imgSave = new ImageIcon("assets/black/mdpi/ic_action_save.png");
		
		JButton btnPlay = new JButton(imgPlay);
		JButton btnPause = new JButton(imgPause);
		JButton btnNext = new JButton(imgNext);
		JButton btnPrev = new JButton(imgPrev);
		JButton btnStop = new JButton(imgStop);
		JButton btnSave = new JButton(imgSave);
		
		JToolBar barra = new JToolBar();
		barra.add(btnPrev);
		barra.add(btnPause);
		barra.add(btnPlay);
		barra.add(btnStop);
		barra.add(btnNext);
		barra.addSeparator();
		barra.add(btnSave);
		
		add(barra, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
}
