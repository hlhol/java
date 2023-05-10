import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner get = new Scanner(System.in);

    //create an array
        int[] num = new int[4];
        for(int i = 0; i< num.length; i++){
            System.out.println("Enter number");
            num[i] = get.nextInt();

        }


        System.out.println("Array content:");
         for(int j=0; j< num.length; j++){

             System.out.println(num[j]);
         }
         double avg = 0;

         for (int k = 0; k< num.length; k++){
             avg += num[k];
         }

        System.out.println("Enter Array average: " + avg/ num.length);











        //String[] students = {"John", "Maryam", "Fatema", "Paul", "Zainab", "Mary", "Ahmed", "Peter", "Hussain", "Sayed Hussain"};
        //double[] grades = {52.4, 67.9, 87.3, 45.2, 77.8, 93.6, 83.9, 62.7, 68.9, 78.2};
    }


















    /*public static void searchHighest(String[] students, double[] grades){
        int i;
        double mark = grades[0];
        String hiname = students[0];

        for(i = 0; i< grades.length; i++) {
            if (grades[i]> mark){
                mark = grades[i];
                hiname = students[i];
            }

        }


        while(i< grades.length){
            if (grades[i]> mark){
                mark = grades[i];
                hiname = students[i];
            }
            i++;
        }

        System.out.println( hiname + " got the highest grades of the class: "+ mark);




    }

    public static double average(String[] students, double grades[]){
        double total = 0;
        int j;

        for (j = 0; j<grades[j]; j++){
            total += grades[j];
            j++;

        }

  /*      while (j<grades[j]){
            total += grades[j];
            j++;
        }
*/

}
