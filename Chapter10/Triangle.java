
/**
 * Write a description of class Triangle here.
 *
 * @author Emma Belmont
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Triangle
{
    // instance variables 
    private double largest;
    private double middle;
    private double smallest;

    /**
     * Constructs a Triangle
     * @param a the length of side A of a triangle (double)
     * @param b the length of side B of a triangle (double)
     * @param c the length of side C of a triangle (double)
     */
    public Triangle(double a, double b, double c)
    {
        if (!(a+b>c && b+c>a && a+c>b && a>0 && b>0 && c>0)){
            throw new IllegalArgumentException ("Triangle construction error: not a triangle");
        }
        largest = largestNum(a,b,c);
        middle = middleNum(a,b,c);
        smallest = smallestNum(a,b,c);        
    }
    
        /**
     * Constructs an equilateral Triangle
     * @param s the length of side A, side B, and side C of the triangle (double)
     */
    public Triangle(double s)
    {
        smallest = s;
        middle = s;
        largest = s;
    }

    /**
     * Makes largest equal the largest side length
     * 
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     */
    public static double largestNum(double a, double b, double c)
    {
        double largest = 0;
        if (a>=b && a>=c){    
            largest = a;
        } else if (b>=a && b>=c){
            largest = b; 
        } else {
            largest = c; 
        }
        return largest;
    }
    
    /**
     * Makes middle equal the second smallest side length
     * 
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     */
    public static double middleNum(double a, double b, double c)
    {
        double middle = 0;
        if (a>=b && a<=c){    // makes middle the second smallest length
            middle = a;
        } else if (b>=a && b<=c){
            middle = b; 
        } else{
            middle = c; 
        }
        return middle;
    }
    
    /**
     * Makes smallest equal the smallest side length
     * 
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     */
    public static double smallestNum(double a, double b, double c)
    {
        double smallest = 0;
        if (a<=b && a<=c){    // makes smallest the smallest length
            smallest = a;
        } else if (b<=a && b<=c){
            smallest = b; 
        } else {
            smallest = c; 
        }
        return smallest;
    }
    
    /**
     * Takes in sides of triangle and determines whether this is a right triangle 
     *
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     * 
     * @return  true if the given sides form a right triangle and false otherwise
     */
    public static boolean isRight(int a, int b, int c)
    {
        int x = (int)smallestNum(a,b,c);
        int y = (int)middleNum(a,b,c);
        int z = (int)largestNum(a,b,c);
        if (Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2)){
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Takes in sides of triangle and determines whether this is a acute triangle 
     *
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     * 
     * @return  true if the given sides form a acute triangle and false otherwise
     */
    public static boolean isAcute(int a, int b, int c)
    {
        int x = (int)smallestNum(a,b,c);
        int y = (int)middleNum(a,b,c);
        int z = (int)largestNum(a,b,c);
        if (Math.pow(x,2) + Math.pow(y,2) > Math.pow(z,2)){
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Takes in sides of triangle and determines whether this is a obtuse triangle 
     *
     * @param a   the length of side A of this triangle (int)
     * @param b   the length of side B of this triangle (int)
     * @param c   the length of side C of this triangle (int)
     * 
     * @return  true if the given sides form a obtuse triangle and false otherwise
     */
    public static boolean isObtuse(int a, int b, int c)
    { 
        int x = (int)smallestNum(a,b,c);
        int y = (int)middleNum(a,b,c);
        int z = (int)largestNum(a,b,c);
        if (Math.pow(x,2) + Math.pow(y,2) < Math.pow(z,2)){
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Uses Heron's formula to find the area of this triangle
     *
     * @return  the area of this triangle (double)
     */
    public double getArea()
    {
        double s = (smallest + middle + largest)/2;
        return Math.sqrt(s*(s-smallest)*(s-middle)*(s-largest)); 
    }
    
    /**
     * Uses the SSS Postulate to determine whether Triangle this and Triangle other are congruent
     *
     * @param  other (Triangle) 
     * @return  true if Triangle this is congruent to Triangle other and false otherwise
     */
    public boolean isCongruent(Triangle other)
    {
        if (this.largest == other.largest && this.middle == other.middle && this.smallest == other.smallest){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns a string representation of the sides of the triangle from smallest to largest
     *
     * @return lists the sides of the triangle from smallest to largest (String)
     */
    public String toString()
    {
        return smallest + ", " + middle + ", " + largest;
    }

}
