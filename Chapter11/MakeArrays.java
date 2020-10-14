
/**
 * Write a description of class MakeArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MakeArrays
{
    public static void main(String[] args)
    {
        ModifiedArrayOfInts myArray = new ModifiedArrayOfInts(5);
        System.out.println (myArray);
        
        myArray.increaseSize();
        System.out.println (myArray);
        
        myArray.dropLastElement();
        System.out.println (myArray);
        
        System.out.println(myArray.setElement(5, 17));
        System.out.println (myArray);
    }
}
