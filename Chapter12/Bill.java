
/**
 * Write a description of class Bill here.
 *
 * @author Emma Belmont
 * @version (a version number or a date)
 */
public class Bill implements Money
{
    private int value;
    
    public Bill (int value)
    {
        this.value = value;
    }
    
    public double getAmount ()
    {
        return value;
    }
    
    public String toString ()
    {
        return "$" + value;
    }
}
