/**
 * p.205 (#24) - Asks a customer to input the number of Ripples they want if their order qualifies then
 * asks if there is another customer. If yes, repeats code, if no, thanks the user for
 * using Ripple Systems. 
 *
 * @author Emma Belmont
 * @version Due: November 13, 2018
 */
import java.util.Scanner;
public class DialogProject
{
    public static void main (String[] args) 
    {
        final double PRICE = 0.26;         // constant unit price of ripple = 0.26 cents
        String answer = "y";                // if there is another customer answer="y"
        
        Scanner keyboard = new Scanner (System.in);

        // while user enters y 
        while (answer.equals ("y")){     
            System.out.println ();
            System.out.print ("Enter quantity: ");
            int quantity = keyboard.nextInt();
            keyboard.nextLine();
            
            if (quantity % 25 != 0){    //if their order isn't divisible by 25
                System.out.println ("Ripples can be ordered only in packs of 25.");
                System.out.println ();
            }else {  //their order is divisible, returns the number they ordered and the total price
                System.out.printf ("You have ordered %d Ripples -- $%.2f\n\n", quantity, PRICE*quantity);
            }
            
            System.out.print ("Next customer (y/n): ");
            answer = keyboard.nextLine();
        }
        
        //while user's answer isn't yes or no, repeats the questions
        while (!answer.equals ("y") && !answer.equals ("n")){ 
            System.out.print ("Next customer (y/n): ");
            answer = keyboard.nextLine();
        }
        
        //if user enters no, thanks them and program ends
        if (answer.equals ("n")){   
           System.out.println ();
           System.out.println ("Thank you for using Ripple Systems.");
           System.out.println ();
        } 
        
        keyboard.close();
    }
}    