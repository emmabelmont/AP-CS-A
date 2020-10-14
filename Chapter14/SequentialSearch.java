
/**
 * Write a description of class SequentialSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SequentialSearch
{
    public static void main (String[] args)
    {
        
    }
    
    public static boolean sequentialSearch (int n, int[]a)
    {
        for (int i=0; i<a.length; i++){
            if (a[i] == n){
               return true; 
            } 
        }
        return false;
    }
}
