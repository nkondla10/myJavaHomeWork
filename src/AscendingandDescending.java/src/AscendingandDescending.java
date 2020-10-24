
import java.util.Scanner;
public class AscendingandDescending {
    public static void main(String[] args) {
        // Declare neccessary variables 
    	int num_1, num_2, num_3;
    	int low1, medium,high1;
    	//Create Scanner object 
    	Scanner in = new Scanner(System.in);
    	//Prompt the user to enter first integer 
    	System.out.println("Enter first integer");
    	// Get the first integer from the user
    	num_1 = in.nextInt();
    	//Prompt the user to enter second integer
    	System.out.println("Enter second integer");
        // Get the second integer from the user
    	num_2 = in.nextInt();
    	// Prompt the user to enter third integer
    	System.out.println("Enter third integer");
    	num_3 = in.nextInt();
    	if(num_1<=num_2&&num_1<=num_3);
    	{
    		// Assign the first number to low1
    	      low1 = num_1;
    		if(num_2<=num_3);
    		// Assign the second number to medium 
    		medium = num_2;
    		//Assign the third number to high1 
    		high1 = num_3;
    		// Otherwise 
    		{
    			if(num_2<=num_1&&num_2<=num_3);
    			//Assign the second number to low1
    			low1 = num_2;
    			if(num_1<=num_3) {
    		}
			
    		
    	}
    }
}
}