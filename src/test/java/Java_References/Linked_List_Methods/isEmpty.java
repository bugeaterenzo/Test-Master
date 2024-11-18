package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class isEmpty
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();

        System.out.println(cars.isEmpty());

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.isEmpty());


    }


}
