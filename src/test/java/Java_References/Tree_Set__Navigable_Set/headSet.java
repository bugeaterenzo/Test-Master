package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class headSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("HeadSet less than 30: " + set.headSet(30)); // Output: [10, 20]
        System.out.println(set);

        // Explanation: The headSet(30) method returns a view of the set containing elements strictly
        // less than 30. It excludes 30.



    }


}
