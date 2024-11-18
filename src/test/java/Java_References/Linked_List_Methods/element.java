package Java_References.Linked_List_Methods;

import java.util.LinkedList;

public class element
{
    public static void main(String[] args)
    {

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Retrieving the head element using element()
        String head = list.element();
        System.out.println("Head element: " + head); // Output: Apple

        // The list remains unchanged
        System.out.println("LinkedList: " + list); // Output: [Apple, Banana, Cherry]

        // Using element() on an empty list
        list.clear();

        try
        {
            head = list.element(); // This will throw a NoSuchElementException
        } catch (java.util.NoSuchElementException e)
        {
            System.out.println("The list is empty!");
        }


    }


}
