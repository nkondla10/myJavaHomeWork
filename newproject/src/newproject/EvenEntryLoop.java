package newproject;

import java.io.DataInputStream;
import java.util.Scanner;
public class EvenEntryLoop {

	static int number;
	static Scanner scanner = new Scanner(new DataInputStream(System.in));
	public static void main(String[]args) {
		System.out.println("Hi");
		while(true) {
			System.out.println("Please type an even number to continue or '999' to stop");
			System.out.println("x is not a even number ");
			number = scanner.nextInt();
			if(number == 999) {
				System.out.println("Bye");
				System.exit(0);
			}
			if(number % 2 !=0) {
				//System.out.println("Wrong input! Try again.");
			}else {
				System.out.println("Good Job!");
			}
		}
	}
}
