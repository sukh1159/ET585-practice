/*
 Print the square of a number.
Goal:
Get a number and print the square.
Instruction:
0. Declare a variable “n”. (Use double type)
1. Get user input of a number and store the value input in the variable
“n”.
2. Calculate the square of “n”.
3. Show the square of “n”.
4. Add comments in the code using //.

 */

import java.util.Scanner;

public class test_5 {
    public static void main (String[] agrs){
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter Decimal Number: ");
    double n = input.nextDouble();
    double m;
    m = n*n;
    System.out.println("Square of "+ n +" is " +m);
    input.close();
        
        }
    }
