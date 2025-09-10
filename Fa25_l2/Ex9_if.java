import java.util.Scanner;
public class Ex9_if {
  public static void main(String[] args) {
    // block of code to be executed
    // if the condition is true
    System.out.print("Enter time: ");
    Scanner input = new Scanner(System.in);

    // if-else-if-else
    int time = input.nextInt();
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
  }
}
/*
Exercise:
Ask user'age, if user age is greater than 18 less than 75
print out "You can drive".  if 18 < a < 75 (&&)

if user enter negative age, then print "you are idiot"

if user age is between 0 - 18, (&&)
then print "You are not eligible to drive". 0 <= a <= 18

if user age is greater or equal than 75,
then print "Do not drive for your safety"

20
80
10
-10
*/
