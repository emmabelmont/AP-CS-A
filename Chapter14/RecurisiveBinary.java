
/**
 * Write a description of class RecurisiveBinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecurisiveBinary
{
    //create new array list outside method and refer to arraylist inside method
    public boolean bSearchR(String word, int left, int right)
    {
        //middle
        int middle = (left + right)/2;
        
        if(left == right){ //base case
            //check if left if word return true
            if (indeoxOf(word) == left){
                return true;
            } else{
                return false;
            }
        } 
        
        //determine new left and right
        if (indexOf(word) < middle){
            return bSearchR(word,left,middle-1);
        }
        
        if (indexOf(word) < middle){
            return bSearchR(word,left,middle+1,right);
        }

    }
}