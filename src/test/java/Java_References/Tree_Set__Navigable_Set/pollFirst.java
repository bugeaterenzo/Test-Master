package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class pollFirst
{
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Poll First: " + set.pollFirst()); // Output: 10
        System.out.println("Set after pollFirst: " + set);    // Output: [20, 30, 40]


        // poll means : get gain return
        // Explanation: The pollFirst() method removes and returns the lowest element
        // (10 in this case). After calling it, the set no longer contains 10.

    }


}
