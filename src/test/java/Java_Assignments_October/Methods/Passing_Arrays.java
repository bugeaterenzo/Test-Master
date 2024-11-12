package Java_Assignments_October.Methods;

import java.time.chrono.MinguoDate;
import java.util.Arrays;
import java.util.Collections;

public class Passing_Arrays
{


    public int[] reverseArray(int[] numbers)
    {
        //Arrays.sort(numbers , Collections.reverseOrder());
        int[] copy = new int[numbers.length];
        int i = 0;
        for (int index = numbers.length-1; index >= 0; index--)
        {
           copy[i] = numbers[index];
           i++;
        }
        return copy;
    }
}
