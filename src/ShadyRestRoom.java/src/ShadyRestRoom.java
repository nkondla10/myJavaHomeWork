
import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) {
        // Declare the required variables 
    	int choice, room_price= 0;
    	//Display the menu of choices 
    	System.out.println("Enter 1 for a queen bed");
    	System.out.println("Enter 2 for a king bed");
    	System.out.println("Enter 3 for a king and a" + "pullout coach");
    	//Prompt the user to enter a valid choice using scanner class object
    	System.out.println("\nEnter the choice");
    	Scanner sc = new Scanner(System.in);
    	choice = sc.nextInt();
    	//display the user choice 
    	System.out.println("\nUser choose" + choice + "" + "which is");
    	//If the user's choice is 1, then display the price of queen type room.
    	if(choice==1)
    	{
    		room_price = 125;
    		System.out.println("a queen bed");
    		System.out.println("Price of queen bed" + "room in $" +room_price);
    		//If the user's choice is 2, then display the price of king type room.
    	}
    		else if(choice == 2)
    		{
    			room_price =139;
    			System.out.println("a king bed");
    			System.out.println("Price of king bed"+ "room is $" + room_price);
    		}
    			//If the user's choice is 3, then display the price of suite with king type bed and pullout couch room.
    			else if(choice == 3)
    		
    			{
    				room_price = 165;
    				System.out.println("a suite with king" + "bed and" + "a pullout couch" + "is $" + room_price);
    				// Otherwise
    				{
    					// set the price of room to 0 and display an appropriate message 
    					room_price = 0;
    					System.out.println("an invalid choice!");
    				}
    				// Close the scanner object 
    				sc.close();
    			}
    		}
    }
