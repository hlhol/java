import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);


    }

    /*public static void printReversedOrder(int input) {

        String x = Integer.toString(input);
        if (x.length() != 3)
            System.out.println("incorrect input.");
        else
            System.out.println(x + " reversed is " + x.charAt(2) + x.charAt(1) + x.charAt(0) + ".");
    }*/

    /*static void getDecadeBorn(String x) {
        if (x.length() != 2) {
            System.out.println("incorrect input parameter.");
        } else if (Character.getNumericValue(x.charAt(0)) == 9) {
            System.out.println("You were born in the :th decade of the century.");
        } else {
            System.out.println("You were born in the " + (Character.getNumericValue(x.charAt(0)) + 1) + "th decade of the century.");
        }
    }*/

    public static void getDecadeBorn(int year) {
        String x = Integer.toString(year);
        if ((x.length() == 2 && Character.getNumericValue(x.charAt(0)) == 0) || (x.length() == 1))
            System.out.println(
                    "You were born in the " + Character.getNumericValue(x.charAt(x.length() - 1)) + "th decade of the century.");
        else
            System.out.println(
                    "You were born in the " + (Character.getNumericValue(x.charAt(0)) + 1) + "th decade of the century.");
    }


}