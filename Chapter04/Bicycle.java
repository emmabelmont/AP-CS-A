
/**
 * Write a description of class Bicycle here.
 *
 * @author J. Padilla
 * @version 9/17/18
 */
public class Bicycle
{
    // instance variables - replace the example below with your own
    private Tire front;
    private Tire back;
    private double height;

    /**
     * Constructor for objects of class Bicycle
     * 
     * @param bikeHeight The height of the bicycle
     * @param tireRadius The radius of both tires
     */
    public Bicycle(double bikeHeight, double tireRadius)
    {
        height = bikeHeight;
        front = new Tire(tireRadius);
        back = new Tire(tireRadius);
    }

    /**
     * Returns the height of the bicycle
     *
     * @return    Height of bike
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Returns the average pressure in both tires
     *
     * @return    Average pressure in both tires
     */
    // when you use a number you need to do 2.0 rather than 2 bc double
    public double averagePressure()
    {
        return (front.getPressure() + back.getPressure())/2.0;
    }

    /**
     * Returns front tire pressure
     *
     * @return    front tire pressure
     */
    public double getFrontPressure()
    {
        return front.getPressure();
    }

    /**
     * Returns back tire pressure
     *
     * @return    back tire pressure
     */
    public double getBackPressure()
    {
        return back.getPressure();
    }

}
