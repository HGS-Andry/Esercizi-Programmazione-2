package pikachu;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PikaMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new SliderFrame();
				frame.setTitle("Slider Test");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
