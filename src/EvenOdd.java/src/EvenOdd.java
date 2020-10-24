

import java.util.Scanner;
public class EvenOdd {
    private static boolean isDivisibleByTwo;
	public static void main(String[] args) {
        // accept user input and check if number is even or odd
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter an integer >>");
    	int num = input.nextInt();
    	isEven(num);
    	
    	boolean divisible = false;
    	isDivisibleByTwo = divisible;
    	if(divisible == true);
    	System.out.println("The integer entered is even");
    	System.out.println("The integer entered is odd");
    }
    public static boolean isEven(int number) {
    	

if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
