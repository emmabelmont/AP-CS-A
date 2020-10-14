
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    public static void main (String[] args)
    { 
        int n=5;  
        for (int row = n; row >= 1; row--){       //makes a upside-down pyramid
            for (int count=1; count <=row; count ++)
                System.out.print ("*");
            System.out.println();
        }

        for (int row = 1; row <= 1; row++){     //makes a pyramid
            for (int count=1; count <=row; count ++)
                System.out.print ("*");
            System.out.println();
        } 
    }
}
