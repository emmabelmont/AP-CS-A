
/**
 * Write a description of class SortedWordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortedWordList extends java.util.ArrayList<String>
{
    public SortedWordList()
    {
        super();
    }
    
    public int indexOf(String word)
    {
        int left = 0;
        int right = size()-1;
        int middle;
        
        while (left <= right){
            middle = (left + right)/2;
            int diff = word.compareToIgnoreCase(get(middle));
            
            if (diff > 0){
                left = middle + 1;
            } else if (diff < 0){
                right = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    
    public boolean contains(String word)
    {
        if (indexOf(word) >= 0){
            return true;
        } else {
            return false;
        }
    }
    
    public String set(int i, String word)
    {
        if ((i>0 && word.compareToIgnoreCase(get(i-1)) <=0) || (i < size()-1 && word.compareToIgnoreCase(get(i+1))>=0)){
            throw new IllegalArgumentException("word=" + word + " i=" + i);
        }
        return super.set(i,word);
    }
    
    public void add(int i, String word)
    {
        if ((i>0 && word.compareToIgnoreCase(get(i-1)) <=0) || (i < size()-1 && word.compareToIgnoreCase(get(i))>=0)){
            throw new IllegalArgumentException("word=" + word + " i=" + i);
        } 
    }
    
    public boolean add(String word)
    {
        int left = 0;
        int right = size();
        
        while (left < right){
            int middle = (left + right)/2;
            int diff = word.compareToIgnoreCase(get(middle));
            
            if (diff > 0){
                left = middle +1;
            } else if (diff < 0){
                right = middle;
            } else {
                return false;
            }
        }
        super.add(right,word);
        return true;
    }
}
