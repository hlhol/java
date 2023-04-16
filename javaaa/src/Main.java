public class Main {
    public static void main(String[] args) {
        int row; int col; int n = 5;

        //Outer Loop for number of Rows
        for(row = 1; row<=n; ++row){
            for (col = 1; col<row; ++col){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = 1; row<=n; ++row){
            for (col = row; col<n; ++col){
                System.out.print("*");
        }}
    }}