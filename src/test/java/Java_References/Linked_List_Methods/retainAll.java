package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class retainAll
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        LinkedList<String> valid = new LinkedList<String>();
        valid.add("Volvo");
        valid.add("Ford");
        valid.add("Mazda");

        System.out.println(cars);

        cars.retainAll(valid);

        System.out.println(cars);


    }


}
