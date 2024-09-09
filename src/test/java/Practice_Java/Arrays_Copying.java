package Practice_Java;

import java.util.Arrays;

public class Arrays_Copying {

    public static void main (String[] args) {




        int[] numbers = {1,2,3,4,5};

        int[] numbers_copy = numbers;

        Arrays.fill(numbers , 0);

       // System.out.print(Arrays.toString(numbers) + " ");
        // since arrays are reference type datatypes an actual copy will not be created
        // instead the numbers_copy will point towards the same location in memory as numbers do....!
       // System.out.println(Arrays.toString(numbers_copy));



//        *********** *********** *********** *********** *********** *********** ***********


        // to solve this issue we use Arrays.copyOf(Array_name , Array_name.length) method...!


        int[] numbers_2 = {1,2,3,4,5};

        // we can increase or decrease the length of the numbers_copy
        // new empty slots will be initialized by default with 0
        // if we decrease the length of numbers_copy the inherited values from
        // the numbers array will be deleted
        numbers_copy = Arrays.copyOf(numbers_2 , numbers_2.length);

//        System.out.print(Arrays.toString(numbers) + " ");
//        System.out.println(Arrays.toString(numbers_copy));



//        *********** *********** *********** *********** *********** *********** ***********



        // to copy a specific range of values from the original array
        // we can use Arrays.copyOfRange(Array_name , startIndex , endIndex);

        int[] numbers_3 = {1,2,3,4,5};

        numbers_copy = Arrays.copyOfRange(numbers_3 , 0 , 5); // the ending index value is exclusive...!

//        System.out.print(Arrays.toString(numbers) + " ");
//        System.out.println(Arrays.toString(numbers_copy));





//        *********** *********** *********** *********** *********** *********** ***********




        int[] numbers_4 = {1,2,3,4,5};

        numbers_copy = Arrays.copyOf(numbers_4 , numbers_4.length);

        System.out.print(Arrays.toString(numbers_4) + " ");
        System.out.println(Arrays.toString(numbers_copy));

        System.out.println( "a  .  equals ( b ) : "
                            + numbers_4.equals(numbers_copy)
                            + " compares the reference " );       // compares the reference

        System.out.println( "Arrays.equals(a,b) : "
                            + Arrays.equals(numbers_4 , numbers_copy)
                            + "  compares the actual values " );      // compares the actual values





    }
}
