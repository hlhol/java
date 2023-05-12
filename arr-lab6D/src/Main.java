public class Main {
    public static void main(String[] args) {
        System.out.println(findFirst(new int[]{10,20,30,50,40,30}, 50));

        String word = "Philippe";

    }

    public static char [] decompose(String word) {
        char[] res = new char [word.length()];




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