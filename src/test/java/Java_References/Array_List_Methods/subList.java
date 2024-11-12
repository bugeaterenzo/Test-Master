package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class subList
{
    public static void main(String[] args)
    {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("\n___\n");
        System.out.println( cars.subList(1, 3) );
//      The subList() method returns a new list (referred to as a sublist)
//      which contains the items of the list between two indices.

    }
}
