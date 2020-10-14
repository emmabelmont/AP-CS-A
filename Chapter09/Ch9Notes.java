
/**
 * Write a description of class Ch9Notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ch9Notes
{
    public static void main (String[] args)
    {
                                        //9.2 One-Dimensional Arrays -
                                        
        //Note #1: You cannot change the size of an array once you make one but can change the content
        //Note #2: To make an array you tell type of array and then [] 
        //Note #3: Starts at zero so will always be index-1
        //Note #4: Arrays are objects and are references not primitive data
        
        //in this int array of size 10, the content is defaulted to 0(bc int)
        int[] firstNumberList = new int[10];   
        //also makes an array but is a shortcut so will intialize(w size 4) and declare(adds content)
        int[] secondNumberList = {1,2,3,4,5};  
        String[] classList = new String[15];    //array of Strings called classList that is 15 big 
        
        //referencing newly created arrays
        System.out.println(firstNumberList[6]);     //returns 0
        System.out.println(secondNumberList[2]);    //returns 3
        System.out.println(secondNumberList[6]);    //error (out of bounds)
        System.out.println(classList[2]);   //returns null
        
        //Note #5: bc an array is an object, array length is used as a public field variable (length() in a 
        //String is a method but length in an Array is a field method even though both are Objects)
        
        //iterating through an array and printing (used to print array or a section of an array) 
        for (int i=0; i<secondNumberList.length; i++){
            System.out.println(secondNumberList[i]);
        }
        
        for (int i=2; i<4; i++){    //to print indexes 2 and 3 (can be i<4 or i<=3)
            System.out.println(secondNumberList[i]);    //prints 3 and 4
        }
        
        //iterating to initialize
        firstNumberList[0] =2;  //can do this and go through but is tedious
       
        for (int i=0; i<firstNumberList.length; i++){ //declares array contents of 2,4,6,8,10,12,14,16,18,20
            firstNumberList[i] = 2*(i+1);
            System.out.println(firstNumberList[i]);
        }
        
    }
    
    //Note #6: when passing an element through an array, you are passing through a reference not element
    
    //by changing a[] you are changing the array you are passing through as a[]
    public static void firstElementTo100(int[]a)
    {
        a[0]=100;   //makes first element=100
    }
    
    public static void notes (){
                                    // 9.4 Two-Dimensional Arrays
       
       //Note #1: Arrays always make columns (up/down)first and then have an array inside another
       //array to make rows (left/right)
        
       int rows = 5;
       int columns = 3;
        
       int[][] myGrid = new int[rows][columns]; //initializes grid but not declared so defaults to 0s
        
       int[][] mySecondGrid =  //initializes and declares grid 
       {
           {7,9,2},
           {4,6,0}
       };
       
       System.out.println (mySecondGrid[1]); //will return {4,6,0}(whole row)
       System.out.println (mySecondGrid[0][1]); //will return 9
       
       //myGrid.length --> gives you rows
       //myGrid[0].length --> gives you columns
       
       //prints out whole grid myGrid
       for (int r=0; r<rows; r++){
           for(int c=0; c<columns; c++){
               System.out.println(myGrid[r][c]);
           }
       }
       
                                  //9.6 Iterations and the "For Each" Loop
                                  
       String[][] names = new String[][];
       int count =0;
       for (int i=0;i<names.length; i++){   //normal for loop
          if (names[i].equals("Santa")){
              return i;
          }
       }
       
       //Note #1: while for each loops are good for looking for things you won't know where it is(bc doesnt use indecies)
       for (String str:names){  //for each loop
           if (str.equals("Santa")){
               return true;
            }
           return false;
       }
       
    }
}
        
                                             //Review of Ojects - 
    // public class Person{
        // public int height;
        // public String eyeColor;
        // //Constructor not shown
        
        // public void walk (int speed){
            
        // }
        
        // Person James = new Person(height, eyeColor);
        // james.height; //gets James' height bc it is public (james is an object and height is a prop of that object)
        // james.walk(5); //bc an array is an object, array length is used as a public field variable
    // }

