package newproject;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Print Name: ");
        String name = input.next();
        //while loop 20 iterations
        int i = 0;
        while (i<20) {      // A while-loop statement
            //System.out.print(name + " ");
            printName(name);
            ++i;
        }


        System.out.println("Print age: ");
        int age = input.nextInt();
        int j = 1;
        while (j<= age) {      // A while-loop statement
          //System.out.print(Age + " ");
            printAge(j);
            ++j;
        }


    }

        private static void printName(String name){
            //ToDO
            System.out.println("Name is: " + name);
        }
        private static void printAge(int age){
            //ToDO
            System.out.println("Age is: " + age);
        }


}