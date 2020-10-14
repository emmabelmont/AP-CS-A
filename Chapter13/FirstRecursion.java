
/**
 * Write a description of class FirstRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstRecursion
{
    public static void main (String[] args)
    {
        
    }

    public static int addSquares(int n) //Precondition: n>=1
    {
        if (n==1){
            return 1;
        } else {
            return addSquares(n-1) + n*n;
        } 
    }
    
    public static int factorial(int n)
    {
        if (n==1){
            return 1;
        } else {
            return factorial(n-1)*n;
        } 
    }
    
    public String someFun (String s) 
    {
        if (s.length()>= 2){    //base case is 1 or less 
            s = someFun(s.substring(1)) +s.charAt(0);
        }
        return s;
    }
}
