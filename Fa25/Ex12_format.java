import java.util.Scanner;


public class Ex12_format {
    // Converts centimeters to feet and inches.
    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54; // 2.54 cm = 1 inch
        //CM_PER_INCH = 1.0;
        final int IN_PER_FOOT = 12;      // 12 inch = 1 feet
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many cm? ");
        cm = in.nextDouble();

        // convert and output the result
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;

        System.out.println(cm+" cm = "+feet+" ft, "+remainder+" in\n");

        System.out.printf("%.2f cm = %d ft, %d in\n",cm, feet, remainder);
    }
}
/*
Exercise:
Ask use enter celcius temperature
convert celcius to fahrenheit,
display the result. Use the format, printf
f = 9/5c + 32

Example:
Enter celsius: 100
100.0 celcius is 212.0 fahrenheit.
*/

/*
Aks user to enter USD.
Convert USD to JPY, CNY, EUR.
1 USD = 138.81 JPY = 7.18 CNY = 0.89 EUR

Example:
Enter USD: 100
100 USD = 13881 JPY = 718 CNY = 89 EUR
*/
