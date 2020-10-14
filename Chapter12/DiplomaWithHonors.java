
/**
 * Write a description of class DiplomaWithHonors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiplomaWithHonors extends Diploma
{
    /**
     * Constructor for objects of class DiplomaWithHonors
     */
    public DiplomaWithHonors(String name, String subject)
    {
        // initialise instance variables
        super(name, subject);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String certify()
    {
        // put your code here
        return super.toString() + "/n ***with honors***";
    }
}
