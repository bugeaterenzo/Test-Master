package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class toArray
{
    public static void main(String[] args)
    {

        LinkedList cars = new LinkedList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Object[] carsArray = cars.toArray();

        for(Object item : carsArray)
        {
            System.out.println(item);
        }


    }


}
