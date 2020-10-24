package newproject;

public class Perfect {

	public static void main(String[] args) {
		final int MAX = 1000;
		for(int i = 2; i <= MAX; i++)
			if(perfect(i)== true)
				System.out.println(" The number " + i + " is perfect ");

	}

	public static boolean perfect(int n) {
		int sum = 1;
		int i;
		boolean result = false;
		 for (i = 2; i < n / 2; i++) {
		        if (n % i == 0) {
		            sum += i;
		        }
		    }
		 if (sum == i) {
			  return true;
			  }
			  else {
			  return false;
			  }
			 }
			}