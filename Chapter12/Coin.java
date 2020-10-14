
/**
 * Write a description of class Coin here.
 *
 * @author Emma Belmont
 * @version (a version number or a date)
 */
public class Coin implements Money
{
    private int value;
    
    public Coin (int value)
    {
        this.value = value;
    }
    
    public double getAmount ()
    {
        return value * 0.01;
    }
}
