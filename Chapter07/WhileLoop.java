
/**
 * Write a description of class WhileLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoop
{
    public static void main (String[] args)
    {
        // System.out.println (elegantExpontent(8,3));
        // System.out.println (factorial(4));
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
}
