import java.util.Scanner;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String path = get.nextLine();
        File folder = new File(path);
        boolean flag = false;

        if(!folder.exists()){
            System.out.println("Folder does not exist, creating it");
            folder.mkdir();
            flag = true;
            continue;
        }else{
            System.out.println("Content of folder before creating new file");
            System.out.println(folder.list());

            if(folder.length() == 0){
                System.out.println("folder is empty");
            }

            folder.createNewFile();
            System.out.println("Content of folder after creating new file");
            System.out.println(folder.list());
        }

        if(flag){
            System.out.println("Content of folder before creating new file");
            System.out.println(folder.list());

            if(folder.length() == 0){
                System.out.println("folder is empty");
            }

            folder.createNewFile();
            System.out.println("Content of folder after creating new file");
            System.out.println(folder.list());
        }




    }
}
