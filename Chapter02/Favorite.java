
import java.util.Scanner;
/**
 * Write a description of class Favorite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Favorite
{
    // instance variables - replace the example below with your own

    public static void main(String[] args)
    {
    Scanner kboard = new Scanner(System.in);

    System.out.print("What is your favorite movie? ");
    String movie = kboard.nextLine();

    System.out.println(movie + " is such a good movie!");

    kboard.close();
    }
}
