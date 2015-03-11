package pikachu;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderFrame extends JFrame implements ActionListener {
	
	private final JSlider slid;
	private StretchableImage image;
	private Timer timer;
	private double size;
	
	public SliderFrame() {
		
		JPanel northPanel = new JPanel();
		slid = new JSlider(0, 200);
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
		
		size=0;
		timer = new Timer(16, this);
		timer.start();
		
		pack();
	}

	public void actionPerformed(ActionEvent e) {
		if(size<150){
		size++;
		image.setXScaleFactor((double)size/100);
		image.setYScaleFactor((double)size/100);
		}
		else{
			size=0;
		}
			

	}
}
