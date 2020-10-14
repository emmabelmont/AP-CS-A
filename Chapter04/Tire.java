
/**
 * Write a description of class Tire here.
 *
 * @author J Padilla
 * @version 9/17/18
 */
public class Tire
{
    private double radius;
    private double pressure;

    /**
     * Constructor for objects of class Tire
     * 
     * @param rad The tire's radius
     */
    // must have same name as the class and must never return anything
    public Tire(double rad)
    {
        radius  = rad;
        
        //creates a random pressure between 20 and 25
        pressure = 20+5*Math.random();
    }

    /**
     * returns the tire's pressure
     *
     * @return    The tire's pressure
     */
    // never print anything in a method
    public double getPressure()
    {
        return pressure;
    }

    /**
     * returns the tire's radius
     *
     * @return    Tire's radius
     */
    public double getRadius()
    {
        return radius;
    }

}
