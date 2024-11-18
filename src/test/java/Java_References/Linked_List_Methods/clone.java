package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class clone
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        LinkedList cars2 = (LinkedList)cars.clone();
        cars2.set(0, "Toyota");

        System.out.println(cars);
        System.out.println(cars2);

    }
}
