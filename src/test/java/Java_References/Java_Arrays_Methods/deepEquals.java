package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class deepEquals
{
    public static void main(String[] args) {
        // Define two 2D arrays
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] array3 = {
                {1, 2, 3},
                {7, 8, 9}
        };

        // Compare array1 and array2 using deepEquals()
        boolean areArrays1And2Equal = Arrays.deepEquals(array1, array2);
        System.out.println("Array1 and Array2 are deeply equal: " + areArrays1And2Equal);

        // Compare array1 and array3 using deepEquals()
        boolean areArrays1And3Equal = Arrays.deepEquals(array1, array3);
        System.out.println("Array1 and Array3 are deeply equal: " + areArrays1And3Equal);





        // Define a 2D array
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Define another 2D array with the same structure and values
        int[][] array2DSame = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Define a 3D array
        int[][][] array3D = {
                {
                        {1, 2, 3}

                },
                {
                        {4, 5, 6}
                }
        };

        // Compare the original 2D array with another 2D array using deepEquals()
        boolean are2DArraysEqual = Arrays.deepEquals(array2D, array2DSame);
        System.out.println("Array2D and Array2DSame are deeply equal: " + are2DArraysEqual);

        // Attempt to compare the 2D array with a 3D array using deepEquals()
        boolean are2DAnd3DArraysEqual = Arrays.deepEquals(array2D, array3D);
        System.out.println("Array2D and Array3D are deeply equal: " + are2DAnd3DArraysEqual);




    }
}
