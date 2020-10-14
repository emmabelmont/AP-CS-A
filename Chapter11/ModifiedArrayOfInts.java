
/**
 * Write a description of class Ch11Notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModifiedArrayOfInts
{
    //Note #1: ArrayLists are different than normal Arrays in that they are Arrays that
    // change size and only hold ints                        
                           
    private int[] mArray;
    public ModifiedArrayOfInts (int size)   
    {
        mArray = new int[size];
    }
    
    public int getSize()
    {
        return mArray.length;
    }
    
    public boolean setElement (int place, int number)
    {
        if (mArray.length-1 >= place && place >= 0){
            mArray[place] = number;
            return true;
        } else {
            return false;
        }
    }
    
    public void increaseSize()
    {
        //make new array (length of old +1)
        int[] temp = new int[mArray.length + 1];
        
        //copy info to new array
        for (int i=0; i<mArray.length; i++){
            temp[i] = mArray[i];
        }
        
        mArray = temp;
    }
    
    public void dropLastElement()
    {
        int[] temp = new int[mArray.length - 1];
        
        for (int i=0; i<mArray.length -1; i++){
            temp[i] = mArray[i];
        }
        
        mArray = temp;
    }
    
    public String toString()
    {
        String list = "";
        for (int i=0; i<mArray.length; i++){
            list += mArray[i] + ", ";
        }
        list = list.substring(0, list.length()-2);
        return list;
    }
    
}
