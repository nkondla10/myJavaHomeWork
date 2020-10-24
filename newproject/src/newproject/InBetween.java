package newproject;

import java.util.Scanner;

public class InBetween {
	public static void main(String[] args) {

		int a, b;

		int min=0, max=0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number: ");

		a = input.nextInt();

		System.out.println("Enter the second number: ");

		b = input.nextInt();

		System.out.println("\nThe numbers in between are:");

		if (a < b) {

			min = a;

			max = b;

		} else if (b < a) {

			min = b;

			max = a;

		} // end if

		if (max - min <= 1)

			System.out.println("There are no values between the numbers you entered");

		else {

			while (min<max-1) {

				System.out.println(++min);

			} 
		}
	}
}