package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class removeAll
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        boolean check = cars.removeAll(cars); // returns boolean
        System.out.println(cars);
        System.out.println(check);
    }
}
