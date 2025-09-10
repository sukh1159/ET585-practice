/*
Exercise:
Initialize a string "nyc",
and change the string to following lines
use string method and op.

nyc
NYC
New
New York
New York City
new york city
city



public class L2 {
    public static void main(String[] args){
        String txt = "nyc";
        System.out.println(txt);
        txt = txt.toUpperCase();
        System.out.println(txt);
        
        txt= txt.replace('Y','e').replace('C','w');
        System.out.println(txt);
        txt = txt + " York";
        System.out.println(txt);
        txt = txt.concat(" City");
        System.out.println(txt);
        txt = txt.toLowerCase();
        System.out.println(txt);
        txt = txt.substring(9);
        System.out.println(txt);



    }
}

*/
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

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("Enter age: ");
        int a = input.nextInt();
        if(18 < a && a < 75){
            System.out.println("You can Drive.");
        }
        else if(a < 0){
            System.out.println("You Are idoit");
        }
        else if(0 <= a && a <= 18){
            System.out.println("You are not eligible to drive");
        }   
        else{
            System.out.println("Do not drive for your safety");
        } 

    }
}

*/
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

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("'c' for Cheeseburger\n'b' for beef burger\n'f' for franch fry\n'w' for water \n");
        System.out.printf("Enter your choice: ");
        char option = input.next().charAt(0);
    switch (option) {
      case 'c':
        System.out.println("Cheeseburger");
        break;
      case 'b':
        System.out.println("beef burger");
        break;
      case 'f':
        System.out.println("franch fry");
        break;
      case 'w':
        System.out.println("water");
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}
