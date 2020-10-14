
/**
 * Write a description of class DoWhile here.
 *
 * @author Emma Belmont
 * @version October 26, 2019
 */
public class DoWhile
{
    public static void main (String[] args)
    {
        int x = 10;
        // same as while loop but a do-while loop is guarentted to go into the loop at least once
        do {
            System.out.print("*");
            x--;
        } while (x>0);
    }
    
    public static boolean isPrime (int n)
    {
        boolean noFactors = true;
        if (n<=1){
            return false;
        }
        
        for (int m = 2; noFactors; m++){  //will keep running bc noFactors=true so infinite loop (sloppy)
            if (m * m > n){
                break;
            }
            if (n % m == 0){
                noFactors = false;
                //return false; //when you have a return statement in a method it "breaks" out of 
                                // the entire method while a break will only break out of the loop
            }
        }
        return noFactors;
    }
   
}
