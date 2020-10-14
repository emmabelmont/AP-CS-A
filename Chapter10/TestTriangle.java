
/**
 * Write a description of class TestTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestTriangle
{
    public static void main (String args[])
    {
        System.out.println("------------");
        Triangle firstTri = new Triangle (5, 4, 3);
        //Triangle secondTri = new Triangle (7,1,6);  //will break code
        Triangle thirdTri = new Triangle (3,3,3);   //equilateral triangle
        Triangle fourthTri = new Triangle (10,6,8);  
        Triangle fifthTri = new Triangle (12, 15, 9);
        
        //Right
        System.out.println("Right");
        System.out.println (Triangle.isRight(3,4,5));    //should return true
        System.out.println (Triangle.isRight(3,4,6));    //should return false
        System.out.println (Triangle.isRight(10,6,8));   //should return true --- 
        System.out.println();
        
        //Acute
        System.out.println("Acute");
        System.out.println (Triangle.isAcute(3,3,4));    //should return true
        System.out.println (Triangle.isAcute(3,4,5));    //should return false
        System.out.println (Triangle.isAcute(10,6,8));    //should return false ---
        System.out.println();
        
        //Obtuse
        System.out.println("Obtuse");
        System.out.println (Triangle.isObtuse(3,4,6));    //should return true
        System.out.println (Triangle.isObtuse(3,4,5));    //should return false  
        System.out.println (Triangle.isObtuse(10,6,8));    //should return false
        System.out.println();
        
        //Area
        System.out.println("Area");
        System.out.println (firstTri.getArea());    //should return  6
        System.out.println (thirdTri.getArea());    //should return  ~3.9
        System.out.println (fourthTri.getArea());    //should return 24
        System.out.println();
        
        //Congruent
        System.out.println("Congruent");
        Triangle other = new Triangle (5,4,3); 
        System.out.println (firstTri.isCongruent(other));   //should return true
        System.out.println (thirdTri.isCongruent(other));   //should return false
        System.out.println (fourthTri.isCongruent(other));   //should return false
        System.out.println();
        
        //String
        System.out.println("String");
        System.out.println (firstTri.toString());   //should print 3, 4, 5
        System.out.println (thirdTri.toString());   //should print 3, 3, 3 
        System.out.println (fourthTri.toString());  //should print 6, 8, 10
        System.out.println (fifthTri.toString());   //should print 9, 12, 15
        System.out.println();
        
        System.out.println();
        
    }
    
}
