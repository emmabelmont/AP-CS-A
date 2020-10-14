
/**
 * Write a description of class SacredHeart here.
 *
 * @author Emma Belmont
 * @version 9/12/18
 */
public class SacredHeart
{
    public static void main(String args[])
    {
        HighSchool mySchool = new HighSchool(20,300);
        System.out.println(mySchool.getEnrollment());
       
        mySchool.enrollStudent(10);
        System.out.println(mySchool.getEnrollment());
    }
}
