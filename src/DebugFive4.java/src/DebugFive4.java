
import java.util.Scanner;
public class DebugFive4
{
   public static void main (String args[]) 
   {
      Scanner input = new Scanner(System.in);
      int one, two, three, four;
      String str, output;
      System.out.println("Enter an integer");
      str = input.next();
      one = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      two = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      three = Integer.parseInt(str);
      System.out.println("Enter an integer");
      str = input.next();
      four = Integer.parseInt(str);
      if(one > two > one > three > one > four)
         output = "Highest is " + four;
      else  
    	  if(one > two > one > three > one > four)
            output = "Highest is " + three;
         else
           if(three > one && three > two && three > four)
              output = "Highest is " + three;
           else
              output = "Highest is " + four;
      System.out.println(output);
   }
}