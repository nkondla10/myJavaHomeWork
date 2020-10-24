import java.util.Scanner;

public class Average {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = input.nextInt();
System.out.println("Enter second number: ");
int b = input.nextInt();
System.out.println("Average of " + a + " and " + b + " is:" + average(a,b));
}
private static double average (int a, int b) {
//double avg = (a+b)/2.0;
return (double)(a+b)/2;

}

}