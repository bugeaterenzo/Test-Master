package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class trimToSize
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();

        System.out.println("ArrayList size : " + cars.size());
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println("ArrayList size : " + cars.size());

//      The trimToSize() method reduces the capacity of a list to fit exactly the number
//      of items that the list contains.

//      When an ArrayList is created, capacity for 10 items is reserved unless another number
//      is specified in the constructor. Even if the list does not have 10 items, this space is
//      still reserved. Removing items from a list may leave the space for those items reserved.
//      When you are not using of the capacity of an ArrayList then there is some wasted memory
//      which can accumulate if your program makes use of many ArrayLists. You can use the trimToSize()
//      method to recover the unused memory.

        cars.trimToSize();

        System.out.println(cars);
        System.out.println("ArrayList size : " + cars.size());
    }

}
