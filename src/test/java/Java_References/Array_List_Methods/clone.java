package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class clone
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList cars2 = (ArrayList)cars.clone();
        cars2.set(0, "Toyota");

        System.out.println(cars);
        System.out.println(cars2);
    }
}
