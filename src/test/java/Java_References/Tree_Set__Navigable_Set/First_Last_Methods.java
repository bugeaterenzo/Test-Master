package Java_References.Tree_Set__Navigable_Set;

import java.util.TreeSet;

public class First_Last_Methods
{
    public static void main(String[] args)
    {

        // Creating a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Mango");
        treeSet.add("Peach");

        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);  // Output will be sorted

        // Using first() method: Retrieves the first (lowest) element in the set
        String firstElement = treeSet.first();
        System.out.println("First element: " + firstElement);  // Output: Apple

        // Using last() method: Retrieves the last (highest) element in the set
        String lastElement = treeSet.last();
        System.out.println("Last element: " + lastElement);  // Output: Peach




        TreeSet<Integer> sortedNumbersSet = new TreeSet<>();

        // Adding elements to the TreeSet
        sortedNumbersSet.add(25);
        sortedNumbersSet.add(15);
        sortedNumbersSet.add(30);
        sortedNumbersSet.add(5);
        sortedNumbersSet.add(20);

        // Display the TreeSet
        System.out.println("Sorted Numbers Set: " + sortedNumbersSet);  // Output will be sorted in ascending order

        // Using first() method: Retrieves the first (lowest) element in the set
        Integer first_Element = sortedNumbersSet.first();
        System.out.println("First element: " + first_Element);  // Output: 5

        // Using last() method: Retrieves the last (highest) element in the set
        Integer last_Element = sortedNumbersSet.last();
        System.out.println("Last element: " + last_Element);  // Output: 30


        System.out.println("Sorted Numbers Set: " + sortedNumbersSet);




    }



}
