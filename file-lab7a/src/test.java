import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String path = get.nextLine();
        File folder = new File(path);

        if(!folder.exists()){
            System.out.println("Folder does not exist, creating it" );
            folder.mkdir();
        }

        System.out.println("");
        System.out.println("Content of folder before creating new file" );
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Folder is empty"+ "\n");
            File newFile = new File(folder, "newfile.txt");
            newFile.createNewFile();
            System.out.println("\nCreating new file\n");

            System.out.println("Content of folder after creating new file" );
            for (String fileName : folder.list()){
                System.out.println(fileName);
            }



        } else {



            for (String fileName : folder.list()){
                System.out.println(fileName);
            }

            File newFile = new File(folder, "newfile.txt");
            newFile.createNewFile();
            System.out.println("\nCreating new file\n");

            System.out.println("Content of folder after creating new file" );
            for (String fileName : folder.list()){
                System.out.println(fileName);
            }
        }

        }



    }
