
/**
 * School is a list of students stored in an array.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class School
{
    private String[] students;  //array containing all the student names
    private int lastIndexUsed;  //the index of the last element that has a name stored in the array

    /**
     * Constructor for objects of class School
     * 
     * @param  size  the size of the array containing student names
     */
    public School(int size)
    {
        students = new String[size];
        lastIndexUsed = -1;  //Initialized to -1 since no elements store names.
    }

    /**
     * This method adds a name to the end of the array students, if there is room
     *
     * @param  n  name of student to be added to end of the students array
     * @return    true if there is room in the array to add the name, false otherwise.
     */
    public boolean addToEnd(String n)
    {
        if(lastIndexUsed < students.length-1)
        {
            students[lastIndexUsed+1] = n;
            lastIndexUsed++;
            
            return true;
        }
        return false;
    }
    
    /**
     * This method removes the name at the end of the array
     *
     * @return true if there is a name to remove, false otherwise.
     */
    public boolean removeLastOne()
    {
        if(lastIndexUsed < students.length-1)
        {
            lastIndexUsed--;
            return true;
        }
        return false;
    }
    
    /**
     * This method inserts a name at a specified location in the array
     *
     * @param  location  the index where the name will be inserted
     * @param  n  name of student to be added
     * @return true if there is room to insert the name, false otherwise.
     */
    public boolean insertAt(String n, int location)
    {
        if( )
        {
            ;
            return true;
        }
        return false;
    }
    
    /**
     * This method removes the name at the specified location in the array
     *
     * @param  location  the index of the array where the name will be removed
     * @return true if there is a name to remove at the specified location, false otherwise.
     */
    public boolean removeAt(int location)
    {
        if( )
        {
            ;
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        String allNames = "";
        for( int i  = 0; i<=lastIndexUsed; i++)
        {
            allNames += students[i] + "\n";
        }
        return allNames;
    }
}
