package newproject;

public class TestCase1 { 
	private static Object sum;
	public static void main(String[] args) {
	        //todo
	        printStars(10);
	        Multiples(10);
	        System.out.println("\n");
	        //System.out.pintln(hasAnEvenDigit(33267));
	       // System.out.println(hasAnEvenDigit(7591));
	        System.out.println("The number 33267: " + hasAnEvenDigit(33267));
	        System.out.println("The number 7591: " + hasAnEvenDigit(7591));

	    }
	    static void printStars(int n) {
	        //todo
	        for (int i=1; i<=n; i++) {
	            System.out.println("*");
	        }
	    }

	    static void Multiples (int n) {
	        //todo
	        for (int i=1; i<=n; i++) {
	            System.out.print(10 * i + " ");
	        }
	    }
	    static boolean hasAnEvenDigit(int n) {
	        int lastDigit ;
	        double div;
	        int reminder = 0;
	        while (n > 0) {
	            lastDigit = n % 10;
	            div = n/10;
	            reminder = (int)div;
	            if (reminder % 2 == 0) {
	                return true;
	            } else {
	                return false;
	            }
	        }
	        return false;
	    }
	}

