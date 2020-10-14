
/**
 * isPalindrome tests whether a word/phrase (lowercase, without punctuation or numbers) is a
 * palindrome (the same when read forward or backwards)
 *
 * @author Emma Belmont
 * @version November 29, 2018
 */
public class isPalindrome
{
    /**
     * Method isPalindrome Tests whether word is a palindrome
     * 
     * @param word The word/phrase to be analyzed
     * @return Returns true or false whether word is a palindrome or not
     */
     public boolean isPalindrome(String word)
     {
       String text = word;                      //makes a copy of the field variable text
       int location = text.indexOf(" ");        //stores the index of ' '(a space)   
       //if there are spaces in String text, it gets rid of the spaces
       while (location>=0){     //runs as long as location is greater than or equal to zero
           text = text.substring(0,location) + "" + text.substring(location+1); 
           location = text.indexOf(" ");
       }
         
       String firstL = text.substring(0,1);     //stores the first letter of String text
       String lastL = text.substring(text.length()-1,text.length());    //stores the last character of String text
       //checks to see if the starting and ending pairs of String text match moving in by one through 
       //the pairs. If yes will returns true and if false will return false
       for (int i = 0; i<= (text.length()/2+1); i++){
          if (firstL.equals(lastL)){ 
             firstL = text.substring(i,i+1);    
             lastL = text.substring((text.length()-i-1), text.length()-i); 
          }
          else{
              return false;     //returns false if text is NOT a palindrome
          }
       }            
       return true;     //returns true if text is a palindrome
     }
}



