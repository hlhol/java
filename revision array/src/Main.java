public class Main {
    public static void main(String[] args) {

        int[] num = new int[]{1, 2, 3, 4, 5};
        System.out.println(num[num.length-1]);

        boolean exit = false;
        String target  = "khalil";
        int index = 0;
        String [] name = new String[]{"jaffar", "ali", "hussain", "mohhammed", "sadiq"};
        for(int i = 0;  i< name.length; i++){
            if(name[i].equalsIgnoreCase(target)){
                index = i;
                exit = true;
                break;
            }
        }

        if(exit == false){
            System.out.println( target + " was not found");
        }else{
            for(int j = index; j<name.length-1; j++){
                name[j] = name[j+1];
            }
            name[name.length-1] = null;

            for (int i =0; i< name.length; i++){
                System.out.println(name[i]);
            }
        }


        /*
        int[] arr = {1, 2, 3, 4, 5};
        int[] temp = new int[arr.length-1];
        int item = 3;
        int index = 0;

        for(int i = 0 ;  i< arr.length; i++){
            if(item == arr[i]){
                index = i;

            }
        }

        if(){}

*/
    }
}