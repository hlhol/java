import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Write your name: ");

        String name = get.nextLine();

        System.out.println(name.length());

    }
}