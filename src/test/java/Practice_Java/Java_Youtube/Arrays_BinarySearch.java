package Practice_Java.Java_Youtube;

import java.util.Arrays;

public class Arrays_BinarySearch {

    public static void main(String[] args) {

        char[] vowels = {'a','e','o','i','u'};

        Arrays.sort(vowels); // Before using binary search the array should be sorted...!

        char key = 'o';

        int index_of_O = Arrays.binarySearch(vowels , key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(index_of_O);

    }

}
