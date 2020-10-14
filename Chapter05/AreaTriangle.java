
/**
 * Write a description of class AreaTriangle here.
 *
 * @author Emma Belmont
 * @version October 11, 2018
 */
import java.util.Scanner;
public class AreaTriangle
{

  public static double getArea (double a, double b, double c)
  {
    double p = (a + b + c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }
    
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Length of side a: ");
    double a = input.nextDouble();
    
    System.out.println("Length of side b: ");
    double b = input.nextDouble();
    
    System.out.println("Length of side C: ");
    double c = input.nextDouble();
    
    input.close();
    
    double area = getArea(a,b,c);
    System.out.println("Area: " + area);
  }
}
