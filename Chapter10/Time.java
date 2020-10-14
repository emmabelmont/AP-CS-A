
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    // instance variables
    private int hours;
    private int mins;
    
    /**
     * Constructor for objects of class Time
     * @param h the hours (int)
     * @param m the minutes (int)
     */
    public Time(int h, int m)
    {
        // initialise instance variables
        h = hours;
        m = mins; 
        
        if (h<0 || h>23 || m<0 || m>59){
            throw new IllegalArgumentException("Time is invalid");
        }
        
        if (h>=0 && h<=23){
            h = hours;
        } else {
            hours = 0;
        }
        
        if (m>=0 && m<=59){
            m= mins;
        } else {
            mins = 0;
        }
    }

    /**
     * Converts the time in hours and minutes into minutes 
     * @return  the time in minutes since the beginning of the day 
     */
    private int toMins()
    {
        // put your code here
        return (hours*60)+mins;
    }
    
    /**
     * Tells whether the time is earlier than t 
     * @param t the time in hours and minutes(Time)
     * @return true if the time is earlier than t and false otherwise 
     */
    public boolean lessThan (Time t){
        if (toMins()<t.toMins()){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Finds the time elapsed from t to this time
     * @param t the time in hours and minutes(Time)
     * @return  the time elapsed from t to this time 
     */
    public int elapsedSince(Time t){
        int elap = toMins()- t.toMins();
        if (elap<0){
            elap += 24*60;
        } else if(){
            
        }
        return elap;
    }
    
    /**
     * Converts the time in hours and minutes as a String
     * @return  the time in hours and minutes as a String 
     */
    public String toString(){
        return hours + ":" + mins;
    }
}
