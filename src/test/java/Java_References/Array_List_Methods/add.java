package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class add
{

    public static void main(String[] args)
    {

        ArrayList<String> cars = new ArrayList<String>();
        boolean check = cars.add("Volvo"); // returns boolean
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(check);



    }
}
