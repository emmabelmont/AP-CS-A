
/**
 * Write a description of class Book here.
 *
 * @author Emma Belmont
 * @version 9/12/18
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int numPages;
    private int currentPage;
    /**
     * Constructor for objects of class Book
     */
    public Book(int totalPages)
    {
        // initialise instance variables
        numPages = totalPages;
        currentPage = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void nextPage()
    {
        // put your code here
        if (currentPage < numPages){
            currentPage++;
        }
        
    }
    
        public int getCurrentPage()
    {
        return currentPage;
    }
    
        public int getNumPages()
    {
        return numPages;
    }
    
    
}
