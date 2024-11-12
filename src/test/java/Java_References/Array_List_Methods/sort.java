package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class sort
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.sort(null);
//      If null is passed into the method then items will be sorted naturally based
//      on their data type (e.g. alphabetically for strings, numerically for numbers).
//      Non-primitive types must implement Java's Comparable interface in order to be
//      sorted without a comparator.

        System.out.println(cars);


        ArrayList<String> vehicles = new ArrayList<String>();
        vehicles.add("Volvo");
        vehicles.add("BMW");
        vehicles.add("Ford");
        vehicles.add("Mazda");
        vehicles.sort( (a, b) -> { return -1 * a.compareTo(b); } );
        System.out.println(vehicles);


//        Lexicographical Order :

//        is just a fancy term for dictionary order,
//        where strings are compared based on the alphabetical order and
//        character values (like Unicode or ASCII values).

        ArrayList<String> transports = new ArrayList<String>();
        transports.add("Volvo");
        transports.add("BMW");
        transports.add("Ford");
        transports.add("Mazda");
        transports.sort( (a, b) -> { return +1 * a.compareTo(b); } );
        System.out.println(transports);

    }
}
