package Java_References.Array_List_Methods;

import java.util.ArrayList;

public class replaceAll
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
        numbers.replaceAll( n -> n + 1 ); // returns nothing or void
        System.out.println(numbers);

//      numbers.replaceAll(add());

//      When calling add() with replaceAll(), add() would need to be passed as a method reference
//      (like ClassName::methodName for instance methods)
//      numbers.replaceAll(replaceAll::add);
//      or as a lambda function
//      numbers.replaceAll(n -> add(n));.

        numbers.replaceAll(replaceAll::add); // Correct way to pass the method reference

        System.out.println(numbers);
    }

    public static int add(int n)
    {
        return n+2;
    }
}
