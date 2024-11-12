package Java_Assignments_October.Arrays;

public class Find_the_Largest_Element {


    public static void main(String[] args) {



        int[] numbers = {15, 23, 7, 42, 30, 5};

        int max = 0;

        for ( int number : numbers)
        {
            if ( number > max)
            {
                max = number;
            }

        }

        System.out.println( "Max number ----> " + max);














    }


}
