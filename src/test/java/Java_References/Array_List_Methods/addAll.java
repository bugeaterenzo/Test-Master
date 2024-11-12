package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class addAll
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Microsoft");
        brands.add("W3Schools");
        brands.add("Apple");

        boolean check = brands.addAll(cars);  // returns boolean

        System.out.println(brands);
        System.out.println(check);
    }
}
