package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class floor
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Floor of 25: " + set.floor(25)); // Output: 20
        System.out.println("Floor of 5: " + set.floor(5));   // Output: null

        // Explanation: The floor of 25 is 20 because 20 is the greatest element
        // less than or equal to 25. For 5, there is no element less than or equal
        // to it, so it returns null.


    }
}
