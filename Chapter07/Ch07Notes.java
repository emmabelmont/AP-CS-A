
/**
 * Write a description of class Ch07Notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ch07Notes
{
                                 //7.3 The while and for Loops
                                
    public static void main (String[] args)
    {
        System.out.println (elegantExponent(8,3));
        System.out.println (factorial(4));
    }
    
    // this method will raise a number x to the 5th power
    public static int longWayExponents (int x)
    {
        return x*x*x*x*x*x;
    }
    
    // this method will raise a number x to the y power
    public static int elegantExponent(int x, int y)
    {
        int counter = y-1;       
        int a = x;              // tells computer to always multiply by this constant number
        while (counter>0){
            x *= a;
            counter --;
        }
        return x;
    }
    
    public static int factorial (int n)
    {
        int f =1;
        for (int i = 2; i <=n; i++){
            f *=i;
        }
        return f;
    }
                     
                                   // 7.4 The do-while Loop
                            
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
    
                                 //7.6 Nested Loops                          
    
    public static void nestedLoops ()
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
