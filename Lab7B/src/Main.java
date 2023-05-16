import java.util.Scanner;
import java.io.*;
public class Main {
            public static void main(String[] args) throws Exception {
                Scanner get = new Scanner(System.in);
                System.out.println("Please enter the name of a file to read");
                String path = get.nextLine();

                File inFile = new File(path);
                Scanner jaffar = new Scanner(inFile);
                for (int i = 1; jaffar.hasNext(); i++) {
                    System.out.println("Student no." + i + " is " + jaffar.nextLine());
                    readStudentList(path);
                }

            }
        }