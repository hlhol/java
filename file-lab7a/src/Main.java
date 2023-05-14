import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        listProperties("C:\\Users\\202201389\\IdeaProjects\\filename\\src\\file.txt");

        System.out.println("enter a filename");
        String name = get.nextLine();
        File inFile = new File(name);

        System.out.println("Printing properties of file\n" +
                        "--------------------------");
                System.out.println("Does it exist : " + inFile.exists());
                System.out.println("Size in byte : " + inFile.length());
                System.out.println("Writable : " + inFile.canWrite());
                System.out.println("Readable : " + inFile.canRead());
                System.out.println("Is File : " + inFile.isFile());
                System.out.println("Is Directory : " + inFile.isDirectory());
                System.out.println("Hidden : " + inFile.isHidden());
                System.out.println("AbsolutePath : " + inFile.getAbsolutePath());

            }
    public static void listProperties(String name){


        File inFile = new File(name);


        System.out.println("Printing properties of file "+ name +"\n" +
                "--------------------------");

        System.out.println("Does it exist : " + inFile.exists());
        System.out.println("Size in byte : " + inFile.length());
        System.out.println("Writable : " + inFile.canWrite());
        System.out.println("Readable : " + inFile.canRead());
        System.out.println("Is File : " + inFile.isFile());
        System.out.println("Is Directory : " + inFile.isDirectory());
        System.out.println("Hidden : " + inFile.isHidden());
        System.out.println("AbsolutePath : " + inFile.getAbsolutePath());
    }

    }
