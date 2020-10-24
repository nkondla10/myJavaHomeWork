// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }
   public static void calcTip(double bill)
   {
final float RATE = 0.15F;
float tip = (float)(bill * RATE);
System.out.println("For a bill of " + bill + " the tip should be at least " + tip);
 }
}