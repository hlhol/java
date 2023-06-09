import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        //for next quastion
        createFileIn("C:\\Users\\7uss3\\OneDrive\\Desktop\\motion\\rfake ring\\fake ring_AME");

        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String path = get.nextLine();
        File folder = new File(path);

        if (!folder.exists()) {
            System.out.println("Folder does not exist, creating it");
            folder.mkdir();
        }

        System.out.println("");
        System.out.println("Content of folder before creating new file");
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Folder is empty");
            System.out.println("\nCreating new file\n");
            File newFile = new File(folder.getCanonicalPath() + File.separator + "newfile.txt");
            newFile.createNewFile();
            System.out.println("Content of folder after creating new file");
            for (String fileName : folder.list()) {
                System.out.println(fileName);
            }
        } else {
            for (String fileName : folder.list()) {
                System.out.println(fileName);
            }

            File newFile = new File(folder.getCanonicalPath() + File.separator + "newfile.txt");
            if (!newFile.exists()) {
                newFile.createNewFile();
                System.out.println("\nCreating new file\n");
            } else {
                System.out.println("File Exists Already");
            }

            System.out.println("Content of folder after creating new file");
            for (String fileName : folder.list()) {
                System.out.println(fileName);
            }
        }
    }

    public static void createFileIn(String path) {
        File folder = new File(path);
        if(!folder.exists()){
            System.out.println("Folder does not exist");
            return;
        }

        System.out.println("");
        System.out.println("Folder Content before creating new file");
        File[] files = folder.listFiles();
        if (files.length == 0) {
            System.out.println("Folder is empty");
        } else {
            for (String fileName : folder.list()) {
                System.out.println(fileName);
            }
        }

        File newFile = new File(folder, "newfile.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
                System.out.println("\nCreating new file\n");
            } catch (IOException e) {
                System.out.println("Error creating new file");
            }
        } else {
            System.out.println("File Exists Already");
        }

        System.out.println("Folder Content after creating new file");
        for (String fileName : folder.list()) {
            System.out.println(fileName);
        }
    }
    }


