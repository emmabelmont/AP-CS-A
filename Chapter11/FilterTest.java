    
import java.util.*;
/**
* Write a description of class TestClassFor7 here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class FilterTest
{
public static void main(String[] args)
{
    ArrayList<Integer> firstList = new ArrayList<Integer>();
    ArrayList<Integer> secondList = new ArrayList<Integer>();
    ArrayList<Integer> thirdList = new ArrayList<Integer>();
    
    Integer one = 1;
    Integer two = 2;
    
    firstList.add(one);
    firstList.add(2);
    firstList.add(3);
    
    secondList.add(one);
    secondList.add(two);
    secondList.add(3);
    
    thirdList.add(1);
    thirdList.add(two);
    thirdList.add(3);
    
    filter(firstList, secondList);
    filter(secondList, thirdList);
    
    System.out.println("The next line should read: 2 3");
    for(Integer temp: firstList){
        System.out.print(temp.intValue() + " ");
        System.out.println();
        System.out.println("The next line should read: 1 3");
    }
    for(Integer temp: secondList){
        System.out.print(temp.intValue() + " ");
    }
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