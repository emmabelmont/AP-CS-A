
/**
 * Write a description of class LunchTime here.
 *
 * @author Emma Belmont
 * @version October 11, 2018
 */
import java.util.Scanner;

public class LunchTime
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int minutesUntilLunch(int hours, int mins)
    {
        int hoursTil = 12 - hours;
        int minsTil = 60 - mins;
        
        return (hoursTil * 60) + minsTil;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        System.out.println("What time is it? (hh:mm)");
        String time = input.nextLine();
        
        int i = time.indexOf(":");
        int hours = Integer.parseInt(time.substring(0, i));
        int mins = Integer.parseInt(time.substring(i+1)); 
        
        int minutesUntilLunch = minutesUntilLunch(hours, mins); 
    
        input.close();
        
        System.out.println(minutesUntilLunch + " minutes until lunch.");
    }
}
