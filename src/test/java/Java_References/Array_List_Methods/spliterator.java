package Java_References.Array_List_Methods;

import java.util.ArrayList;
import java.util.Spliterator;

public class spliterator
{
    public static void main(String[] args)
    {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        // Get the spliterator and split it
        Spliterator<String> it1 = cars.spliterator();
        Spliterator<String> it2 = it1.trySplit();



//      Splitting: The trySplit() method splits the collection (cars) into two parts.
//      The first Spliterator (it1) processes the first part of the list (["Volvo", "BMW"]),
//      and the second Spliterator (it2) processes the second part (["Ford", "Mazda"]).



        // Loop through the first spliterator
        System.out.println("First spliterator");
        while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );


//        boolean x = it1.tryAdvance( (n) -> { System.out.println(n); });

//        while(x)
//        {
//            x = it1.tryAdvance( (n) -> { System.out.println(n); });
//        }


//        This means that the spliterator it1 tries to advance by one element,
//        passing that element to the provided lambda function (n) -> { System.out.println(n); }
//        for processing. If there is an element to process, the method returns true,
//        and if there are no more elements, it returns false.



//        while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );

//        This line means "continue looping while tryAdvance() returns true."
//        The tryAdvance() method is called in the condition part of the while loop,
//        so it gets executed once before the loop starts.
//        If the method returns true, the body of the while loop runs
//        (but in this case, there’s no explicit body because the action is already inside tryAdvance()).
//        It keeps looping until tryAdvance() returns false (i.e., there are no more elements to process).


        // Loop through the second spliterator
        System.out.println("\nSecond spliterator");
        while( it2.tryAdvance( (n) -> { System.out.println(n); } ) );


//      The tryAdvance() method of a Spliterator is used to process one element at a time.
//      It advances the spliterator by one element and applies the provided action
//      (in this case, printing the element).



    }
}
