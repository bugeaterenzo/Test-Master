package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class retainAll
{
    public static void main(String[] args)
    {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        System.out.println(cars);


        ArrayList<String> valid = new ArrayList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");

//      The retainAll() method removes all items from a list which do not belong to a specified collection.
        cars.retainAll(valid); // returns boolean

        System.out.println(cars);
    }
}
