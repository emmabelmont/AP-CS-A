//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Morning extends JFrame
                implements ActionListener
{
  private EasySound rooster;
  private EasySound moo;
  private int time;
  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    moo= new EasySound("moo.wav");
    
    time = 0;
    Timer clock = new Timer(5000, this);
    clock.start();
    
    Container c = getContentPane();
    c.setBackground(Color.WHITE);

  }
  
  public void actionPerformed(ActionEvent e)
  {
    time++;
    Container c = getContentPane();
    if (time%2 ==1){
        c.setBackground(Color.BLACK);
        moo.play();
    } else {
        c.setBackground(Color.WHITE);
        rooster.play();
    }
    repaint();
  }
  
  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
