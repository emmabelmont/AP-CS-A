
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int w, int h)
    {
        // initialise instance variables
        width = w;
        height = h;
    }
    
    public Rectangle (int side){
        this(side,side);
    }
    
    public Rectangle (){
        this (1,1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isSquare()
    {
        // put your code here
        return width == height;
    }
}
