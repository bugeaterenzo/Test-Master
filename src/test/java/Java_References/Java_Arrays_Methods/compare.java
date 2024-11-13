package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class compare
{
    public static void main(String[] args)
    {


        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        System.out.println(Arrays.compare(cars, cars2));


//      Returns 0 if the arrays are equal.
//
//      Returns a negative integer if the array1 is less than array2 lexicographically
//
//      Returns a positive integer if array1 is greater than array2 lexicographically.


    }
}
