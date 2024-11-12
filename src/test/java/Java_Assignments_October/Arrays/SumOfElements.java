package Java_Assignments_October.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {4, 7, 1, 9, 12};

        // Variable to store the sum of elements
        int sum = 0;

        // Loop through the array and sum up the elements
        for (int number : numbers) {
            sum += number;
        }

        // Display the sum
        System.out.println("Sum of all elements: " + sum);
    }
}
