import java.util.Scanner;
public class Ex8_else {
  public static void main(String[] args) {
    // block of code to be executed
    // if the condition is true
    Scanner input = new Scanner(System.in);

    // if-else
    System.out.print("Enter time:");
    int time = input.nextInt();
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
  }
}
/*
exercise:

ask user's age, if user age is greater than 18
print out "You can drive".
if not, then print out "You are not eligible to drive"

example output 1:
Enter your age: 20
You can drive

example output 2:
Enter your age: 10
You are not eligible to drive
*/
