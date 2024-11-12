package Java_Assignments_October.Arrays;

public class Diagonal_Sum {


    public static void main(String[] args) {



        int[][] squareMatrix =
        {
            {9, 2, 3},
            {4, 5, 6},
            {7, 8, 1}
        };

        for (int i = 0; i < squareMatrix.length; i++ )
        {
            for ( int x = 0; x < squareMatrix[i].length; x++ )
            {
                if ( i == x )
                {
                    System.out.print(squareMatrix[i][x] + " ");
                }
            }
        }





    }


}
