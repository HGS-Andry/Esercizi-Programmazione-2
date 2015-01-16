package pikachu;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderFrame extends JFrame {

	public SliderFrame() {
		JPanel northPanel = new JPanel();
		northPanel.add (new JSlider(1, 10));
		add(northPanel, BorderLayout.NORTH);
		pack();
	}
}
