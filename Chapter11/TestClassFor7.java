import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class TestClassFor7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClassFor7
{
    public static void main(String[] args)
    {
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        ArrayList<Integer> thirdList = new ArrayList<Integer>();
        
        Integer one = new Integer(1);
        Integer two = new Integer(2);
        
        firstList.add(one);
        firstList.add(new Integer(2));
        firstList.add(new Integer(3));
        
        secondList.add(one);
        secondList.add(two);
        secondList.add(new Integer(3));
        
        thirdList.add(new Integer(1));
        thirdList.add(two);
        thirdList.add(new Integer(3));
        
        filter(firstList, secondList);
        filter(secondList, thirdList);
        
        System.out.println("The next line should read: 2 3");
        for(Integer temp: firstList)System.out.print(temp.intValue() + " ");
        System.out.println();
        
        System.out.println("The next line should read: 1 3");
        for(Integer temp: secondList)System.out.print(temp.intValue() + " ");
        
    }
    
    //place filter code below
    public static void filter(ArrayList<Integer> firstList, ArrayList<Integer> secondList)
    {
        int n = firstList.size();
        for (int i=0; i<secondList.size(); i++){
            for (int a=0; a<firstList.size(); a++){
                if (secondList.get(i) == firstList.get(a)){
                    firstList.remove(a);
                    a--;
                    n--;
                }
            }
        }
    }
}