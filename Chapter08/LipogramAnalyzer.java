
/**
 * Write a description of class LipogramAnalyzer here.
 *
 * @author Emma Belmont
 * @version November 19, 2018
 */
public class LipogramAnalyzer
{
    // instance variables - replace the example below with your own
    private String text; 

    /**
     * Takes in the text to be analyzed for a lipogram 
     * 
     * @param text The text to be analyzed
     */
    public LipogramAnalyzer(String text)
    {
        // initialise instance variables
        this.text = text;
    }

    /**
     * Method mark
     *
     * @param letter The letter we are looking to remove 
     * @return The saved text string with all characters equal to letter replaced with '#'.
     */
    public String mark (char letter) 
    {
        String markedText = text;
        int location = markedText.indexOf(letter);
        while (location>=0){
            markedText = markedText.substring(0,location) + "#" + markedText.substring(location+1);
            location = markedText.indexOf(letter);
        }
        return markedText; 
    }
    
    public String allWordsWith (char letter)
    {
       String offendingWords = "";                  //offending words will be stored and returned 
       String tempText = text + " ";                //makes a copy of the field variable text
       int endOfWord = tempText.indexOf(" ");       //stores the index of the end of the first word index
       int location = tempText.indexOf(letter);     //stores the index of 'letter'
       
       while (location >0 -1){
           if (location <= endOfWord){
               offendingWords = offendingWords + tempText.substring (0, endOfWord) + "\n";
           }
           
           tempText = tempText.substring(endOfWord + 1);
           location = tempText.indexOf(letter);
           endOfWord = tempText.indexOf(" ");
       }
       
       return offendingWords;       //returns list of concatonated offending words 
    }
    
}
