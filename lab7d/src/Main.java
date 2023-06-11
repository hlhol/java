import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {

    }
    public static void percentageIncrease(String filename, double percent) throws FileNotFoundException, IOException
    {
        File infile = new File(filename);
        if(!infile.exists()){
            System.out.println("File does not exist");
        }else{
            String[] name = new String[100];
            int[] saler = new int[100];

            int i = 0;

            Scanner jaffar = new Scanner(infile);
            while(jaffar.hasNext()){

                String line = jaffar.nextLine();
                Scanner hlhol = new Scanner(line).useDelimiter("\"");
                while(hlhol.hasNext()){
                    name[i] = hlhol.next();
                    hlhol.next();
                    saler[i] = hlhol.nextInt() + (hlhol.nextInt()* (int)percent);

                }

                i++;
            }

            PrintStream writer = new PrintStream(infile);
            for (int j = 0;  j< name.length&& name[j] != null; j++){
                writer.println("\"" + name[j]+"\""+ "\t" + "\""+  saler[j] + "\"");

            }

            writer.close();
        }


    }
}