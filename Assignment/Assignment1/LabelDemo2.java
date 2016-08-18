/**
* LabelDemo2.java 
*  - a stand-alone graphical applications 
* 		that displays 4 JLabels with descriptions and pictures
* @auther Kanako Kunieda (W77070774)
* @version 1.0
* @since 2016-08-16
*/

import java.awt.*;
import javax.swing.*;

public class LabelDemo2
{
	//-----------------------------------------------------------------
	// Creates and displays the primary application frame.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Label Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("ccsf-logo.gif");
		
		JLabel label1, label2, label3, label4;

		label1 = new JLabel("CCSF logo Below", icon, SwingConstants.CENTER);
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.TOP);
		
		label2 = new JLabel("CCSF Logo Above", icon, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		label3 = new JLabel("CCSF Logo Right", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.LEFT);
		label3.setVerticalTextPosition(SwingConstants.CENTER);

		label4 = new JLabel("CCSF Logo LEFT", icon, SwingConstants.CENTER);
		label4.setHorizontalTextPosition(SwingConstants.RIGHT);
		label4.setVerticalTextPosition(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(450, 300));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
		
