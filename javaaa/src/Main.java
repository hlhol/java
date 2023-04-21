public class Main {
    public static void main(String[] args) {
        int row; int col; int n = 5;
        char letter = 'a';
        //Outer Loop for number of Rows
/*        for(row = 1; row<=n; ++row){
            for (col = 1; col<row; ++col) {
                System.out.print(letter+" ");
            }
            ++letter;
            System.out.print("\n");
        }
        for(row = n; row>=1; --row){
            for (col = 1; col<row; ++col) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
*/
        for (row=0; row <n; row++)
        {
//inner loop work for space
            for (col=2*(row-n); col>=0; col--)
            {
//prints space between two stars
                //System.out.print(" ");
            }
//inner loop for columns
            for (col=0; col<=row; col++ )
            {
//prints star
                System.out.print("*");
            }

            System.out.println();

        }}}