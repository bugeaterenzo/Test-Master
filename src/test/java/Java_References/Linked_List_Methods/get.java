package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class get
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(0));


        // Use getFirst() to get the first item in the list
        System.out.println(cars.getFirst());


        // Use getLast() to get the last item in the list
        System.out.println(cars.getLast());



    }


}
