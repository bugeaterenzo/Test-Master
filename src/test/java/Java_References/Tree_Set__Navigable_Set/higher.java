package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class higher
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Higher than 25: " + set.higher(25)); // Output: 30
        System.out.println("Higher than 40: " + set.higher(40)); // Output: null


        // Explanation: The higher of 25 is 30, because it's the least element strictly
        // greater than 25. For 40, there is no element strictly greater, so it returns null.
    }
}
