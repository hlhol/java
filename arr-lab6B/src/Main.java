public class Main {
    public static void main(String[] args) {
        String[] students = {"John","Maryam","Fatema","Paul","Zainab", "Mary", "Ahmed","Peter", "Hussain","Sayed Hussain"};
        double[] grades = {52.4,67.9,87.3,45.2,77.8,93.6,83.9,62.7,68.9,78.2};
    }

    public static void searchHighest(String[] students, double[] grades){
        int i;
        double mark = grades[0];
        String hiname = students[0];

        for(i = 0; i< grades.length; i++) {
            if (grades[i]> mark){
                mark = grades[i];
                hiname = students[i];
            }

        }


        /*while(i< grades.length){
            if (grades[i]> mark){
                mark = grades[i];
                hiname = students[i];
            }
            i++;
        }
*/
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
        return total/grades.length;
    }s
}