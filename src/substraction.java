import java.util.Scanner;

public class substraction {

    public static void main(String[] args) {
        Scanner get =new Scanner( System.in);
        int num1;
        int num2;
        int sum;
        System.out.println( "Enter first integer: " ); // prompt user what to do
        num1 = get.nextInt(); // read first number from user
        System.out.println( "Enter second integer: " ); // prompt user what to do
        num2 = get.nextInt(); // read second number from user and save in variable
        sum = num1 - num2; // 5 - subtract numbers and save in variable
        System.out.println( "Sum is " + sum ); // 6 - display sum
    }
}
