package Java_References.Linked_List_Methods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class Iterators
{
    public static void main(String[] args)
    {

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");



        // Getting an iterator to traverse the list in reverse order
        Iterator<String> descIterator = list.descendingIterator();
        System.out.println("Elements in reverse order:");

        System.out.println(list);

        System.out.println("---");

        while ( descIterator.hasNext() )
        {
            System.out.print(descIterator.next() + " ");
        }

        System.out.println("\n---");


        // Make a collection
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Loop through a collection
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("---");


        // Get the iterator
        ListIterator<String> it2 = cars.listIterator();

        // Loop through the list
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("---");

        // Loop backwards through the list
        while(it2.hasPrevious())
        {
            System.out.println(it2.previous());
        }



        LinkedList<String> car = new LinkedList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        // Get the spliterator and split it
        Spliterator<String> it1 = car.spliterator();
        Spliterator<String> it3 = it1.trySplit();

//        Unlike collections like ArrayList that provide efficient random access,
//        LinkedList uses a doubly-linked list structure. This makes splitting less
//        predictable and efficient because splitting in half can be challenging without
//        linear traversal due to how nodes are connected sequentially.

        // Loop through the first spliterator
        System.out.println("First spliterator");
        while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );

        // Loop through the second spliterator
        System.out.println("\nSecond spliterator");
        while( it3.tryAdvance( (n) -> { System.out.println(n); } ) );


        car.add("Ford2");
        car.add("Mazda2");
        car.add("Mazda24");

        Spliterator<String> it4 = car.spliterator();
        Spliterator<String> it5 = it1.trySplit();

        // Loop through the first spliterator
        System.out.println("First spliterator");
        while( it4.tryAdvance( ( n ) -> { System.out.println(n); } ) );

        // Loop through the second spliterator
        System.out.println("\nSecond spliterator");
        while( it5.tryAdvance( ( n ) -> { System.out.println(n); } ) );


//      If your LinkedList only contains a few elements
//      (e.g., four elements: "Volvo", "BMW", "Ford", "Mazda"),
//      there might not be enough elements for a meaningful split.
//      In such cases, trySplit() may return null or a Spliterator with no elements left to traverse.
//      Since it1 (the original Spliterator) was not split into a meaningful subset that leaves a valid
//      second half, it3 ends up being empty.




    }

    }



