package Java_Assignments_October.Arrays;

import java.util.Arrays;

public class Array_Reversal {

    public static void main(String[] args) {



        int[] numbers = {15, 23, 7, 42, 30, 5};
        int[] reverse_numbers = new int[numbers.length];

        int x = 0;

       for (int i = numbers.length-1; i >= 0; i--)
       {
           reverse_numbers[x] = numbers[i];
           x++;
       }

        System.out.println(" Original Array ----> " + Arrays.toString(numbers) );
        System.out.println(" reverse_numbers array ----> " + Arrays.toString(reverse_numbers) );














    }

}
