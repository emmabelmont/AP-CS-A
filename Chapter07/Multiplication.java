
/**
 * Write a description of class Multiplication here.
 *
 * @author Emma Belmont
 * @version October 25, 2018
 */
public class Multiplication
{
    public static void main (String[] args)
    {
        System.out.println (product(5,4));
    }
    
    public static int product(int a, int b) //returns the product of a and b // preconditions: a>=0, b>=0
    {
        int prod = 0;       
        for (int i = 1; i <=b; i++){
            prod += a;
        }
        return prod;
    }
    
}

