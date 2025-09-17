import java.util.Scanner;
public class Ex4_do_while {
  public static void main(String[] args) {
    // do-while loop
    Scanner input = new Scanner(System.in);
    int n;
    do{
      System.out.print("Enter a positive number:");
      n = input.nextInt();
    } while(n<=0);
    System.out.println("You entered "+n);
  }
}
/* Exercise:
Ask user enter a number, 
and output whether the number is prime or not

Example:
Enter a number: 49
49 is not a prime number.

Enter a number: 13
13 is a prime number.
*/