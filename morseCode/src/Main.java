
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = get.nextInt();

        if(num>9){
            System.out.println("Morse code only 0 - 9");
        }else {


            switch (num) {
                case 0:System.out.println("-----");break;
                case 1:System.out.println(".----");break;
                case 2:System.out.println("..---");break;
                case 3:System.out.println("...--");break;
                case 4:System.out.println("....-");break;
                case 5:System.out.println(".....");break;
                case 6:System.out.println("-....");break;
                case 7:System.out.println("--...");break;
                case 8:System.out.println("---..");break;
                case 9:System.out.println("----.");break;

            }
        }

    }

}