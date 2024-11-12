package Java_Assignments_October.Arrays;

public class Two_Dimensional_Arrays {


    public static void main(String[] args) {



        int[][] squareMatrix =
                {
                        {9, 2, 3},
                        {4, 5, 6},
                };

        System.out.print("Matrix = ");
        System.out.println("[");
        for (int i = 0; i < squareMatrix.length; i++ )
        {
            System.out.print("[");
            for ( int x = 0; x < squareMatrix[i].length; x++ )
            {
                if (x == squareMatrix[i].length-1) System.out.print(squareMatrix[i][x]);
                else System.out.print(squareMatrix[i][x] + ",");
            }
            if (i == squareMatrix.length-1) System.out.println("]");
            else System.out.println("]" + ",");

        }
        System.out.println("]");





    }


}
