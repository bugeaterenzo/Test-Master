package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class contains
{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));


    }

}
