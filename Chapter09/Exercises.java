
/**
 * Write a description of class Exercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercises
{
    int[] array = {1,2,3,4,5};  
    public void swap(int[] array)  //p.258 #3
    {
        int i = array.length -1;
        if (i>2){
            int newA = array[0];
            array[0] = array[i];
            array[i] = newA;
        }
    }
    int[] scores = {90,90,90,90,90};  
    public boolean scores ()  //p.258 #4  
    {
        int element1 = scores[0];
        int lastElement = scores[scores.length];
        
        if (element1 == lastElement){
            return true;
        }
        return false;
    }
    //p.258 #6 - it counts to see if any of the number in the array arent zero
}
