import java.util.Scanner;
import java.io.*;

public class reader {
    //it is work
    public static void main(String[] args) throws FileNotFoundException {
        File infile = new File("C:\\Users\\7uss3\\IdeaProjects\\revision array\\src\\jumppp.txt");
        Scanner jaffar = new Scanner(infile);

        for(int  i = 0; jaffar.hasNext(); i++){
            System.out.println(jaffar.nextLine());
        }

    }
}
