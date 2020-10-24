import java.util.Scanner;

import javax.swing.JOptionPane;
public class AgeDialog {
    public static void main(String[] args){
        int myage = 17;
        //System.out.print("Enter your age >> ");
        //Scanner input = new Scanner(System.in);
        //int myage = input.nextInt();
        JOptionPane.showMessageDialog(null,"My age is " + myage + 
        "\nTwice my age is " + myage * 2 + 
        "\nThree times my age is " + myage * 3 +
        "\nHalf of my age is " + (float)myage/2
        ,"Age Display",1);
    }
}
