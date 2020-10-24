import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		System.out.print("Enter your age >> ");
        Scanner input = new Scanner(System.in);
        int myage = input.nextInt();
        
System.out.println("My age is " + myage + "\n Twice my age is " + myage * 2 + "\n Three times my age is " + myage * 3 + "\n Half of my age is " + (float)myage/2);

}

}