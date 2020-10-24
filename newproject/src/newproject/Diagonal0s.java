package newproject;

public class Diagonal0s {

	public static void main(String args[]) {
	    int row, col;


	    for(row = 1; row < 10; row++) {
	      for(col = 1; col <= row; col++) {
	          if(col==row){
	            System.out.print("     O ");
	          } else{
	              System.out.print(" ");
	          }
	      }
	      System.out.println();     
	    }
	  }
	}
