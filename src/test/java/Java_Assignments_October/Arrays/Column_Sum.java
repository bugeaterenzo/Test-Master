package Java_Assignments_October.Arrays;

public class Column_Sum {

    public static void main(String[] args) {



        int[][] squareMatrix =
                {
//                       0  1  2
                        {1, 2, 3}, // 0
                        {4, 5, 6}, // 1
                        {7, 8, 9}  // 2
                };

        int rows = squareMatrix.length - 1;  // 3 - 1 = 2
        int cols = squareMatrix[0].length -1 ;  // 3 - 1 = 2




        int sum_of_each_col = 0;
        int row_id = 1;
        int col_id = -1;

        int target_row = 0;
        int target_col = 0;

        int reset_count = 1;



        for (int i = 0; i < squareMatrix.length; i++ ) {
            for (int x = 0; x < squareMatrix[i].length; x++) {



//                       2     -  0
//                       2     -  1
//                       2     -  2
                if ((cols) - x == 0) {
                    //System.out.println(squareMatrix[i][x]);
                    //System.out.print("sum of " + squareMatrix[target_row][target_col] + " + " + sum_of_each_col + " is  ---> ");
                    sum_of_each_col += squareMatrix[target_row][target_col];
                    //System.out.println(sum_of_each_col);


                    target_row++;
                    col_id++;
                    //System.out.println("Column id is updated to -----> " + col_id);

                    if ((rows) - col_id == 0)
                    {
                        //System.out.println(rows + " - " + col_id + " -----> " + ( (rows) - col_id ));
                        target_col++;
                        //System.out.println(  "target_col "  + " is updated to -----> " + target_col );
                    }

                }

                if ( i == rows && x == cols ) {
                    System.out.println("Sum of column " + row_id + " is : " + sum_of_each_col);
                    sum_of_each_col = 0;
                    row_id++;
//                    System.out.println("sum_of_each_col is reset to 0.");
                    if ( reset_count < 3 )
                    {
                        i=0;
                        x=0;
                        col_id = -1;
                        target_row = 0;
//                        System.out.println("i is reset to 0.");
//                        System.out.println("x is reset to 0.");
//                        System.out.println("target_row is reset to 0.");
                        reset_count++;
//                        System.out.println("reset_count is updated to -----> " + reset_count);
                    }

                }


            }
        }

    }

}
