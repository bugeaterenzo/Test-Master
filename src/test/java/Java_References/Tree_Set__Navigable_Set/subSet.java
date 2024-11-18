package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class subSet
{
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("SubSet from 20 to 40: " + set.subSet(20, 40)); // Output: [20, 30]

        // Explanation: The subSet(20, 40) method returns a view of the set containing elements
        // from 20 (inclusive) to 40 (exclusive). It does not include 40.



    }



}
