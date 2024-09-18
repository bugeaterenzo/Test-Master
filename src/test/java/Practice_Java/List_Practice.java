package Practice_Java;

import java.util.*;

public class List_Practice {

    public static void main (String[] args)
    {

        // Creating different types of lists

        List<String> employee_1 = new ArrayList<>(); // Resizable array, fast random access
        List<String> employee_2 = new LinkedList<>(); // Doubly linked list, fast insertion/removal
        List<String> employee_3 = new Vector<>(); // Synchronized version of ArrayList

        // Add values to the lists

        employee_1.add("John");
        employee_1.add("Simon");
        employee_1.add("Joey");
        employee_1.add(null);  // null values are allowed
        employee_1.add("John");  // Duplicates are allowed

        employee_2.add("Abraham");
        employee_2.add("Alvin");
        employee_2.add("Chandler");
        employee_2.add(null);   // null values are allowed
        employee_2.add("Alvin");  // Duplicates are allowed

        employee_3.add("Gabriel");
        employee_3.add("Katya");
        employee_3.add("Peter");
        employee_3.add(null);   // null values are allowed
        employee_3.add("Gabriel");  // Duplicates are allowed

        // Remove values from the lists

        employee_1.remove("John");  // Removes the first occurrence of "John"
        employee_2.remove("Abraham");
        employee_3.remove("Gabriel");

        employee_1.remove(1);  // Remove the value at index 1
        employee_2.remove(1);  // Remove the value at index 1
        employee_3.remove(1);  // Remove the value at index 1

        // Access elements

        String value_1 = employee_1.get(1);  // Get value at index 1 in ArrayList
        String value_2 = employee_2.get(1);  // Get value at index 1 in LinkedList
        String value_3 = employee_3.get(1);  // Get value at index 1 in Vector

        // Print the entire lists

        System.out.println("ArrayList: " + employee_1);
        System.out.println("LinkedList: " + employee_2);
        System.out.println("Vector: " + employee_3);

        // Iterate over elements in the list

        System.out.println("Iterating over ArrayList:");
        for(String s : employee_1) {
            System.out.println(s);
        }

        System.out.println("Iterating over LinkedList:");
        for(String s : employee_2) {
            System.out.println(s);
        }

        System.out.println("Iterating over Vector:");
        for(String s : employee_3) {
            System.out.println(s);
        }

        // Get the size of each list

        int size_1 = employee_1.size();
        int size_2 = employee_2.size();
        int size_3 = employee_3.size();

        System.out.println("Size of ArrayList: " + size_1);
        System.out.println("Size of LinkedList: " + size_2);
        System.out.println("Size of Vector: " + size_3);

        // Clear the lists

        employee_1.clear();
        employee_2.clear();
        employee_3.clear();

        // Verify lists are cleared

        System.out.println("Cleared ArrayList: " + employee_1);
        System.out.println("Cleared LinkedList: " + employee_2);
        System.out.println("Cleared Vector: " + employee_3);
    }
}
