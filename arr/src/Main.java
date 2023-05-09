import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Philippe","Osama","David","Abdulmonem"};

        System.out.println("longest string from "+ Arrays.toString(words)+" is: "+longestString(words));
        System.out.println(findFirst(new int[]{10,20,30,50,40,30}, 40));

        String word = "Philippe";
        System.out.println("The word \""+word+"\" decomposes as "+Arrays.toString(decomposeString(word)));
    }

    public static String longestString(String[] words){
        String name = "";
        int longest = 0;
        int i = 0;

        while(i< words.length){
            if (longest < words[i].length()){
                longest = words[i].length();
                name = words[i];
            }



            i++;
        }
        return name;
    }

    public static int findFirst(int[] vector, int value) {
        //create counter
        int i = 0;
        //create flag to break the loop
        boolean flag = false;

        //start the while loop
        while( i<vector.length && flag == false){
            //create if statment to get the index of value
            if(value == vector[i]){
                value = i;
                flag = true;
            } else if (value != vector[i]) {
                value = -1;
            }

            i++;
        }


        //RETURN value
        return value;
    }

    public static String decomposeString(String word){






        return word;
    }


}