import java.util.Scanner;
public class Percentages2
		{
	 public static void main (String args[])
		   {
		      double num1 = 2.5, num2 = 5.0;
		      computePercent(num1, num2);
		      computePercent(num2, num1);
		   }
		   public static void computePercent(double x, double y) {
		       // Modify the code below
		       System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
		   
		   }
		}