package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class set
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars);


    }


}
