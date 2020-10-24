import java.util.Scanner;

public class Application {
 public static void main(String[]args) {
	 
      //Create a scanner object 
	 Scanner input = new Scanner(System.in);
	 
	 // Output the prompt 
	  System.out.println("Enter a floating point value: ");
	  
	  // Wait for the user to enter a line of text
	 double value = input.nextDouble();
	 
	 // Tell them what they entered 
	 System.out.println("You entered: " + value);
	 
	 System.out.println("Enter a number: ");
	 
	 int value = scanner.nextInt();
	 
	 while(value !=5) {
		 System.out.println("Enter a number: ");
		value = scanner.nextInt();
	 }
      System.out.println("Got 5!")
   }
 
} 