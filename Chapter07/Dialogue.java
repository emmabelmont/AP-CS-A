
/**
 * Write a description of class DialogProject here.
 *
 * @author Emma Belmont
 * @version Novermber 8, 2018
 */
import java.util.Scanner;

public class Dialogue
{
    public static void main (String[] args)
    {
        // making sure you move the cursor to read in the nextLine correctly after reading in an int/double
        Scanner input = new Scanner (System.in); //System.in keeps track of every key you press
        
        System.out.println ("Enter an interger: ");
        int number = input.nextInt();   //put input.nextLine(); everytime after you read in an int
        input.nextLine();       // moves the cursor over to the next "token" so word != "enter"
        System.out.println ("You entered: " + number);

        System.out.println ("Enter a word: ");
        String word = input.nextLine();
        System.out.println ("You entered: " + word);    
        
        //using strings in conditionals 
        String answer = "y";
        if (answer.equals ("y")){
            System.out.println ("contains y");
        } else{
            System.out.println ("does not contain y");
        }
        
        //formatting output
        int quantity = 5;
        double price = 1.23;
        
        System.out.printf ("You have ordered %d Ripples -- $%.2f\n\n", quantity, price*quantity);
     
        
    }
}
