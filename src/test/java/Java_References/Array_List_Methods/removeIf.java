package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class removeIf
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);

        System.out.println(numbers);
        numbers.removeIf( n -> n % 2 == 0 ); // returns boolean
        System.out.println(numbers);
    }
}
