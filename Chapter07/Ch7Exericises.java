
/**
 * Write a description of class Ch7Exericises here.
 * p. 200-206 (#7-9, 12, 16, 19, 20, 21, 22)
 *
 * @author Emma Belmont
 * @version November 6, 2018
 */
public class Ch7Exericises
{
    public static void main (String[] args)
    {
        System.out.println (kevinLearning());
    }
    
    public static String kevinLearning() // p.200 #7
    {
        int kl = 100;       //knowledge left
        int kn = 0;         // knowledge now
        int months = 0;
        int years = 0;
        for (int i=0; kl>5; i++){
            kl = kl/10;
            kn = 100-kl;
            months = i;
        }
        years = months/12;
        months = months - years*12; 
        time = System.out.println (years + " years and " + months + "months");
        return time;
    }
    
    public static int addOdds (int n) // p.201 #8
    {

    }
    
    public static int factorial () // p.201 #9
    {

    }
    
    public static int sumDigits () // p.201 #12
    {

    }
    
    public static int algorithmFlowChart () // p.203 #16
    {

    }
    
    public static void timesTables () // p.204 #19
    {
        
    }
    
    public static void printStarTriangle (int n) // p.204 #20
    {
        
    }
    
    public static void printCheckerboard (int n) // p.204 #21
    {
        
    }
    
    public static void atLeast7and9 () // p.204 #22
    {
        
    }
}
