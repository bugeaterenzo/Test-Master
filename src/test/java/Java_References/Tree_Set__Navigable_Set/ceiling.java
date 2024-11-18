package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class ceiling
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Ceiling of 25: " + set.ceiling(25)); // Output: 30
        System.out.println("Ceiling of 50: " + set.ceiling(50)); // Output: null


        // Explanation: The ceiling of 25 is 30 because 30 is the least element greater
        // than or equal to 25. For 50, no element is greater than or equal to it, so it
        // returns null.



    }




}
