package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class lower
{
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Lower than 25: " + set.lower(25)); // Output: 20
        System.out.println("Lower than 10: " + set.lower(10)); // Output: null


        // Explanation: The lower of 25 is 20, because it's the greatest element strictly
        // less than 25. For 10, there is no element strictly less than it, so it returns null.

    }


}
