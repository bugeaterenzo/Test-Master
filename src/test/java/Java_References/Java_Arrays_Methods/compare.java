package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class compare
{
    public static void main(String[] args)
    {


        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};
        String[] cars3 = {"volvo", "bMW", "tesla"};

        System.out.println(Arrays.compare(cars, cars2));
        System.out.println(Arrays.compare(cars, cars3));
        // The comparison starts from the first element. Here, "Volvo" and "volvo" are compared first.
        // In lexicographic order (which is case-sensitive), uppercase letters are considered "less than"
        // lowercase letters because of their Unicode values. Therefore, "Volvo" is considered less than "volvo".
        // 'A' has a Unicode value of 65.
        // 'a' has a Unicode value of 97.
        // 'V' (uppercase) has a Unicode value of 86.
        // 'v' (lowercase) has a Unicode value of 118.




//      Returns 0 if the arrays are equal.
//
//      Returns a negative integer if the array1 is less than array2 lexicographically
//
//      Returns a positive integer if array1 is greater than array2 lexicographically.



        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2};

        // Comparing arr1 and arr2
        System.out.println(Arrays.compare(arr1, arr2));
        // Output will be a negative integer

        // Comparing arr1 and arr3
        System.out.println(Arrays.compare(arr1, arr3));
        // Output will be 0 (arrays are equal)

        // Comparing arr1 and arr4
        System.out.println(Arrays.compare(arr1, arr4));

        // Output will be a positive integer
        // The first and second elements are equal (1 and 2), but arr4 is shorter.
        // Since arr1 has an extra element (3), the method returns a positive integer, indicating that arr1 is greater than arr4.


    }
}
