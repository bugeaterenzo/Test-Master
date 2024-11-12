package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class contains
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));
    }
}
