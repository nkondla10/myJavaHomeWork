import java.util.Scanner;

public class NumbersDemo {

public static void main(String[] args) {
	 Scanner in = new Scanner(System.in); 
	 {
		 int num1 = 1;
		 int num2 = 2;
		//Calling method to display TwiceTheNumber
		displayTwiceTheNumber(num1);
		displayTwiceTheNumber(num2);
		//Calling method to display NumberPlusFive
		displayNumberPlusFive(num1);
		displayNumberPlusFive(num2);
		// Calling method to display NumberPlusSquared
displayNumberPlusFive(num1);
displayNumberPlusFive(num2);
	}
}

public static void displayTwiceTheNumber(int num1) {
	
	 System.out.println(num1*2);
}

public static void displayNumberPlusFive(int num1) {

	System.out.println(num1+5);
	
	
}

public static void displayNumberSquared(int num1) {
	
	System.out.println (num1*num1);
	
}
}
