package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class remove
{
    public static void main(String[] args)
    {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

        // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println(cars);

        // Use removeLast() to remove the last item from the list
        cars.removeLast();
        System.out.println(cars);


        cars.removeAll(cars);
        System.out.println(cars);


        // Use removeIf()

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);
        numbers.removeIf( n -> n % 2 == 0 );
        System.out.println(numbers);


    }


}
