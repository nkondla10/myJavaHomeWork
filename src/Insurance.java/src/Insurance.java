
//The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20.

//For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20.

//Write an application that prompts a user for the current year then a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount.
import java.util.Scanner;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int currentyear, birthclient;
	System.out.print("Enter current year:");
	currentYear =sc.nextInt();
	System.out.print("enter birth year");
	int birthyear = sc.nextInt();
	Insurance client = new Insurance(birthClient,currentYear);
	
}

	}
	
	
}
public class Insurance {
private int currentYear;
private int birthClient;
private int premiumAmount;

public Insurance(int birthClient, int currentYear) {
this.birthClient = birthClient;
this.currentYear = currentYear;
}

public int getCurrentYear() {
return currentYear;
}

public int getPremiumAmount() {
return premiumAmount;
}

public void setCurrentYear(int currentYear) {
this.currentYear = currentYear;
}

public int getBirthClient() {
return birthClient;
}

public void setBirthClient(int birthClient) {
this.birthClient = birthClient;
}

public void calcPremiumAmount() {
premiumAmount = (((currentYear - birthClient) / 10) + 15) * 20;
}
}