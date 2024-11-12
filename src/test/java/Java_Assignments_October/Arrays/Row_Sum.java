package Java_Assignments_October.Arrays;

public class Row_Sum {


    public static void main(String[] args) {



        int[][] squareMatrix =
                {
//                       0  1  2
                        {1, 2, 3}, // 0
                        {4, 5, 6}, // 1
                        {7, 8, 9}  // 2
                };

        int rows = squareMatrix.length;  // 3
        int cols = squareMatrix[0].length -1 ;  // 3 - 1 = 2





        int sum_of_each_row = 0;
        int row_id = 1;

        for (int i = 0; i < squareMatrix.length; i++ )
        {
            for ( int x = 0; x < squareMatrix[i].length; x++ )
            {

                sum_of_each_row += squareMatrix[i][x];

//                       2     -  0
//                       2     -  1
//                       2     -  2
                if( ( cols ) -  x == 0)
                {
                    System.out.println( "Sum of row " + row_id + " is : " + sum_of_each_row);
                    sum_of_each_row = 0;
//                    row++;
                    row_id++;
                }


            }
        }





    }


}
