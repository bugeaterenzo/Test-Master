package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class fill
{
    public static void main(String[] args)
    {

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};

        System.out.println(Arrays.toString(fruits));

//      Fill all the elements in an array with a "Kiwi" value:
        Arrays.fill(fruits, "Kiwi");

        System.out.println(Arrays.toString(fruits));


//      The fill() method fills an array with a specified value.
//
//      Note: The value must be of the same data type as the array.
//
//      Tip: Start and end position can be specified. If not, all elements will be filled.

//      Arrays.fill(array, start, end, value)




    }






}
