import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFirst(new int[]{10,20,30,50,40,30}, 50));

        String word = "Philippe";
        decompose(word);

        int[] numberss = {1,2,3,4,5};
        System.out.println("Average of "+Arrays.toString(numberss)+" is "+average(numberss));
        average(numberss);
    }

    public static double average(int []numberss ) {
        //create a double verible
        double total = 0;


        //start for loop to to plus the number in array to total
        for(int i = 0; i<numberss.length ;i++){
            total = total + numberss[i];
        }
        //to get averege you dvide total with  length of array
        double avg = total/ numberss.length;

        //return the averege
        return avg;
    }




    public static int occurrences(int num, int[] arr) {
        //create a counter with name count to count the repeataion
        int count = 0;

        //start a for loop to plus the count of number
        for (int i = 0; i < arr.length; i++) {
            //if the number  ==  the number of array plus the count
            if (arr[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static char [] decompose(String word) {
        char[] res = new char [word.length()];

        for(int i = 0; i< word.length();i++){
            res[i] = word.charAt(i);
        }
        System.out.println("The word \""+word+"\" decomposes as "+ Arrays.toString(decompose(word)));
        return res;
    }

















    public static int findFirst(int[] vector, int value){
        boolean cond = false;

        //this ivaribeland while loop just for pass the recuird
        int j = 0;
        while(j< vector.length){
            break;
        }

        //start for loop
        for(int i = 0; i< vector.length; i++){
            //in this for loop there is an if statment to check if there is a value in array
            if(value == vector[i]){
                cond = true; // we change the value of bollen to true for start if statment in out of loop
                //re-write the value
                value = i;

            }
        }
        if(!cond){
            //re-write value to -1 if we can't find value in array
            value = -1;

        }

        return value;
    }
}