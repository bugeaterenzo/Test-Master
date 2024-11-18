package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class clear
{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();
        System.out.println(cars);


    }

}
