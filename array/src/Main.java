public class Main {
    public static void main(String[] args) {
    //thisis how to create a array in java:
        //declare value of array
        int [] marks = {15, 1, 5, 7, 9};
        int i = 0;
        boolean flag = false;

        while(i< marks.length && flag ==false){
            System.out.println(marks[i]);
            i++;
        }


    }
}