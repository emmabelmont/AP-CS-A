
/**
 * Write a description of class Exercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Exercises
{
    public static boolean endsWithStar(String s) //p.229 #2a
    {
        return s.endsWith("*");
    }
    public static boolean atLeast2Stars (String s) //p.229 #2b
    {
        Scanner input = new Scanner(System.in);
        String star = input.nextLine();
    
        s = (star.substring(star.length()-2));
    
        input.close();
    
        if (s.length()>2 && s.equals("**")){
            return true;
        }else{
            return false;
        }
    }
    public static String removeDashes() //p.229 #3
    {
        String number = "986-645-3210"; 
        String clearNum = number.replace( "-", ""); 
        number = Integer.parseInt(clearNum) + "";
        return number;
    }
    public static String dateStrA(String date) //p.230 #4a
    {
        String result = "";
        result = date.substring(3, 5) + "-" + date.substring(0,2) + "-" + date.substring(6,10); 
        return result;
    }
    public static String dateStrB(String date) //p.230 #4b
    {
        int sMonth = 0; 
        int sDay = 0; 
        boolean slash1 = false; 
        for(int i = 0; i < date.length(); i++){ 
            if(date.charAt(i) == '/'){ 
                if(!slash1){ 
                    sMonth=1;
                    slash1 = true;
                }
                else{ 
                    sDay =i;
                }
            }
        }
        String month = date.substring(0,sMonth); 
        String day = date.substring(sMonth+1,sDay); 
        String year = date.substring(sDay+1,date.length());
        
        String result = day + "-" + month + "-" + year; 
        return result; 
    }
    public static String ccNumberA () //p.230 #5a
    {
        String ccNum = "4111 1111 1111 1111";
        
        String last4 = ccNum.substring(15);
        return last4;
    }
    public static String ccNumberB () //p.230 #5b
    {
        String ccNum = "4111 1111 1111 1111";
        
        String last5 = ccNum.substring(12); 
        return last5;
    }
    public static String scroll (String str) //p.230 #6
    {
        Scanner scroll = new Scanner(System.in);
        str = scroll.nextLine();
        scroll.close();
        
        String char1 = (str.substring(str.length()-1));
        String wOutChar1 = str.substring (0);
        String newStr = wOutChar1 + char1; 
        
        return newStr;
    }
}

