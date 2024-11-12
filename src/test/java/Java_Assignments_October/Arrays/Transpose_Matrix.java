package Java_Assignments_October.Arrays;

public class Transpose_Matrix {


    public static void main(String[] args) {




        int[][] squareMatrix =
                {
                        {1 , 2},
                        {3 , 4},
                        {5 , 6}
                };

        System.out.print("Matrix = ");
        System.out.println("[");
        for (int i = 0; i < squareMatrix[i].length; i++ )
        {

            System.out.print("[");
            for ( int x = 0; x < squareMatrix.length; x++ )
            {
                if (x == squareMatrix.length-1) System.out.print(squareMatrix[x][i]);
                else System.out.print(squareMatrix[x][i] + ",");
            }


            if (i == squareMatrix[i].length-1) System.out.println("]");
            else System.out.println("]" + ",");

        }
        System.out.println("]");










    }


}
