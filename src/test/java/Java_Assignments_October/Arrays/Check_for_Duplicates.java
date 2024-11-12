package Java_Assignments_October.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Check_for_Duplicates {


    public static void main(String[] args) {



        int[] numbers = { 3, 7, 3, 1, 9, 8 };
        Map<Integer , Integer> duplicates = new HashMap<>();




        int duplicate_count = 0 ;


        for ( int i = 0; i < numbers.length; i++)
        {

            if ( duplicates.containsKey(numbers[i]) )
            {
                duplicates.put( numbers[i] , duplicates.get(numbers[i])+1 );
                duplicate_count++;
                System.out.println( duplicate_count + " duplicate is found.");
                System.out.println( numbers[i] + " is a duplicate value in the array numbers.");
            }
            else
            {
                duplicates.put( numbers[i] , 1);
            }

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println( duplicates );














    }



}
