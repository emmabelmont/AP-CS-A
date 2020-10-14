import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class RemovingElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RemoveElement
{
    public static void main (String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1); //adds to the end of the list
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        
        System.out.print (intList);
    }
    
    public static void removeElement(ArrayList<Integer> newList, int num)
    {
        for (int i=0; i<newList.size(); i++){
            if (newList.get(i).equals((Integer)(num))){
                newList.remove(i);
                i--;
            }
        }
    }
}
