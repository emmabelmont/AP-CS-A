import java.util.*;
/**
 * Write a description of class CylinderTest here.
 *
 * @author Emma Belmont
 * @version September 18, 2018
 */
public class CylinderTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Create scanner object to read in user input
        
        double cylinderRadius;
        double cylinderHeight;
        
        Cylinder myCylinder;
        
        //Take in specifications for cylinder
        System.out.println("What is the radius of your cylinder?");
        cylinderRadius = input.nextDouble();
        System.out.println("What is the height of your cylinder?");
        cylinderHeight = input.nextDouble();
        
        //Create cylinder with user defined specifications
        myCylinder = new Cylinder(cylinderRadius, cylinderHeight);
        
        //Prints bike's specs
        System.out.println("Here is your cylinder: ");
        System.out.println("volume: " + myCylinder.getVolume());
        

    }
}
