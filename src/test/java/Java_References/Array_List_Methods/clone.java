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

//        clone() vs copyOf()
//        This creates a "shallow" copy, which means that copies of objects in the list are not created,
//        instead the list has references to the same objects that are in the original list.
    }
}
