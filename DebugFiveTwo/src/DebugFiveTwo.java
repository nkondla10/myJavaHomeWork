
import java.util.Scanner;
public class DebugFiveTwo
{
   public static void main(String args[])
   {
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      System.out.print("Enter another number ");
      num2 = inputnextInt();
      if((num % num2 == 0) && (num2 % num) == 0)
         System.out.println("One of these numbers is evenly divisible into the other");
      else 
         System.out.println("Neither of these numbers is evenly divisible into the other");
   }

private static int inputnextInt() {
	// TODO Auto-generated method stub
	return 0;
}

}