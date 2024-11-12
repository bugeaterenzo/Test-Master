package Java_Assignments_October.Arrays;

import java.util.Arrays;

public class Count_Occurrences {



    public static void main(String[] args) {



        int[] numbers = { 2, 4, 2, 8, 3, 2, 9 };


        int x = 2;
        int x_counter = 0;

        for (int number : numbers)
        {
            if ( number == x)
            {
                x_counter++;
            }

        }

        System.out.println(" Total Number of " +  x  + " ----> " + x_counter);















    }




}




