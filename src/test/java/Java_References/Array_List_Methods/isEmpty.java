package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class isEmpty
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();

        System.out.println(cars.isEmpty());

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.isEmpty());
    }
}
