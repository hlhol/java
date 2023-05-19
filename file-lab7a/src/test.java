import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String path = get.nextLine();
        File folder = new File(path);

        if(!folder.exists()){
            System.out.println("Folder does not exist, creating it");
            folder.mkdir();
        }

        System.out.println("Content of folder before creating new file");
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Folder is empty");
        } else {

            for (int i = 0; i< files.length; i++){
                
            }

        }

        }



    }
}