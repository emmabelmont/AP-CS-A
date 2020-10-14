import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{   
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();
    
    
    str = "" + isPalindrome(str); ;

    result.setText(str);
    input.selectAll();
  }
  
  public boolean isPalindrome(String word)
   {
       String text = word;
       int location = text.indexOf(" ");
       while (location>=0){
           text = text.substring(0,location) + "" + text.substring(location+1);
           location = text.indexOf(" ");
       }
         
       String firstL = text.substring(0,1);
       String lastL = text.substring(text.length()-1,text.length());
       for (int i = 0; i<= (text.length()/2+1); i++){
          if (firstL.equals(lastL)){ 
             firstL = text.substring(i,i+1);
             lastL = text.substring((text.length()-i-1), text.length()-i); 
          }
          else{
              return false;
          }
          
       }            
      return true; 
   }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

