package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class mismatch
{
    public static void main(String[] args)
    {


        // Define two arrays
        int[] array1 = {0, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 0, 5};

        // Use Arrays.mismatch() to find the index of the first mismatch
        int mismatchIndex = Arrays.mismatch(array1, array2);

//        If there are multiple mismatches in the arrays, the Arrays.mismatch()
//        method will still only return the index of the first mismatch it encounters.
//        It stops searching as soon as it finds the first differing element between the two arrays.

        // Print the result
        while(true)
        {
            if (mismatchIndex == -1)
            {
                System.out.println("The arrays are identical.");
            }
            else
            {
//              Since Arrays.mismatch() only finds the first mismatch, it will return index 1 and ignore any further mismatches.
                System.out.println("The first mismatch occurs at index: " + mismatchIndex);
                System.out.println("array1[" + mismatchIndex + "] = " + array1[mismatchIndex]);
                System.out.println("array2[" + mismatchIndex + "] = " + array2[mismatchIndex]);
            }





        }



    }




}
