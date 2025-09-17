// Exercise 2: Print 100 to 200 use while
/* 
public class L3 {
  public static void main(String[] args) {
    int i = 100; 
    while (i <= 200) { 
      System.out.print(i+ " ");
      i++; 
    }
    System.out.println();
  }
}



//Exercise 3: Print all the even number from 1 to 100; 2 4 6 8 10 12 ... 98 100

public class L3 {
  public static void main(String[] args) {
    int i2 = 0; 
    while (i2 <= 100) { 
      if(i2%2==0){
        System.out.print(i2+ " ");     
      }
      i2++;
    }
    System.out.println();
// second approch;
int i3=2;
while(i3<100){
  System.out.print(i3+" ");
  i3+=2;
}
  System.out.println();
  }
}


//Exercise 4: calculate sum of 1 to 100 use while 1+2+3+4..+100 = 5050

public class L3 {
  public static void main(String[] args) {
    int i4 = 0; 
    int sum = 0;
    while (i4 <= 100) { 
      sum = sum + i4;     
      i4++;
    }
    System.out.println(sum);
  }
}

// Exercise 5: calculate sum of even number from 1 to 100 ; 2 + 4 + 6 + 8 + .... + 100 = 2550

public class L3 {
  public static void main(String[] args) {
    int i5 = 0; 
    int sum = 0;
    while (i5 <= 100) { 
      if(i5 % 2 ==0){
       sum = sum + i5;     
      }
      i5++;
    }
    System.out.println(sum);
  }
}


// Exercise 7: ask user enter a number n, then print 1 to n
//Example:
// Enter a number: 10
// 1 2 3 4 5 6 7 8 9 10

import java.util.Scanner;

public class L3 {
  public static void main(String[] args) {
    int i5 = 0; 
    int sum = 0;
    while (i5 <= 100) { 
      if(i5 % 2 ==0){
       sum = sum + i5;     
      }
      i5++;
    }
    System.out.println(sum);
  }
}


// Exercise 6: calculate the factorial 10 use while 10! = 10 * 9 * 8 * 7 .... * 1 = 3628800

public class L3 {
  public static void main(String[] args) {
    int r = 1; 
    int i = 10;
    while (i >= 1) { 
      r = r * i;     
      i--;
    }
    System.out.println(r);
  }
}

Exercise 10: Write a program to print all the
numbers from n1 to n2, where n1 and n2 are two
numbers specified by the user. n1 should less than
n2 (Hint: You’ll need to prompt for two values n1
and n2; then initialize i to n1 and use n2 in the loop
condition.)
Output Example (input in bold):
Enter a first number: 10
Enter a second number: 20
10 11 12 13 14 15 16 17 18 19 20




import java.util.Scanner;
public class L3 {
  public static void main(String[] args) {
    System.out.print("Enter a First number:");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.print("Enter a second number:");
    int m = input.nextInt();
   
    int i =n;
    while(i<=m){
      System.out.print(i + " ");
      i++;
    }
    System.out.println();
  }
}



// for loop;
// Exercise 1: Print 1 to 100 use for loop


public class L3 {
  public static void main(String[] args) {
    for(int i =0; i<=100; i++){
        System.out.print(i+" ");
    }
    System.out.println();
  }
}



// Exercise 2: Print 100 to 200 use for loop

public class L3 {
  public static void main(String[] args) {
    for(int i =100; i<=200; i++){
        System.out.print(i+" ");
    }
    System.out.println();
  }
}




// Exercise 3: Print all the even number from 1 to 100 ; 2 4 6 8 10 12 ... 98 100

public class L3 {
  public static void main(String[] args) {
    for(int i =0; i<=100; i++){
        if(i % 2 ==0){
            System.out.print(i+ " ");
        }
    }
    System.out.println();
  }
}


//Exercise 4: calculate sum of 1 to 100 use while 1+2+3+4..+100 = 5050

public class L3{
  public static void main(String[] args){
    int sum = 0;
    for(int i=1;i<=100;i++){
      sum = sum + i;  
    }
    System.out.println(sum);
  }
}




//Exercise 5: calculate sum of even number from 1 to 100 ; 2 + 4 + 6 + 8 + .... + 100 = 2550

public class L3{
  public static void main(String[] args){
    int sum = 0;
    for(int i=0;i<=100;i++){
      if(i % 2 ==0){
        sum = sum + i;
      }
      
    }
      System.out.println(sum);
  }
}

*/

// Exercise 6: calculate the factorial 10 use while 10! = 10 * 9 * 8 * 7 .... * 1 = 3628800

public class L3{
  public static void main(String[] args){
    int sum = 1;
    for(int i=10;i>1;i--){
      
        sum = sum * i;
      
    }
      System.out.println(sum);
  }
}