package pikachu;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import java.awt.Font;

public class SliderFrame extends JFrame {
	
	private final JSlider slid;
	private StretchableImage image;
	public SliderFrame() {
		
		JPanel northPanel = new JPanel();
		slid = new JSlider(0, 500);
		slid.addChangeListener(event -> {
			image.setXScaleFactor((double)slid.getValue()/100);
			image.setYScaleFactor((double)slid.getValue()/100);
			pack();
		});
		northPanel.add (slid);
		add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,1));
		ButtonGroup gruppo= new ButtonGroup();
		
		JRadioButton hor=new JRadioButton("Strech Pikachu image horizontally");		
		JRadioButton vert=new JRadioButton("Strech Pikachu image vertically");

		gruppo.add(hor);
		gruppo.add(vert);
		
		centerPanel.add (hor);
		centerPanel.add (vert);
		
		add(centerPanel,BorderLayout.CENTER);
		
		JPanel southPanel= new JPanel();
		image= new StretchableImage(new ImageIcon("pika.png").getImage());
		southPanel.add(image);
		
		add(southPanel, BorderLayout.SOUTH);
		pack();
	}
}
