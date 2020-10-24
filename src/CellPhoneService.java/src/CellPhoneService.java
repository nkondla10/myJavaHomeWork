
import java.util.Scanner;
public class CellPhoneService {
    public static void main (String args[]) {
        // Write your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Talk minutes");
    	int talkmin = sc.nextInt();
    	System.out.println("Enter the text message");
    	int textmsg = sc.nextInt();
    	System.out.println("Enter the Gigabyte Data");
    	int gbdata = sc.nextInt();
    	if(talkmin<500&& textmsg==0 && gbdata==0);
    	System.out.println("PLAN A IS RECOMMENDED FOR THE USER AT $49 per month");
    	 if(talkmin<500 && textmsg>0 && gbdata==0);
    	 {
    		System.out.println("PLAN B IS RECOMMENDED FOR THIS USER at 55$ per month");
    		{
    		
			int talk = 0;
			if (talk>=500 && textmsg>=100 && gbdata==0);
			{
				System.out.println("PLAN C IS RECOMMENDED FOR THIS USER at 61$ permonth");
			}
			 if (talkmin>=500 && textmsg>=100 && gbdata==0);
			}
    		{
    			System.out.println("PLAN D IS RECOMMENDED FOR THIS USER at 70$ permonth");
 
    		}
    		if(gbdata>0 && gbdata<2);
    		}
    	 { 
    		 System.out.println("PLAN F IS RECOMMENDED FOR THIS USER at 87$ permonth");

    	 }
    }
}
