package Java_References.Array_List_Methods;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator
{
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        ListIterator<String> it = cars.listIterator();

        // Loop through the list
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---");

        // Loop backwards through the list
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
