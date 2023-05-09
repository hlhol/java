import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Philippe","Osama","David","Abdulmonem"};
        System.out.println("longest string from "+ Arrays.toString(words)+" is: "+longestString(words));
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
}