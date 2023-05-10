import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0]="Ahmed";
        names[1]="Maryam";
        names[2]="Abdulla";
        names[3]="Younis";
        names[4]="Saeed";
        names[5]="Zahra";
        names[6]="Latifa";
    }

    public static String[] addName(String[] names){

        Scanner get = new Scanner(System.in);

        for(int i = 0; i< names.length; i++){
            if(names[i] == null){
                System.out.println("Add a student name");
            }
        }



        return names;
    }
}