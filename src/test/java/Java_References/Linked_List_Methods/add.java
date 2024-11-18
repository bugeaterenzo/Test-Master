package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class add
{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        LinkedList<String> brands = new LinkedList<String>();
        brands.add("Microsoft");
        brands.add("W3Schools");
        brands.add("Apple");

        brands.addAll(cars);

        System.out.println(brands);

        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");  // void
        System.out.println(cars);

        // Use addLast() to add the item to the end
        cars.addLast("Mazda");  // void
        System.out.println(cars);
    }
}
