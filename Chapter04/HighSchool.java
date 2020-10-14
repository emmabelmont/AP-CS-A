
/**
 * Write a description of class HighSchool here.
 *
 * @author Emma Belmont
 * @version 9/12/18
 */
public class HighSchool
{
    // instance variables - replace the example below with your own
    private int numberOfClasses;
    private int enrollment;
    /**
     * Constructor for objects of class HighSchool
     */
    public HighSchool(int Classes,int numStudents)
    {
        // initialise instance variables
        numberOfClasses = Classes;
        enrollment = numStudents;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enrollStudent(int numStudents)
    {
        // put your code here
        enrollment = enrollment + numStudents;
    }
    
    public void unenrollStudent(int numStudents)
    {
        enrollment = enrollment - numStudents;
    }
    
    public void addClass()
    {
        numberOfClasses++;
    }
    
    public int getEnrollment()
    {
        return enrollment;
    }
}  
