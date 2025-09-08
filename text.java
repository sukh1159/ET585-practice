import java.util.Scanner;

class text {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String myString = input.next();
        System.out.print("Enter your age: ");
        int number = input.nextInt();
    
        
        System.out.println("Your name is " + myString + ", and you are " + number + " years old.");

    }
}