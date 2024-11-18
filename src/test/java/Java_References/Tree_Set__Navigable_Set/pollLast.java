package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class pollLast
{
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Poll Last: " + set.pollLast()); // Output: 40
        System.out.println("Set after pollLast: " + set);   // Output: [10, 20, 30]

        // poll means : get gain return
        // Explanation: The pollLast() method removes and returns the highest element
        // (40 in this case). After calling it, the set no longer contains 40.

    }


}
