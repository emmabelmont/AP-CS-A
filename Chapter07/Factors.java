
/**
 * Write a description of class Factors here.
 *
 * @author Emma Belmont
 * @version November 2, 2018
 */
import java.util.Scanner;
public class Factors
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        
        input.close();
        
        System.out.println (factors(n));
        
    }
    
    public static String factors (int n)
    {
        int f1 = 2;
        int f2 = 0;
        while (f1 <= Math.sqrt(n)){
            if (n%f1 ==0){      //if is a factor
                f2 = n/f1;      //finds f2
                return f1 + "," + f2;       //returns factors
            }
            else{   //if isn't a factor f1+1 and repeat
                f1++;
            }
        }
        return "1," + n;    //is a prime number
    }
}
