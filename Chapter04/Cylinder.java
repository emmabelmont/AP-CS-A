
/**
 * Write a description of class Cylinder here.
 *
 * @author Emma Belmont
 * @version September 18, 2018
 */
public class Cylinder
{
    // instance variables - replace the example below with your own
    private Circle base;
    private double height;

    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(double r, double h)
    {
        // initialise instance variables
        base = new Circle(r);
        height = h;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getVolume()
    {
        // put your code here
        return base.getArea()*height;
    }
}
