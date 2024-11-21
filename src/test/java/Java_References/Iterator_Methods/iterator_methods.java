package Java_References.Iterator_Methods;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_methods
{
    public static void main(String[] args)
    {

        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Display the original list
        System.out.println("Original List: " + numbers);

        // Get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the list
        while (iterator.hasNext())
        {
            Integer number = iterator.next();
            if (number % 2 == 0)
            {
                // Remove even numbers
                System.out.println("Removing: " + number);
                iterator.remove();
            }
        }

        // Display the modified list
        System.out.println("Modified List: " + numbers);
    }
}
