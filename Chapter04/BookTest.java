
/**
 * Write a description of class BookTest here.
 *
 * @author Emma Belmont 
 * @version 
 */
public class BookTest
{
    public static void main (String args[])
    {
        Book testBook = new Book(3);
        
        testBook.nextPage(); 
        System.out.println(testBook.getCurrentPage());
        testBook.nextPage(); 
        System.out.println(testBook.getCurrentPage());
        testBook.nextPage(); 
        System.out.println(testBook.getCurrentPage());
    }
}
