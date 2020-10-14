
/**
 * Write a description of class FancyBalloon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon
{
  private int xCenter, yCenter, radius;
  private Color color;

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon()
  {
      super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
  {
      super(x,y,r,c);
  }

  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    
    g.setColor(getColor());
    if (makeItFilled)
      g.fillOval(getX() - getRadius(),
                 getY() - getRadius(), 2*getRadius(), 2*getRadius());
    else
      g.drawOval(getX() - getRadius(),
                 getY() - getRadius(), 2*getRadius(), 2*getRadius());
  }
}
