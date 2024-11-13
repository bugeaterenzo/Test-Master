package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class copyOf
{
    public static void main(String[] args)
    {

        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Create a copy with a new length (greater than the original length)
        int[] extendedArray = Arrays.copyOf(originalArray, 8);
        System.out.println("Extended array: " + Arrays.toString(extendedArray));

        // Create a copy with a new length (smaller than the original length)
        int[] truncatedArray = Arrays.copyOf(originalArray, 3);
        System.out.println("Truncated array: " + Arrays.toString(truncatedArray));


    }



}
