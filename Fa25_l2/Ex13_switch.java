import java.util.Scanner;
public class Ex13_switch {
  public static void main(String[] args) {
    // Switch Statements
    System.out.print("Enter your workday, M,T,W,H,F:");
    Scanner input = new Scanner(System.in);
    char day = input.next().charAt(0);
    switch (day) {
      case 'M':
        System.out.println("Monday");
        break;
      case 'T':
        System.out.println("Tuesday");
        break;
      case 'W':
        System.out.println("Wednesday");
        break;
      case 'H':
        System.out.println("Thursday");
        break;
      case 'F':
        System.out.println("Friday");
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}
/*
Exercise
Write a switch statement menu option program.
Ask user enter choice for the burger

'c' for Cheeseburger
'b' for beef burger
'f' for franch fry
'w' for water

if user enter other things, we should print "invlaid option"
*/
