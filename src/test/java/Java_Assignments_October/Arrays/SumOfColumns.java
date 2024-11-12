package Java_Assignments_October.Arrays;

public class SumOfColumns {
    public static void main(String[] args) {
        // Initialize the 2D array
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate the number of rows and columns
        int rows = array2D.length;
        int cols = array2D[0].length;

        // Loop through each column
        for (int col = 0; col < cols; col++) {
            int columnSum = 0;

            // Sum all elements in the current column
            for (int row = 0; row < rows; row++) {
                columnSum += array2D[row][col];
            }

            // Display the sum of the current column
            System.out.println("Sum of column " + (col + 1) + ": " + columnSum);
        }
    }
}
