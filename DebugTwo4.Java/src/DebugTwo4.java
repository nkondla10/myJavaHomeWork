import java.util.Scanner;
public class DebugTwo4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      string costString;
      double cost;
      final TAX = 0.06;
      System.out.println("Enter price of item you are buying");
      costString = input.next();
      cost = Double.parsedouble(costString);
      System.out.println("With " + TAX * 100 +
      "% tax,  purchase  is $" + cost + cost * TAX);
   }
}