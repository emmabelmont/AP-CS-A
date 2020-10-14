
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static <T> int find (T[] a, Comparable<? super T> target)
    {
        int left = 0;
        int right = a.length -1;
        
        while (left<=right){
            // take the index of the middle element between "left" and "right"
            int middle = (left+right)/2;
            // compare this element to the target value and adjust the search range accordingly
            int diff = target.compareTo(a[middle]);
            
            if (diff<0){ //target < a[middle]
                right = middle -1;
            } else if (diff>0){ //target > a[middle]
                left = middle+1;
            } else {  //target = a[middle]
                return middle;
            }
        }
        
        return -1;
    }
}
