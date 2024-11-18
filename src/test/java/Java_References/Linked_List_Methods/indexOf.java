package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class indexOf
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.indexOf("Ford"));


        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.add("Ford");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        cars2.add("Ford");
        System.out.println(cars2.indexOf("Ford"));
        System.out.println(cars2.lastIndexOf("Ford"));

    }


}
