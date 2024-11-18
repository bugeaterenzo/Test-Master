package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class forEach
{
    public static void main(String[] args)
    {

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );


    }


}
