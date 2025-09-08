import java.util.Scanner;

/* 
class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
    
        int s = n*n;
        
        System.out.println("Square of "+ n +" is " + s + ".");

    }
}


*/

class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Celcius: ");
        double c = in.nextDouble();
    
        double f = c*9/5 +32;
        
      //  System.out.println( + c+ " C = " + f + " F.");
        System.out.printf("%.1f C = %.1f F\n",c,f);


    }
}