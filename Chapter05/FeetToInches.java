
/**
 * Write a description of class feetToInches here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FeetToInches
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Feet: ");
        int feet = input.nextInt();
        
        input.close();
        
        int inches = toInches(feet);
        System.out.println ("Inches: " + inches);
    }
    
    public static int toInches(int feet)
    {
        return feet*12;
    }

}
