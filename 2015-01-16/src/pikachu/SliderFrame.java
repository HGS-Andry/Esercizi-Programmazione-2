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

	public SliderFrame() {
		JPanel northPanel = new JPanel();
		northPanel.add (new JSlider(1, 10));
		add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,1));
		ButtonGroup gruppo= new ButtonGroup();
		/*
		JRadioButton hor=new JRadioButton("Strech Pikachu image horizontally");		
		JRadioButton vert=new JRadioButton("Strech Pikachu image vertically");

		gruppo.add(hor);
		gruppo.add(vert);
		
		centerPanel.add (hor);
		centerPanel.add (vert);
		*/
		
		//addRadioButton
		
		add(centerPanel,BorderLayout.CENTER);
		
		JPanel southPanel= new JPanel();
		southPanel.add(new StretchableImage(new ImageIcon("pika.png").getImage()));
		
		add(southPanel, BorderLayout.SOUTH);
		pack();
	}
}
