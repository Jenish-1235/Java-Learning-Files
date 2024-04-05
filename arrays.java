import java.lang.reflect.Array;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // 1d array 
        String[] array  = {"a", "b" , "c"};
        // type [] name = {array}
        /* there are two ways to declare arrays :- 1st is decclare directly with values and second (below given ) i.e. decalre size first and then declare values by indexing. */
        int [] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        // array.length gives the size of an array.

        // 2d array 
        /* 2d array is collection of row and columns
         * 
         * (row,column)
         * 
         * it is zero index based as java is zero index based language. Hence 1st block is 0,0.  
         * 
         * size of array is row*column * size of datatype
         * 
         * declaration:-
         * type[][] name = new type[rows][columns]
         * 
         * indexing also in same way [row][column]
         * 
         * 
         */

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int [][] numbers = new int[row][column];

        for(int i = 0; i < row; i++){
            for (int j = 0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i <row; i++){
            for (int j = 0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
