package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class tailSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println( " TailSet from 30: " + set.tailSet(30)); // Output: [30, 40]
        System.out.println(set);

        // Explanation: The tailSet(30) method returns a view of the set containing elements greater
        // than or equal to 30. It includes 30.

    }



}
