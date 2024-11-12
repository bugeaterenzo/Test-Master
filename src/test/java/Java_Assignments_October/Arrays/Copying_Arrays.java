package Java_Assignments_October.Arrays;

import java.util.Arrays;

public class Copying_Arrays {



    public static void main(String[] args) {



        int[] numbers = { 5, 10, 15, 20, 25 };
        int[] copy = new int[numbers.length];




           for (int i = 0; i < numbers.length; i++)
           {
               copy[i] = numbers[i];
           }


        System.out.println( " Original Array ----> " + Arrays.toString(numbers));
        System.out.println( " Copy Array ----> " + Arrays.toString(copy) );


        System.out.println(" ******************************************************* ");


//        Second Approach

        int[] Copy = Arrays.copyOf( numbers , numbers.length);

        System.out.println( " Original Array ----> " + Arrays.toString(numbers));
        System.out.println( " Copy Array ----> " + Arrays.toString(Copy) );







    }






}
