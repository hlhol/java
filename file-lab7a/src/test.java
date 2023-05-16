import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String path = get.nextLine();
        File folder = new File(path);

        if(!folder.exists()){

        }

    }
}