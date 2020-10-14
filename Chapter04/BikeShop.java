import java.util.*;

/**
 * Write a description of class BikeShop here.
 *
 * @author J Padilla
 * @version 9/17/18
 */
public class BikeShop // this is the driver class
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Create scanner object to read in user input
        
        //Variables to hold user inputs that will be passed to the bike's constructor
        double bikeHeight;
        double tireRadius;
        
        Bicycle myBike;  //Create Bicycle called myBike
        
        //Take in specifications for bike
        System.out.println("What height do you want for your bike?");
        bikeHeight = input.nextDouble();
        System.out.println("Tire radius?");
        tireRadius = input.nextDouble();
        
        //Create bike with user defined specifications
        myBike = new Bicycle(bikeHeight, tireRadius);
        
        //Prints bike's specs
        System.out.println("Here is your bike: ");
        System.out.println("");
        System.out.println("height: " + myBike.getHeight());
        System.out.println("front tire pressure: " + myBike.getFrontPressure());
        System.out.println("back tire pressure: " + myBike.getBackPressure());
        System.out.println("average tire pressure: " + myBike.averagePressure());
    }
}
