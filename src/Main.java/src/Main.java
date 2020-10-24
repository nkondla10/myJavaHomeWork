

import java.util.Scanner;

public class Main {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
        System.out.print("The largest is " + largest(x, y, z)+"\n" );
         System.out.print("The median value is " + median(x, y, z)+"\n" );
    }

   public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
       
    }
   public static double largest(double x, double y, double z)
   {
       return Math.max(Math.max(x, y), z);
   }
   public static double median(double x, double y, double z)
   {
	   //return Math.median(Math.median(x, y), z);
     if ((x < y && y < z)|| (z < x &&  x < y  ))
return y; 
else if ((y < x && x < z ) || (z < x && x < y ))
       return x;
       else 
    	   return z; 
   }
}
