
/**
 * Write a description of class Ch8Notes here.
 *
 * @author Emma Belmont
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ch8Notes
{
  public static void Ch8Notes (){
                                            // 8.2 Literal Strings - 
    //Note1: can call a String(object) without declaring it bc it is a string literal unlike normal objects
    String name = "Jack";
    name.equals("Jack");
    "Jack".equals("Jack"); //can do this bc it is a String(object) not primitive data
    
    //Difference between null and "" - 
    String name1 = "John"; // returns "John"
    String name2 = new String (); // returns ""
    String name3; //returns null 
    
    name1 += "i";   //returns "Johni"
    name2 += "i";   //returns "i"
    //name3 += "i";   //error - can't manipulate a null reference
    
                    // 8.3 String Constructors and Immutability (Concatination) - 
    //Note1: Strings are immutable (can't be changed) but you can concatonate it which makes a new String and points it to the same location 
    //Note2: ignore String buffer
    
    String s1 = new String ("hi");
    String s2 = s1; //now s1 and s2 both point to the same location so if you change one you change the other
    String s3 = new String (s1); //won't change old one
    
    String a = "hi ";
    //a += "bye";           //a is now pointing to "hi bye"
    //a += 4 + "i";         //a is now pointing to "hi 4i"
    //a += 4 + 8;           //a is now pointing to "hi 12"
    //a += ' ' + 1708;      //a is pointing to "hi 17null8"??? --> ascII table 
    
    //Substrings - 
    String classes = "class";   //starts at 0 so c=0,l=1,a=2,s=3,s=4
    String mine = "class".substring (3);        //stores "ss" into the variable 
    String mine1 = "class".substring (3,5);     //also stores "ss"
    String other = "class".substring (1,4);     //stores "las"
    
    "class".length();   //returns 5 (always returns primitive data type integer)
    
    //Example 1: algorithm that prints the last 3 letters of a name
    Scanner input = new Scanner(System.in);
    String name4 = input.nextLine();
    
    System.out.println (name4.substring(name.length()-3));
    
    input.close();
    
                                                // 8.4 String Methods - 
    //int compareTo (String other) -
    "Daisy".compareTo("abby");  //Daisy=other, abby=this since Daisy comes before(greater than) abby bc of capital D it 
                                // will return negative number
    "abby".compareTo("Daisy");  // will return positive number bc Daisy is greater
    "abby".compareTo("abby");   //will return 0 and is the same as "abby".equals("abby");
    
    //int indexOf (String str) -
    "abcdef".indexOf ("de");    //returns 3 bc thats where "de" starts
    
          
                             // 8.5 Formatting Numbers into Strings - 
    //Static vs Non-Static - 
    //static (Strings) can be called and used without declaring/initializing an object but non-static (Integers) can't
    
    //Note1: not allowed to call method from String class until you've declared an object 
    //Note2: Integer(object) is different than an int(primitive data)
    //Note3: want to be able to move between primitive data types <--> Strings <--> Integers <--> primitive data types
    
    //Primitive Data to String - can use to convert Objects to Strings
    //Option 1:
    int n=3;    //same w doubles 
    String str = n + "";  //converts int to String
    //Option 2:
    int n1=3;   //same w doubles
    String str1 = Integer.toString(n); //wrapper class (wraps a primitive data type in a class through a method) 
    
    //Primitive to Integer (Wrapping) - 
    int n2=3; //same w doubles
    Integer myNum = new Integer(n2);
    
    //Integer to Primitive Data - 
    Integer myNum1 = new Integer (5);
    int n3=myNum1.intValue();
    
  }
}
