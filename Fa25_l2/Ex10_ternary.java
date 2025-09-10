import java.util.Scanner;
public class Ex10_ternary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter time: ");
    int time = input.nextInt();
    // Short Hand If...Else
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    if(time < 18) result = "Good day.";
    else result = "Good evening.";
    System.out.println(result);

    System.out.println((time < 18) ? "Good day." : "Good evening.");
  }
}
/*
Exercise:
Ask user enter a grade.
user will get Pass if grade is greater than 60
user will get Fail if grade is not greater than 60
User ternary operator

Example output:
Enter grade: 80
Pass

Enter grade: 50
Fail
*/
