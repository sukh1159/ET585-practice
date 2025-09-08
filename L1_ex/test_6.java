/*
 Exercise 6
• Declare one integer and one double
• Let user enter the integer
• Divide integer by 10 and store in the double
• Print out the double to the screen

 */


import java.util.Scanner;

public class test_6 {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in);
       System.out.printf("Enter integer: ");
       int i = input.nextInt();
       double d;
       d = (double) i/10;
       System.out.println("Double to screen: " + d);
       input.close();

    }
}