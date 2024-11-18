package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class replaceAll
{
    public static void main(String[] args)
    {

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);

        System.out.println(numbers);
        numbers.replaceAll( n -> n + 1 );
        System.out.println(numbers);

    }


}
