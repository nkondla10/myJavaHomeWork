import java.util.Scanner; 
public class Data {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two numbers: ");
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	
	int addResult = add(n1*2, n2+3);
	
	System.out.println()
	
	System.out.println(mult(addResult,n2));
	System.out.println(sub(10,addResult));
	System.out.println(sub(n1*n2, addResult));
	}
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
		public static int mult(int num1, int num2) {
		return num1*num2;
	}


public static int sub(int number1, int n2) {
	
	int num2 = 0;
	return number1 - num2;
}

}