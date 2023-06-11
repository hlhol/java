public class shiftingItem {
    static int[] items = new int[]{1, 2, 3, 4, 5};


    public static void main(String[] args) {
        int product = 3;
        shifting(items, product);
    }
    public static int[] shifting(int [] items, int product){
        boolean exit = true;
        for(int i=0; i<items.length; i++){
            if (product != items[i]){
                exit = false;
            }
            if(exit &&  i < items.length-1){
                items[i] = items[i+1];
            }
        }

        if(exit){
            items[items.length-1] = Integer.parseInt("");
        }
        for (int i =0; i< items.length; i++){
            System.out.println(items[i]);
        }

        return items;
    }

    }
