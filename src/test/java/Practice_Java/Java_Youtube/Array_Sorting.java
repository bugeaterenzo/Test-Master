package Practice_Java.Java_Youtube;

import java.util.Arrays;

public class Array_Sorting {



    public static void main (String[] args) {


        char vowels[] = {'i','e','a','o','u'};

        Arrays.sort(vowels , 1 ,3); // sort specific indexes range

        System.out.println(Arrays.toString(vowels));



//        *********** *********** *********** *********** *********** *********** ***********


        Arrays.sort(vowels);

        System.out.println(Arrays.toString(vowels));


//        *********** *********** *********** *********** *********** *********** ***********


        int index = 0;
        System.out.println(" By passing the index of a we get : " + vowels[index]);


//        *********** *********** *********** *********** *********** *********** ***********



        Arrays.fill(vowels , 't');  // We can use the fromIndex and toIndex properties here as well.
        System.out.println(Arrays.toString(vowels));





//        *********** *********** *********** *********** *********** *********** ***********


        char key = 'a';

        index = Arrays.binarySearch(vowels , key); // We can use the fromIndex and toIndex properties here as well.

//      System.out.println( " By passing the key array element of " + key + " through this code Arrays.binarySearch(vowels , key) " +
//                          " we get the index of " + index +
//                          " and through index the value of " + vowels[index] +
//                          " itself...! " );








    }



}
