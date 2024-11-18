package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class sort
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);


        cars.sort(null);
        System.out.println(cars);

        //      If null is passed into the method then items will be sorted naturally based
//      on their data type (e.g. alphabetically for strings, numerically for numbers).
//      Non-primitive types must implement Java's Comparable interface in order to be
//      sorted without a comparator.




        //        Lexicographical Order :

//        is just a fancy term for dictionary order,
//        where strings are compared based on the alphabetical order and
//        character values (like Unicode or ASCII values).


//        Returns a negative number if a comes before b.
//        Returns zero if a and b are equal.
//        Returns a positive number if a comes after b.

          cars.sort( (a, b) -> { return -1 * a.compareTo(b); } );
          System.out.println(cars);


//        If a.compareTo(b) returns a positive value (indicating that a should come after b),
//        multiplying it by -1 makes it negative, thus reversing the order.
//        If a.compareTo(b) returns a negative value, the -1 makes it positive,
//        meaning b should come before a.


        cars.sort( (a, b) -> { return +1 * a.compareTo(b); } );
        System.out.println(cars);


    }


}
