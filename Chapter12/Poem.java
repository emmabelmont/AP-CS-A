
/**
 * Abstract class Poem - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Poem
{
    public abstract int numLines();
    
    public abstract int getSyllables(int k);
    
    public void printRhythm(){
        for (int k=1; k<=numLines(); k++){
            int count = getSyllables(k);
            for (int i=1; i<=count; i++){
                System.out.print("ta");
                if (i<count){
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
