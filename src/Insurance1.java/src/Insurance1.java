
import java.util.Scanner;

public class Insurance1

{

   //static variables to hold mandatory values

    static int age;

    static int premium;

    static int decades;

public static void main(String[] args) {

       try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter your age in current year: ");
		
		 age = sc.nextInt();
	}

       //user prompted to enter present age

 

 //computation to calculate premium amount

 decades = age/10;

 premium = (decades + 15)*20;

 System.out.println("");

 System.out.println("The annual premium to be paid for age "+age+" is $"+ premium);

}

}