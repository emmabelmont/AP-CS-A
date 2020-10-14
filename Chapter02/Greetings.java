/**
 * This program expects two command-line arguments
 * -- a person's first name and last name.
 * For example:
 * C:\mywork> java Greetings Annabel Lee
 */
public class Greetings
{
  public static void main(String[] args)
  {
    String firstName = args[0];
    String middleName = args [1];
    String lastName = args[2];
    System.out.println("Hello, " + firstName + " " + middleName + " " + lastName);
    System.out.println("Congratulations on your second program!");
  }
}
