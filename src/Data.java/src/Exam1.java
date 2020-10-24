import java.util.Scanner;

public class Exam1{

public static void main(String[] args){

Scanner inputData = new Scanner(System.in);

System.out.println("Enter a number1");

int num1 = inputData.nextInt();

System.out.println("Enter a number2");

int num2 = inputData.nextInt();

System.out.print("Square of number 1: " + num1 * num1 + " Square of number 2: " + num2 * num2 );

}

}