

import java.util.Scanner;
public class NumbersDemo2 {
public static void main (String [] args )
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter values for num1");
	int num1 = in.nextInt();
	System.out.println("Enter values for num2");
    int num2 = in.nextInt();
	//Calling method to display TwiceTheNumber
	()
	displayTwiceTheNumber(num1);
	displayTwiceTheNumber(num2);
	// Calling method to display NumberPlusFive
	()
	displayNumberPlusFive(num1);
	displayNumberPlusFive(num2);
	// Calling method to display NumberSquared 
	displayNumberPlusSquared(num1);
	displayNumberPlusSquared(num2);
}

private static void displayNumberPlusSquared(int num1) {
	// TODO Auto-generated method stub
	System.out.println(num1 + "times 2 is " + num1*2 );
	
}
 private static void displayNumberPlusFive(int num1) { 
	// TODO Auto-generated method stub
	 System.out.println(num1 + "plus  5" + "is" + (num1*5));
	
}

private static void displayTwiceTheNumber(int num1) {
	// TODO Auto-generated method stub
	System.out.println(num1 + "squared is" + (num1*1));
}
}
