/**
* SnowmanApplication.java 
*  - add two red buttons to the upper torso
*  - move the sun to the upper-right corner of the picture
*  - display your name in the upper left corner of the picture
*  - shift the snowman 20 pixels to the right
* @auther Kanako Kunieda (W77070774)
* @version 1.0
* @since 2016-08-17
*/

import javax.swing.*;
import java.awt.*;

public class SnowmanApplication
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame("Snowman Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SnowmanPanel panel = new SnowmanPanel();
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
      
        
//********************************************************************
//  SnowmanPanel class used for drawing shapes 
//********************************************************************

class SnowmanPanel extends JPanel
{

   //-----------------------------------------------------------------
   //  Constructor sets size and color of panel
   //-----------------------------------------------------------------
   public SnowmanPanel()
   {
     setPreferredSize(new Dimension(300,225));
     setBackground(Color.cyan);
   }
     
   //-----------------------------------------------------------------
   //  Draws a snowman.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
 //     final int MID = 150;
      final int MID = 170; // Shift the snowman 20 pixels to the right
      final int TOP = 50;

      setBackground (Color.cyan);

      page.setColor (Color.blue);
      page.fillRect (0, 175, 300, 50);  // ground

      page.setColor (Color.yellow);
//      page.fillOval (-40, -40, 80, 80);  // sun
      page.fillOval (260, -40, 80, 80);  // move the sun to the upper-right corner

      page.setColor (Color.white);
      page.fillOval (MID-20, TOP, 40, 40);      // head
      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso
      
      page.setColor (Color.red);
      page.fillOval (MID-0, TOP+50, 5,5); // add 1st red botton
      page.fillOval (MID-0, TOP+60, 5,5); // add 2nd red botton

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

//      page.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // smile
      page.drawArc (MID-10, TOP+20, 20, 10, 170, -160);   // not smile
      
      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
      
      page.drawString ("Kanako Kunieda", 10, 20); // my name in the upper-left corner 
   }
}

