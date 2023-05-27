import java.util.Scanner;
import java.io.*;
import java.io.PrintStream;
public class Main {
    public static void main(String[] args) throws IOException {
        copyFile("C:\\Users\\7uss3\\IdeaProjects\\lab7c\\src\\names.txt");
    }

    public static  int[] read10() throws FileNotFoundException {
        Scanner get = new Scanner(System.in);
        File infile = new File("numbers.txt");
        PrintStream writer = new PrintStream(infile);
        int[] num = new int[10];

        for(int i = 0; i< num.length ;i++){
            System.out.println("Enter number");
            num[i] = get.nextInt();
            writer.println(num[i]);
        }

        writer.close();

        return num;
    }



    public static String copyFile(String filename) throws FileNotFoundException, IOException
    {
        File infile = new File(filename);
        Scanner halhol = new Scanner(infile);
        Scanner get = new Scanner(System.in);

        String [] line =new String [100];
        if(!infile.exists()){
            System.out.println("File was not found");
        }else {

            int i = 0;
            while (halhol.hasNext()){

                line[i] = halhol.nextLine() ;

                i++;
            }

            System.out.println("Enter a new name for the file:");
            String holder = get.nextLine();

            File outFile= new File("numbers.txt");
            PrintStream output = new PrintStream (outFile);
            for(int j =0; j< line.length; j++){
                output.println(line[i]);
            }

        }
        return null;
    }
}