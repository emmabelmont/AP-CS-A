
/**
 * Write a description of class Diploma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diploma
{
    // instance variables - replace the example below with your own
    private String name;
    private String subject;

    /**
     * Constructor for objects of class Diploma
     */
    public Diploma(String name, String subject)
    {
        // initialise instance variables
        this.name = name;
        this.subject = subject;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString(String n, String s)
    {
        // put your code here
        name = n;
        subject = s;
        return "This certifies that " + name + "has completed a MOOC in " + subject;
    }
}
